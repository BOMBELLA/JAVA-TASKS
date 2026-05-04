import java.util.Scanner; 


       public class PrimeFactor{

              public static void main(String[] args){

              Scanner userInput = new Scanner(System.in);

              System.out.println("Enter a prime factor:");

              int prime = userInput.nextInt();

              int sum = 0;
              
              int count = 2;


  for(count = 2; count <= prime;){

       if(prime % count == 0){

   prime = prime / count;

          sum += count; 
              
                }
              
       else{
             count++;
               }       

       System.out.println(sum);


}
}
}








  // while(sum > prime){

       //System.out.println("Enter number to sum:");

        //          }   }
                     
      //int total = userInput.nextInt();


          //  sum += total;

       
              //}
   //  System.out.println(sum);
      

                  



       
           

      // while(sum > prime){

       //System.out.println("Enter number to sum:");

        //          }   }
                     
      //int total = userInput.nextInt();


          //  sum += total;

       
              //}
   //  System.out.println(sum);
      

                  
              








                //int prime = 2;
       
              //int counter = 1;

       //for(counter = 1; counter <= prime; counter++){

           //if(prime % 2 == 0)


                            









// while(sum > prime){

       //System.out.println("Enter number to sum:");

        //          }   }
                     
      //int total = userInput.nextInt();


          //  sum += total;

       
              //}
   //  System.out.println(sum);
      

                  























