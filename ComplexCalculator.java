//Jackie Wolf SI 543 Assignment #1
//Worked with Sybil Boone, Lily Samimi, and Michelle Fiesta


package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtracts d to current number
	public void subtract(double d){
		currentNumber = currentNumber - d;
	}
	
	// multiplies d to current number
	public void multiply(double d){
		currentNumber = currentNumber * d;
	}
		
	// divides d by a given number
	public void divide(double d){
		currentNumber = currentNumber / d;
	}
	
	// sets current number to 0
	public void clear(){
		currentNumber = 0;
	}
		
	// couldn't figure out how to do a loop! 
	// would love for the power loop to be shown in class!
	// raises current number to the power of a given number
	public void power(int d) {
		currentNumber = Math.pow(currentNumber, d);
		
	}
	
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	//  This returns true if it is a current number otherwise it returns false.
	public boolean isEven(){
		if(currentNumber % 2 == 0){
			return true;
		}
		else return false;
	}
	// TODO returns true is current number is even, false otherwise
	
	// isPrime()
	public boolean isPrime(){
		if(currentNumber % 2 ==0){
			return false;
		}
		if(currentNumber)
	}
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
}
