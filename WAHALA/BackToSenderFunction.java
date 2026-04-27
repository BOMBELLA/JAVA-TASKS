public class BackToSenderFunction{
     public static long getDailyWage(int successfulDeliveries){


              
              int  basePay = 5000;   
              long amountPerParcel = 0;

              if(successfulDeliveries < 50){
                amountPerParcel = 160;     
                 
              } 
                     
              if(successfulDeliveries <= 50 && successfulDeliveries >=  59){
                 amountPerParcel = 200;     
                 
              }
                
               if(successfulDeliveries <= 60 && successfulDeliveries > 69){
                amountPerParcel = 250;     

                }      
             

                if (successfulDeliveries > 70){
                         amountPerParcel = 500;

               } 
              long numberOfRidersDailyPayment = (amountPerParcel * successfulDeliveries) + basePay;

              return numberOfRidersDailyPayment;
              
       }
                     
 }























