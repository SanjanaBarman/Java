class Student{
	int roll;
	String name;
		
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
}

class Demo{
	public static void main(String [] args){
		Student s=new Student(11,"Sanjana");
		System.out.println(s);
	}
}