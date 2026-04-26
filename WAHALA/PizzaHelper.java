public class PizzaHelper{
       
       public static long getNUmberOfBoxes(long numberOfPeople, long numberOfSlices){
              long numberOfBoxes ;
              if(numberOfPeople % numberOfSlices != 0 ){
                     return numberOfBoxes = (numberOfPeople / numberOfSlices) + 1 ;
              }else{
                     return numberOfBoxes = (numberOfPeople / numberOfSlices);
                                          
              }
              
       }      

        public static long getnumberOfLeftovers(long numberOfBoxes,  long numberOfSlices, long numberOfGuests){
                long total = (numberOfBoxes * numberOfSlices);
                long numberofLeftovers =  total - numberOfGuests ;
                return numberofLeftovers;
        }


}
