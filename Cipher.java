
/*Bhavya Kella
 Programming fundamentals
Summer
Programming Assignment 1
*/
import java.util.Random; // import Random Class
import java.util.Scanner;// import Scanner Class
public class Cipher{

   public static void main(String[] args){
	   
      Random rand = new Random();    //Creating random object
	  
      int key = rand.nextInt(10);   //random key 0 to 10
	  
      int [] digits = new int[5];    //initialize the array object to 5
      
      Scanner sc = new Scanner(System.in);    //Creating Scanner object
      
      System.out.println("CPSC 501");
      System.out.println("NAME: Bhavya Kella");
      System.out.println("PROGRAMMING ASSIGNMENT 1");
      System.out.println("Welcome to the Cipher program");
     
      System.out.println("Please enetr 5 numbers beween 0 and 19"); //scanning numbers one by one and store them into array 
	   
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
      
     
      int total = 0;   //declare and initialize sum variable to 0
      for (int i = 0; i<5; i++){   //use for loop to check for 0 less than and 19 greater than values.
    	  
    	
          if (digits[i] < 0 || digits[i] > 19){   //if condition true then terminate the program  
             System.out.println("Please read instructions and try again");
             System.exit(1);   //terminate program if condition true
          } 
          total = total + digits[i];
      }
      
      
      System.out.println("Total = " + total);   //print sum of numbers
      
     
      System.out.println("Your random key is " + key);   //print key 
    
      
      int first,last;   //declare first and last variables
      first = total/10;   // separating the digits  
      last = total%10;
        
     
      first = first + key;   //Encrypting
      last = last + key;
      first = first%10;
      last = last%10;
        
     
      System.out.println("The Encoded number is : "+first+last);   //combining and displaying Encrypted digits
        
      }
    
 }


