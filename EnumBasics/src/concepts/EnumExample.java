package concepts;

class Year{
	Month m ;
	Year(Month m){
		this.m = m;
	}
	@Override
	public String toString() {
		return "Year [m=" + m + "]";
	}
	
}
public class EnumExample {
	public static void main(String[] args) {
		Year year = new Year(Month.MAR);
		System.out.println(year);
		switch(year.m) {
		case JAN:
			System.out.println("Its Janruary Month..");
			break;
		case MAR:
			System.out.println("Its a March Month..");
			break;
		}
	}
}
