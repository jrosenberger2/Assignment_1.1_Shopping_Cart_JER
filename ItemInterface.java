/**
 * ItemInterface.java describes the operations of an Item object
 * @author Jared Rosenberger
 * @version 11/09/22
 * ItemInterface.java
 * Fall 2022
 */
public interface ItemInterface {
	//Accessors and Mutators
	/**
	 * 
	 * @param price the value of price as passed into setPrice()
	 */
	public void setPrice(Double price);
	/**
	 * 
	 * @return the price of the current Item
	 */
	public Double getPrice();
	/**
	 * 
	 * @param name the value of name as passed into SetName()
	 */
	public void setName(String name);
	/**
	 * 
	 * @return the name of the current Item
	 */
	public String getName();
	/**
	 * 
	 * @param department the value of department as passed into setDepartment()
	 */
	public void setDepartment(String department);
}//end ItemInterface.java