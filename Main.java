import java.util.Scanner;
/**
 *Prints Factors 
 * @author Tolga Nurtekin
 */
public class Main {

  public static void factors(int integer){
    //create a loop to see factors
    for(int i = 1; i <= integer; i++){
     if(integer % i == 0){
       System.out.println(i);
     }
    
    }
  }
  
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for integer
    System.out.println("Enter Number");
    //declare a variable for users Number
    int integer = input.nextInt();
    factors(integer);


    
    
  }
}
