/**
 * This class holds information for a single
 * grocery store item. This include name, weight, price
 * and unit pricing information
 * 
 * @author L. Lehmann
 * @version v1
*/

public class GroceryItem
{
    //this first field is the constant for conversion between
    //ounces and pounds
    private final double OZ_PER_POUND = 16;
    
    //the following fields are all about a single grocery item
    private String itemName;
    private double price;
    private double weightInPounds;
    private double weightInOz;
    private double pricePerPound;
    private double pricePerOz;
    
    /**This default or no-args constructor allows the construction
    *of a GroceryItem when the details are not yet known
    */
    public GroceryItem( )
    {
        itemName = "unknown";
        price = weightInPounds = weightInOz = pricePerPound = pricePerOz =0;
    }
    
    /** This constructor allows the user of this class to create
    * an instance of a GroceryItem when they know the name, weight and 
    * price of the item
    * @param String, the name of the product
    * @param double the weight of the product in pounds
    * @param double the price of the item 
    */
    public GroceryItem(String inName, double inWtInLbs, double inPrice)
    {
        itemName = inName;
        weightInPounds = inWtInLbs;
        price = inPrice;
        weightInOz = weightInPounds * OZ_PER_POUND;
        pricePerPound = price/weightInPounds;
        pricePerOz = price/weightInOz;
    }
    
    /** This set method allows the user of this class to change the name of
    * an exisiting GrocereyItem object
    * @param the new name of the item
    */
  
    public void setItemName(String inName)
    {
        itemName = inName;
    }
    
    /** This set method allows the user to change the price of an
    * exisiting GroceryItem object. Notice, when the price changes
    * the unit costs MUST also be recalculated.
    * @param a double holding thre new price of the item
    */
    public void setPrice(double inPrice)
    {
        price = inPrice;
        pricePerPound = price/weightInPounds;
        pricePerOz = price/weightInOz;
    }
    
    
    /**This set method allows the user to change the number of ounces of an
    * exisiting GroceryItem object. Notice, when the ounces change
    * the weight in pounds and the unit costs are then recalculated.
    * @param a double for the new weight of the product in ounces
    */
    public void setWeightInOz(double inOz)
    {
        weightInOz = inOz;
        weightInPounds = weightInOz/OZ_PER_POUND;
        pricePerPound = price/weightInPounds;
        pricePerOz = price/weightInOz;
    }
    
    /** This set method allows the user to change the number of pounds of an
    * exisiting GroceryItem object. Notice, when the pounds change
    * the weight in ounces and the unit costs MUST also be recalculated.
    * @param a double for the new weight of theproduct in pounds
    */
    public void setWeightInPounds(double inLBS)
    {
        weightInPounds = inLBS;
        weightInOz = weightInPounds * OZ_PER_POUND;
        pricePerPound = price/weightInPounds;
        pricePerOz = price/weightInOz;
    }
    
    //the following get methods are self-explanitory. 
    //Since the fields are all in the "inner circle"
    //there is no way to see or obtain their values without
    //these public get( ) methods in the outer cirle
    /** This method returns the name of the product
     * @return String- the name of the grocery item
     */
    public String getItemName( )
    {
        return itemName;
    }
    
    /** This method returns the price of the product
     * @return double- the price of the grocery item
     */
    public double getPrice( )
    {
        return price;
    }
    
    
    /** This method returns the weight of the product
     * @return double- the weight of the grocery item in ounces
     */
    public double getWeightInOz( )
    {
        return weightInOz;
    }
    
    
    /** This method returns the weight of the product
     * @return double- the weight of the grocery item in pounds
     */
    public double getWeightInPounds( )
    {
        return weightInPounds;
    }
    
    /** This method returns the weight of the product
     * @return double- the price per ounce of the grocery item
     */
    public double getPricePerOz( )
    {
        return pricePerOz;
    }
    
    /** This method returns the weight of the product
     * @return double- the price per pound of the grocery item
     */
    public double getPricePerPound( )
    {
        return pricePerPound;
    }
    
    //The toString( ) method is a VERY useful method.
    //It is used to return a textual representation of
    //an object of the GroceryItem class.
    //I simly concatenated labels and field values
    //in a String and returned a reference to that String
    /** This method creates and returns  a String
     * with labels and the values of the GroceryItem name,
     * price, price per pound and price per ounce
     */
    public String toString( )
    {
        return "Item: " + itemName
              + "\nPrice: " + price
              + "\nPrice per pound: " + pricePerPound
              + "\nPrice per ounce: " + pricePerOz;
    }
}//end of GroceryItem class definition
