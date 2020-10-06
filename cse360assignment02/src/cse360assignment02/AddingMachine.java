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
	 */
  private int total;
  
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
	   * @return int this returns 0 so far 
	   */
    return 0;
  }
  
  public void add (int value) {
	  /**
	   * Declares public void add and gives 
	   * it access to int value. This will be 
	   * the area used to put code in order to 
	   * add any numbers together. 
	   */
  }

  public void subtract (int value) {
	  /**
	   * Declares public void subtract and gives 
	   * it access to int value. This will be 
	   * the area used to put code in order to 
	   * subtract any numbers. 
	   */
  }

  public String toString () {
	  /**
	   * Declares public String called toString
	   * This will be used later to return any
	   * history
	   * 
	   * @return string this is used to return 
	   * the final string that is in between the 
	   * ""
	   */
    return "";
  }

  public void clear() {
	  /**
	   * Declares public void clear and is simply 
	   * used to clear our memory when needed.
	   */
  }
}