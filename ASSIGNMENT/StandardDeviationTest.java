import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testForTheSumOfMeanInTheGivenNumbers(){

        int [] numbers = {2,4,1,3,2,6};
        int expectedAverage = 3;
        int actualAverage = StandardDeviation.geTheMeanInTheGivenNumbers(numbers);
        assertEquals(actualAverage, expectedAverage);
    } 
