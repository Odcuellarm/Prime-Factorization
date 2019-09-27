import java.util.*;

public class primeFactorization{
   
   public static void main(String []args){
   
   int userInput;
   
   //Prompts the user to type the number to be factorized
   Scanner in = new Scanner(System.in);
   System.out.print("I want to factorize ");
   userInput = in.nextInt(); 
   
   factorization(userInput);
   
   }//End of Main method
  
   
   public static void factorization(int number){  
   
      //select a prime factor
      List <Integer> primeFactors = new ArrayList<Integer>();
     
      int remaining; 
      int currentFactor;
      int total = 0; 
      
      //check for prime factor
      if(number > 1){
         
         //the user input is stored in an internal variable 
         remaining = number;
         
         for(int i = 2; i <= remaining ; i++){
                     
            currentFactor = i; 
            if((remaining % currentFactor) == 0){
               do{
                  
                  total += currentFactor;
                  primeFactors.add(currentFactor); 
                  remaining= remaining / currentFactor; 
                  
               } while ((remaining % currentFactor) == 0);
            }//End of if
            
         }//End of for loop  
      }//End of outer if 
   
   System.out.print("The prime factors of " + number + " are: ");   
   System.out.println(Arrays.toString(primeFactors.toArray()));
   System.out.println("The sum of the prime factors is: " + total);
   
   }//End of factorization method
   
}//End of class
