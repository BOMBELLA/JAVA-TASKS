public class StandardDeviationFunction{

            public static void main(String [] args){
//
//        int [] numbers = {2,4,1,3,2,6};
//
//        int result =  sumOfMeanInTheGivenNumbers(numbers);
//
//              System.out.println(result);      
       }


       public static int meanInTheGivenNumbers(int [] numbers){
              int  sumOfNumbers = 0;
              int mean = 0;
              int count = 0;

              for(count = 0; count < numbers.length; count++){

                     sumOfNumbers += numbers[count];
                     mean = sumOfNumbers / count;
          }    
        return mean;      
        }


       public static int sumOfGivenNumbers(int [] numbers){
              int  sumOfNumbers = 0;
              int count = 0;

            for(count = 0; count < numbers.length; count++){

                   sumOfNumbers += numbers[count];
              

       }
      return sumOfNumbers;                    

       }

     

       public static int [] substractMeanFromEachValue(int [] numbers){

              int mean = 3;
//               int  substraction = 0;
//
//              int substractMeanFromEachValue = 0;
//
               int count = 0;

              int [] result = new int[numbers.length];

              for(count = 0; count < numbers.length; count++){

               result[count] = numbers[count] - mean;

//         substractMeanFromEachValue = mean - numbers[count];


              
       }
       return result;
}

































}
