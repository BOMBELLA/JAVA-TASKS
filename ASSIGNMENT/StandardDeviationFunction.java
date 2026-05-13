public class StandardDeviationFunction{

       public static void main(String [] args){

        int [] numbers = {2,4,1,3,2,6};

        int result =  sumOfMeanInTheGivenNumbers(numbers);

              System.out.println(result);      
       }


       public static int SumOfMeanInTheGivenNumbers(int [] numbers){
              int  sumOfMean = 0;

              for(int count = 0; count < numbers.length; count++){

                     sumOfMean += numbers[count];
              }

        return sumOfMean;      
        }















































}
