import java.util.Scanner;
import java.time.LocalDate;
public class MensturalApp{

       public static void main(String[] args){

              Scanner userInput = new Scanner(System.in);
              
              System.out.println("When did you see your last period ?");
              System.out.println("Input the current year");
              int year = userInput.nextInt();

              System.out.println("Input the current month");               
              int month = userInput.nextInt();
              
              System.out.println("Input the current day");       
              int day = userInput.nextInt();
              

              System.out.println("What is the length of your cycle ?");
              int cycleLength = userInput.nextInt();
              


              LocalDate lastPeriodDate = LocalDate.of(year,month,day);

              if (lastPeriodDate.isBefore(LocalDate.now())){


                     LocalDate nextPeriodDate = MenstrualAppHelper.getNextPeriodDate(lastPeriodDate, cycleLength);

                     System.out.println("Your last period date was:" + MenstrualAppHelper.displayDate(lastPeriodDate));

                     System.out.println("Your next period date is:" + MenstrualAppHelper.displayDate(nextPeriodDate));               
                          

                     LocalDate ovulationDayEstimate = MenstrualAppHelper.getOvulationDayEstimate(nextPeriodDate);

                     System.out.println("Your ovulation date is:" + MenstrualAppHelper.displayDate(ovulationDayEstimate)); 

                     LocalDate fertileWindowStart = MenstrualAppHelper.getFertileWindowStart(ovulationDayEstimate);
              
                     System.out.println("Your fertile window starts:" + MenstrualAppHelper.displayDate(fertileWindowStart)); 

                     LocalDate periodEndDate = nextPeriodDate.plusDays(5);

                     LocalDate safePeriod = MenstrualAppHelper.getSafePeriod(periodEndDate);              

                     System.out.println("Your safe period starts:" + MenstrualAppHelper.displayDate(safePeriod));
                                                                                       
              }else{

                     System.out.println("Please enter a valid date");
              }

                                    
                          
               





              
              















       }


}





















       

