import java.util.Scanner;
/**
 * This class has the main( ) method.
 * It creates an instance of the UnitGroceryItem
 * class and then presents the user with a menu
 * to change the weight or the price. Each
 * time a change is made the program prints
 * the state of the UnitPrice object.
 * 
 * @author L. Lehmann 
 * @version v1
 */
public class DriverUntitPrice
{
   public static void main(String[ ] args)
   {
   //declare local vaiables in main( )
   //these are NOT fields. They are variable
   //declared inside a method
   GroceryItem product; //delcare a reference variable
   double cost;//will be input by user
   double weightInPounds; //will be input by user
   char menuChoice; //to hold user choice when presnted the menu
   String name; //will be input by user
   Scanner in = new Scanner(System.in); //Scanner object created
   
   //read in data for the object's creation
   System.out.print("Enter the name of the product: ");
   name = in.nextLine( );
   System.out.print("Enter the original weight in pounds: " );
   weightInPounds = in.nextDouble( );
   System.out.print("Enter the original price: ");
   cost = in.nextDouble( );
   
   //create the object using the constructor that accepts three arguments
   product = new GroceryItem(name,weightInPounds,cost);
   //print the state of the original object
   System.out.println(product.toString( ) );
   
   //present a menu for user to make changes in the product
   System.out.print("\n\t\tP:to change the price " +
                          "\n\t\tW: to change the weight " +
                          "\n\t\t   Enter your choice: ");
   menuChoice = in.next( ).charAt(0);
   
   //process the choice in a loop
   do
   { 
       if(menuChoice == 'P' || menuChoice == 'p')
       {
           System.out.print("Enter the new price of " +
                             product.getItemName( ) + ": ");
           cost = in.nextDouble( );
           product.setPrice(cost);
        }
        else if(menuChoice == 'W' || menuChoice == 'w')
        {
            System.out.print("Enter the new weight in pounds of " +
                             product.getItemName( ) + ": ");
           weightInPounds = in.nextDouble( );
           product.setWeightInPounds(weightInPounds);
        }
        System.out.println("Item has been updated to:");
        System.out.println(product.toString( ) );
        
        //ALWAYS update the condition of the loop as the last
        //part of the loop!
        System.out.print("\n\n\t\tP:to set the price " +
                          "\n\t\tW: to set the weight " +
                          "\n\t\tQ: to quit " +
                          "\n\t\t   Enter your choice:  ");
         menuChoice = in.next( ).charAt(0);
        }while(menuChoice != 'Q' && menuChoice != 'q');
       //print a good-bye message so user know program is over
       System.out.println("End of invevntory update");
   }//end of main method
}//end of driver class
