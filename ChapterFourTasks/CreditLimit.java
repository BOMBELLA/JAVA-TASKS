
import java.util.Scanner;
public class CreditLimit{

       public static void main(String[] args){

       Scanner userInput = new Scanner(System.in);
       System.out.println("Enter your account number");

       int accountNumber = userInput.nextInt();

       System.out.println("Enter yout beginning balance");

       int beginningBalance = userInput.nextInt();
       
       System.out.println("Enter your charges");
       int charges = userInput.nextInt();
       
       System.out.println("Enter your credit");
       int credit = userInput.nextInt();

       int  newBalance = beginningBalance + charges - credit;
       System.out.println(newBalance);

                                                                                                                                                                                                                                                                       






}

}
