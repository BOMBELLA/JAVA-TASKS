import java.time.LocalDate;
public class MenstrualAppHelper{


       public static LocalDate getNextPeriodDate (LocalDate lastPeriodStartDate, int cycleLength){
               LocalDate nextPeriodDate = lastPeriodStartDate.plusDays(cycleLength);

                     return nextPeriodDate;       
       }
              

       public static LocalDate getPeriodEndDate (LocalDate periodStartDate, int periodLength){      
               LocalDate periodEndDate = periodStartDate.plusDays(periodLength - 1);     
              
                     return periodEndDate;

      }      

      public static LocalDate getOvulationDayEstimate (LocalDate periodStartDate){
             LocalDate ovulationDate = periodStartDate.minusDays(14); 

                    return ovulationDate;
      }
       

       public static LocalDate getFertileWindowStart (LocalDate ovulationDate){
              LocalDate fertileWindowStart  = ovulationDate.minusDays(5); 

                   return fertileWindowStart;
       }


       public static LocalDate getSafePeriod (LocalDate periodEndDate){
              LocalDate safePeriod = periodEndDate.minusDays(8);

                  return safePeriod;     
       

       }
       


       public static String displayDate(LocalDate anyDate){

              return anyDate.getDayOfMonth() +"/" +  anyDate.getMonth() +"/" + anyDate.getYear();
              
       }
               





}
