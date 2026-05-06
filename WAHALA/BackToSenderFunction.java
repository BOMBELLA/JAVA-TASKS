public class BackToSenderFunction{
     public static int getDailyWage(int successfulDeliveries){


              
              int  basePay = 5000;   
              int amountPerParcel = 0;

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
              int numberOfRidersDailyPayment = (amountPerParcel * successfulDeliveries) + basePay;

              return numberOfRidersDailyPayment;
              
       }
                     
 }























