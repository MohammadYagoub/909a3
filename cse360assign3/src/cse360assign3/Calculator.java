package cse360assign3;

public class Calculator {

	private int total;
	
	/** creates a constructor of Calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** returns total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/** adds value to total
	 * @param value to be added
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/** subtracts value from total
	 * @param value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** multiplies total by value
	 * @param value to be multiplied by
	 */
	public void multiply (int value) { 
		total = total * value;
	}
	
	/** divides total by value
	 * @param value to be divided by
	 */
	public void divide (int value) { 
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/** returns empty string
	 * @return empty string
	 * 
	 */
	public String getHistory () {
		return "";
	}
}
