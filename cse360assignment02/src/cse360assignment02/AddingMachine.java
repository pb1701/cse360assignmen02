/**
*  The AddingMachine program implements the code to create 
*  a program that is a calculator that can add and subject 
*  numbers and then give the current total.
*  
*  A history of transactions will be kept and returned by the 
*  toString method
*  
*  The toString method will return 0 + 4 – 2 + 5
*
* @author Peyton Briere
*
*/

package cse360assignment02; 
/**
 * Organizes all the related classes for AddingMachine
 * under one package called cse 360assignment02
 *
 */

public class AddingMachine { 
	/**
	 * Declares public class AddingMachine
	 * which holds the private integer
	 * called total
	 * 
	 * I have now included a private string
	 * called HISTORY which starts with 0 and 
	 * then has each number needed added or 
	 * subtracted as it goes on to give us the final
	 * string result we need
	 */
  private int total;
  private String HISTORY = "0";
  
  public AddingMachine () {
    /**
     * Declares public member AddingMachine
     * which holds the integer total
     * and sets it equal to 0
     */
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
	  /**
	   * Declares public integer getTotal
	   * and would hold the code to gather the 
	   * total number from AddingMachine
	   * 
	   * @return int this returns the total of
	   * the calculation
	   */
    return total;
  }
  
  public void add (int value) {
	  /**
	   * Declares public void add and gives 
	   * it access to int value. This will be 
	   * the area used to put code in order to 
	   * add any numbers together. 
	   * 
	   * I have total as += which means to add the value
	   * in this case being +4 and then +5 at the end 
	   * which is in the Main.java file
	   * 
	   * I also added HISTORY which is += and this is to add
	   * the the value and whatever was done to it to the 
	   * string. In this case + 4 and then + 5 at the end 
	   * after subtracting 2.
	   */
	  
	   total+=value;
       HISTORY+=" + "+value;
  }

  public void subtract (int value) {
	  /**
	   * Declares public void subtract and gives 
	   * it access to int value. This will be 
	   * the area used to put code in order to 
	   * subtract any numbers. 
	   * 
	   * I have total as -= which means to subtract the value
	   * in this case being 2 which is in the Main.java 
	   * file
	   * 
	   * I also added HISTORY which is += and this is to add
	   * the the value and whatever was done to it to the 
	   * string. In this case - 2
	   */
	  
	   total-=value;
       HISTORY+=" - "+value;
  }

  public String toString () {
	  /**
	   * Declares public String called toString
	   * This will be used later to return any
	   * history
	   * 
	   * @return string HISTORY+ this is used to return 
	   * the final string HISTORY+ that is in between the 
	   * "". Which should give us 0 + 4 - 2 + 5
	   * 
	   */
    return HISTORY+ "";
  }

  public void clear() {
	  /**
	   * Declares public void clear and is simply 
	   * used to clear our memory when needed.
	   */  
  }
}