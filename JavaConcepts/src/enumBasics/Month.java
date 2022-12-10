package enumBasics;

/*
 * Enum is converted to class in background which has static final objects of itself
 * class Month{
 * 	static final Month JAN = new Month();
 * 	static final Month FEB = new Month();
 *  static final Month MAR = new Month();
 *  ....
 *  Month(){
 *  	this.maxTemp=28;
 *  }
 *  Month(int x){
 *  	this.maxTemp = x;
 *  }
 *  int maxTemp;
 *  int getMaxTemp(){
 *  	return maxTemp;
 *  }
 * }
 * Enum can have instance values and methods and constructors also
 * Parameterised Constructors can be called by passing values like 
 * JAN(30),FEB(28)....
 * The enum Fields should be declared after the constants declaration
 */
public enum Month {
//	int maxTemp;   throws Compile time error
	JAN(30),FEB,MAR(42),APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC;
	private int maxTemp;
	Month(){
		maxTemp=25;//Default Values
	}
	Month(int temp){
		this.maxTemp=temp;
	}
	int getMaxTemp() {
		
		return this.maxTemp;
	}
}
