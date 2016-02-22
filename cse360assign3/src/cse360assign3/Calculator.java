package cse360assign3;

/** this class creates a calculator that adds, subtracts,
 * multiplies, divides, and keeps a history of operations. 
 * @author Mohammad Yagoub
 * Pin: 909
 * Version 02-22-2015
 */

public class Calculator {

	private int total;
	private String history;
	/** creates a constructor of Calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/** returns total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/** adds value to total and updates history
	 * @param value to be added
	 */
	public void add (int value) {
		total = total + value;
		
		history = history + " + " + value;
	}
	
	/** subtracts value from total and updates history
	 * @param value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		
		history = history + " - " + value;
	}
	
	/** multiplies total by value and updates history
	 * @param value to be multiplied by
	 */
	public void multiply (int value) { 
		total = total * value;
		
		history = history + " * " + value;
	}
	
	/** divides total by value and updates history
	 * @param value to be divided by
	 */
	public void divide (int value) { 
		if (value == 0)
			total = 0;
		else
			total = total / value;
		
		history = history + " / " + value;
	}
	
	/** returns a string that shows all the operations done
	 * @return history of operation
	 * 
	 */
	public String getHistory () {
		return history;
	}
}
