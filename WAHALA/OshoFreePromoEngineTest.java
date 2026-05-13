import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OshoFreePromoEngineTest{

              @Test
    public void testEachDiscountTier(int carTotal, String promoCode)(){
              //Given

             int discountAmount = 5000;

              //When
		int expectedcartTotal = OshoFreePromoEngineFunction.getcartTotal(int carTotal, String promoCode);

		//check
		int expectedcartTotal = 4950;
		assertEquals(actualcartTotal, expectedcartTotal);
	 



       




}
}
