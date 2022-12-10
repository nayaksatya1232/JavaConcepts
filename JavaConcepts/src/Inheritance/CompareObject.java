package Inheritance;

public class CompareObject {
//	OBJECT--->STUDENT && RELATABLE---->STUDENT
//	1st Student upcasted to Object then 
//	Object obj1 having studnet class Object casted to Relatable type
	
	static Object larger(Object obj1, Object obj2) {
		Relatable r1 = (Relatable) obj1;
		Relatable r2 = (Relatable) obj2;
		if (r1.isLargerThan(r2) > 0)
			return r1;
		else
			return r2;
	}

	static Object smaller(Object obj1, Object obj2) {
		Relatable r1 = (Relatable) obj1;
		Relatable r2 = (Relatable) obj2;
		if (r1.isLargerThan(r2) < 0)
			return r1;
		else
			return r2;
	}

	static boolean isEqual(Object obj1, Object obj2) {
		Relatable r1 = (Relatable) obj1;
		Relatable r2 = (Relatable) obj2;
		if (r1.isLargerThan(r2) == 0)
			return true;
		else 
			return false;
	}
}
