class Car{
	int wheel;
	String model;
	void start(){
		System.out.println(this);
		System.out.println("Car is starting");
	}
}

class Sports extends Car{
	void start()
	{
	System.out.println(this);
	//System.out.println();
	}
	public static void main(String[] args){
		Car ob=new Sports();
		ob.model="21x";
		ob.start();
	}
	
}