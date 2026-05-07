

//       pseudocode (add to integers):
//       - initialize the method body that takes two variables
//       - sum the two variables and assign to another variable - result
//       - return result
//
//
//public class CountMost{
//
//
//       public static void main(String[] args){  
//              System.out.println(sum(2,5));
//       }      
//
//       public static int sum(int num1, int num2){
//              int result = num1 + num2;
//              return result;
//       }
//}






//public class CountMost{
//
//       public static void main(String[]args){
//              System.out.println(substraction(10,5));
//       }
//
//
//       public static int substraction(int numberOne, int numberTwo ){
//
//              int result = numberOne  - numberTwo;
//                     return result;
//
//       } 
//
//}
//public class CountMost{
// public static void main(String [] args){
//System.out.println(multiply(10,2));
//
//}
//
//public static int multiply(int numOne,int numTwo){
//       int result =  numOne * numTwo;
//
//       return result;
//
//
//   }
//
//
//
// }
//
//
//
//- PSCODE(Count most occured)
//- initialize the count that counts the most occured
//-  initialize the result
//-  using a loop 
//-  nexted for loop to count the numbers
//-  use a conditional statement to compare
public class CountMost{
       public static void main(String[] args){
       int[] input = {1,5,5,6,4,8};
       System.out.println(getCountOfMostOccured(input));
}

public static int getCountOfMostOccured(int[] input){
int count = 0;
int most = 0;
//int [] input = {1,5,5,6,4};
for(int index = 0; index < input.length; index++){
       
       for(int second = 0;second < input.length; second++){
              if(input[index] == input[second]){
                 count++; 
              }  
       }          
       
       if(count > most){
               most = count;
       }
       count = 0;
  
}
              return most;
       

}
}
          
              
                     
     



       






































































