class ac{
	String customer;
	String ac_no;
	double balance;
	
	ac(String c,String a,double b){
		customer=c;
		ac_no=a;
		balance=b;
	}
	
	void diposit(double amount){
		balance=balance+amount;
		System.out.println("Amount of "+amount+" diposited successfully");
		System.out.println("Your updated balance is: "+balance);
	}
	
	void withdraw(double amount){
		if(amount>balance){
			System.out.println("Insufficient balance!!");
			return;
		}
		balance=balance-amount;
		System.out.println("Amount of "+amount+" withdrawal successfully");
		System.out.println("Your updated balance is: "+balance);
	}
}

class sav_ac extends ac{
	sav_ac(String c, String a,double b){
		super(c,a,b);
	}
	
	void cal_interest(int yr){
		double interest=0.06;//6% p.a.
		interest=(balance *(Math.pow((1+interest),yr))) - balance;
		System.out.println("You gained interest of :"+interest);
		System.out.println("Upadted balance with interest:"+ (balance+interest));
	}
}

class cur_ac extends ac{
	double min_bal=1000;
	double charge=100;
	cur_ac(String c, String a,double b){
		super(c,a,b);
	}
	
	void withdraw(double amount){
		if(balance<min_bal){
			System.out.println("You have not maintain minimum balance!!");
			System.out.println("Amount of :"+charge+ " will be deducted");
		}
		if(balance<amount){
			System.out.println("Insufficient balance!!");
		}
		else{
			balance=balance-amount;
			System.out.println("Amount of "+amount+" withdrawal successfully");
			System.out.println("Your updated balance is: "+balance);
		}
	}
}

class As4_3{
	public static void main(String [] args){
		System.out.println("1st Saving account details ---");
		sav_ac ac1= new sav_ac("Sanjana Barman","4900158203",10000);
		ac1.diposit(5000);
		ac1.withdraw(3000);
		ac1.cal_interest(2);
		
		System.out.println("___________________________________");
		
		System.out.println("2nd Current account details -----");
		cur_ac ac2= new cur_ac("Sathi Dutta","4900158204",100000);
		ac2.diposit(5000);
		ac2.withdraw(3000);
	}
}