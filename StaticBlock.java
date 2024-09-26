class Super{
	{
		System.out.println("1st Normal super block");
	}
	{
		System.out.println("2nd Normal super block");
	}
	static{
		System.out.println("1st Static super block");
	}
	static {
		System.out.println("2nd Static super block");
	}
	Super(){
		System.out.println("Constructor of super class");
	}
}
class Sub extends Super{
	{
		System.out.println("1st Normal sub block");
	}
	{
		System.out.println("2nd Normal sub block");
	}
	static{
		System.out.println("1st Static sub block");
	}
	static {
		System.out.println("2nd Static sub block");
	}
	Sub(){
		System.out.println("Constructor of sub class");
	}
}

class StaticBlock{
	public static void main(String[] args){
		new Sub();
		System.out.println();
		new Sub();
	}
}