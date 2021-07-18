
/*Bhavya Kella
 Programming fundamentals
Summer
Programming Assignment 1
*/
import java.util.Random; // import Random Class
import java.util.Scanner;// import Scanner Class
public class Cipher{

   public static void main(String[] args){
	   
	  //Creating random object
	  Random random = new Random();
	  
	  int rand = random.nextInt(10);
	  //initialize the array object to 5
      int [] digits = new int[5];
      //Creating Scanner object
      Scanner sc = new Scanner(System.in);
      
      System.out.println("CPSC 501");
      System.out.println("NAME: Bhavya Kella");
      System.out.println("PROGRAMMING ASSIGNMENT 1");
      System.out.println("Welcome to the Cipher program");
      
      //scanning numbers one by one and store them into array 
      System.out.println("Please enetr 5 numbers beween 0 and 19");
      System.out.print("1st number: ");
      digits[0] = sc.nextInt();
      System.out.print("2nd number: ");
      digits[1] = sc.nextInt();
      System.out.print("3rd number: ");
      digits[2] = sc.nextInt();
      System.out.print("4th number: ");
      digits[3] = sc.nextInt();
      System.out.print("5th number: ");
      digits[4] = sc.nextInt();
      
      //use for loop to check for 0 less than and 19 greater than values.
      int sum = 0;
      for (int i = 0; i<5; i++){
    	  
    	//if condition true then terminate the program  
          if (digits[i] < 0 || digits[i] > 19){
             System.out.println("Please read instructions and try again");
             System.exit(1);
          } 
          sum = sum + digits[i];
      }
      
      //print sum of numbers
      System.out.println("Total = " + sum);
      
      //print random number
      System.out.println("Your random key is " + rand);
    
      // separating the digits
      int first,last;
      first = sum/10;
      last = sum%10;
        
      //Encrypting
      first = first + rand;
      last = last + rand;
      first = first%10;
      last = last%10;
        
      //displaying Encrypted digits
      System.out.println("The Encoded number is : "+first+last);
        
      }
    
 }


