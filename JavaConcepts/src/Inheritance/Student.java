package Inheritance;

public class Student implements Relatable {
	int age;
	String name;

	Student(int age,String name){
		this.age = age;
		this.name= name;
	}
	@Override
	public int isLargerThan(Relatable obj) {
		Student std = (Student)obj;
		if(this.age<std.age)
			return -1;
		else if(this.age >std.age)
			return 1;
		
		return 0;
	}
	
}
