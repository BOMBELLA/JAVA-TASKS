
























import java.util.Scanner;

public class SpecifiedNumber{

    public static void main(String[] args){

       Scanner userInput = new Scanner(System.in);

  System.out.println("Enter the maximum number");

       int maxNo = userInput.nextInt();

       int sum = 0;
       
       while(sum < maxNo){

      System.out.println("Enter the number to sum");

       int total = userInput.nextInt();


              sum += total;

       
              }
   System.out.println(sum);
      

     































}
}

