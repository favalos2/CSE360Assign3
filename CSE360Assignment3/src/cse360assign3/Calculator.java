package cse360assign3;

/** description of this class is needed
 * @author Fernando Avalos       
 * @class CSE 360
 * @pin 112
 * @version feb 19, 2016
 */


/** This class mimics the arithmetic done by a calculator */
public class Calculator {

	private int total;
	private String history;
	/** This is the constructor */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = total + "";
	}
	
	/** this return the total
	 * @return the total amount (the total variable)
	 * */
	public int getTotal () {
		return total;
	}
	
	/** We are adding the total variable with the parameter
	 * @param value the value we will add to the total variable 
	 * */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/** We are subtracting the parameter from the total variable 
	 * @param value the value we will take from the total variable
	 * */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**we are multiplying the total by the total by the parameter
	 * @param value the value that will be multiplied by the total squared 
	 * */
	public void multiply (int value) {
		total = (total * total) * value; 
		history = history + " * " + value;		
	}
	
	/** we are dividing values together
	 * @param value
	 * */
	public void divide (int value) {
		
		if(value != 0){
			total = total / value;
		}
		else{
			total = 0;
		}
		
		history = history + " / " + value;
	}
	
	/** we are returning the history of what we have done
	 * @return */
	public String getHistory () {
		return history;
	}
}