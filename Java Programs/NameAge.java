import java.util.Scanner;
public class NameAge{
	public static void main(String[] args){
		Scanner inputName = new Scanner(System.in);
		System.out.print("What is your name?");
		String userInput = inputName.nextLine();
		System.out.print("What is your age?");
		int userAge = inputName.nextInt();
		System.out.printf("Hello %s I am %d years old",userInput,userAge);




}


}