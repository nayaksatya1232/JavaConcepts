package Inheritance;

public class RelatableTest {
	public static void main(String[] args) {
		Student std1 = new Student(25,"satya");
		Student std2 = new Student(22,"Rahul");
		System.out.println("SMALLER"+CompareObject.smaller(std1, std2).toString());
		System.out.println("BIGGER"+CompareObject.larger(std1, std2).toString());
		System.out.println("EQUALITY CHECK: "+CompareObject.isEqual(std1, std2));
	}
}
