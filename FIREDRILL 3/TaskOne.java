import java.util.Scanner;

public class TaskOne{


       public static void main(String[]args){
      Scanner userInput = new Scanner(System.in);

       int [] numbers = new int [10];

       for(int i = 0; i < 10; i++){

     System.out.println("Enter score :");

       int score = userInput.nextInt();

         
       numbers[i] = score;

}
    
           for(int i = 0;i < 10; i++){
            System.out.println(numbers[i] + " ");
}  



}

}

























