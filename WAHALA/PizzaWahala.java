import java.util.Scanner;

       public class PizzaWahala{

              public static void main(String[] args){

                     Scanner userInput = new Scanner(System.in);
       

                     System.out.println("""
           ======IYA ARAMIDE PIZZA HUT====== 
            Pizza Type       Number of Slices        Price per Box   
            1.Sapa Size            4                     #2500      
            2.Small Money          6                     #2900      
            3.Big Boy              8                     #4000                   
            4.Odogwu              12                     #5200 
                                                               """);
                     System.out.print("Enter number of guests: ");
                     long numberOfPeople = userInput.nextInt();
                     userInput.nextLine();
                     System.out.println();

                     System.out.println("Enter a pizza type: ");
                     String pizzaType = userInput.nextLine().toUpperCase();
                     long numberOfSlices =  0;
                     long price = 0;
                     

                     switch(pizzaType){
                            case "SAPA SIZE" -> {
                                   numberOfSlices = 4;
                                   price = 2500;

                                   long numberOfBoxes = PizzaHelper.getNUmberOfBoxes(numberOfPeople, numberOfSlices);
                                   long numberOfLeftovers = PizzaHelper.getnumberOfLeftovers(numberOfBoxes, numberOfSlices, numberOfPeople);
                                                 

                                   System.out.println("You will need "+ numberOfBoxes + " boxes of your order");
                                   System.out.println("Your leftovers would be " + numberOfLeftovers);
                            }

                             case "SMALL MONEY" ->  {
                                   numberOfSlices = 6;    
                                   price = 2900;

                                   long numberOfBoxes = PizzaHelper.getNUmberOfBoxes(numberOfPeople, numberOfSlices);
                                   long numberOfLeftovers = PizzaHelper.getnumberOfLeftovers(numberOfBoxes, numberOfSlices, numberOfPeople);       

                                   System.out.println("You will need "+ numberOfBoxes + " boxes of your order");    
                                   System.out.println("Your leftovers would be " + numberOfLeftovers);
                            }             
                                  

                             case "BIG BOY" ->    {
                                   numberOfSlices = 8;
                                   price = 4000;
                                   
                                   long numberOfBoxes = PizzaHelper.getNUmberOfBoxes(numberOfPeople, numberOfSlices);
                                   long numberOfLeftovers = PizzaHelper.getnumberOfLeftovers(numberOfBoxes, numberOfSlices, numberOfPeople);       

                                   System.out.println("You will need "+ numberOfBoxes + " boxes of your order");
                                   System.out.println("Your leftovers would be " + numberOfLeftovers);
                            }

                            
                                         
                             case "ODOGWU" ->   {
                                   numberOfSlices = 12;
                                   price = 5200;

                                   long numberOfBoxes = PizzaHelper.getNUmberOfBoxes(numberOfPeople, numberOfSlices);
                                   long numberOfLeftovers = PizzaHelper.getnumberOfLeftovers(numberOfBoxes, numberOfSlices, numberOfPeople);
                                   System.out.println(numberOfLeftovers);       

                                   System.out.println("You will need "+ numberOfBoxes + " boxes of your order");
                                   System.out.println("Your leftovers would be " + numberOfLeftovers);
                            }
                            

                            default -> System.out.println("Unknown pizza type");

                       }
                       
                       
                       
       


















              
              



















       }

  }
