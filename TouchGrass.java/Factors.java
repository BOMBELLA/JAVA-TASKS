import java.util.Scanner;

       public class Factors{


       public static void main(String[] args){



        Scanner factor = new Scanner(System.in);



        System.out.print("Enter a factor: ");


        int userInput = factor.nextInt();

        for(int number = 1; number <= userInput; number++){

            if (userInput % number == 0){

                System.out.print(number + "," );
            }
            
        }
}    }
