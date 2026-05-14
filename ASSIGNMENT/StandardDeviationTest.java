import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

//    @Test
//    public void testForTheMeanInTheGivenNumbers(){
//
//        int [] numbers = {2,4,1,3,2,6};
//        int expectedAverage = 3;
//        int actualAverage = StandardDeviationFunction.meanInTheGivenNumbers(numbers);
//        assertEquals(actualAverage, expectedAverage);
//       } 
//
//
//     @Test
//     public void testForTheSumOfGivenNumbers(){     
//
//       int [] numbers = {2,4,1,3,2,6};
//       int expectedLength = 18;
//       int actualLength = StandardDeviationFunction.sumOfGivenNumbers(numbers);
//       assertEquals(actualLength, expectedLength);
//      }

        @Test
        public void testTosubstractMeanFromEachValue(){


       
       int [] numbers = {2,4,1,3,2,6};

       int [] expectedLength = {-1,1,-2,0,-1, 3};
//       int expectedLength = {1, -1, 2, 0,1, -3};
       int [] actualLength = StandardDeviationFunction.substractMeanFromEachValue(numbers);
       assertArrayEquals(actualLength, expectedLength); 

       }    

}







//}
