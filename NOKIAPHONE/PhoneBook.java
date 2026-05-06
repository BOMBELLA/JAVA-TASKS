import java.util.Scanner;

public class PhoneBook{

       public static void main(String[] args){

              Scanner input = new Scanner(System.in);
    
                     
                            
                        while(true){
                      System.out.print("""
                    ====== WELCOME TO NOKIA 3310 =======
                     1.Phonebook
                     2.Messages
                     3.Chat                 
                     4.Callregister    
                     5.Tones
                     6.Settings
                     7.Call divert
                     8.Games
                     9.Calculator
                     10.Remainders
                     11.Clock
                     12.Profiles
                     13.SIMservices
                     0. back
                     """);
                   
             
        
                     System.out.println("Enter 1 to access other features");
                     
                     int mainMenuUserChioce = input.nextInt();
                     if(mainMenuUserChioce == 0){
                            break;
}

                            switch(mainMenuUserChioce){

                                   case 1-> {
                                          while(true){
                                          System.out.println("""
                                          ===== PHONEBOOK=====

                                           1.Search
                                           2.Service Number
                                           3.Add name
                                           4. Erase
                                           5. Edit
                                           6. Assign tone
                                           7. Send birthday card
                                           8. Options
                                           9. Speed dials
                                           10. Vioce tags  
                                             0.back                                          
                                              """);              
                                   System.out.println("Enter a number: ");
                                   int phoneBook = input.nextInt();
                                    if(phoneBook == 0){
                                          break;                            
                                          }
                                    
                                   switch(phoneBook){

                                   case 1-> System.out.println("Search");
                                   case 2-> System.out.println("Enter Service Number....");
                                   case 3-> System.out.println("Add name");      
                                   case 4-> System.out.println("Erase");
                                   case 5-> System.out.println("Edit");
                                   case 6-> System.out.println("Assign tone");
                                   case 7-> System.out.println("Send birthday card");
                                   case 8-> {

                                                 while(true){
                                             System.out.println("""

                                                 OPTIONS
                                              1-> Types of Views
                                              2-> Memory Status
                                              0-> back;
                                                 """);
                                              System.out.print("Enter a number ");
                                              int Options = input.nextInt();
                                              if(Options == 0){
                                                 break;
                                                 }

                                      switch(Options){
                                      case 1-> System.out.println("Types of views");
                                      case 2-> System.out.println("Memory Status");
                                          }    
                                        }
                                         }        
                                    case 9-> System.out.println("Speed dials");
                                    case 10-> System.out.println("Voice tags");  


                                                                                

                          }
                            }
                            }
                                                 case 2-> {
                                                 while(true){
                                          System.out.println("""
                                       ===== MESSAGES =====
                                      1.Write messages
                                      2.Inbox
                                      3.Outbox
                                      4.Picture messages
                                      5.Templates
                                      6.Smileys
                                      7.Message settings
                                      8.Info service
                                      9.Voice mailbox number
                                      10.Service command editor
                                        0.back
                                       """);


                                    System.out.println("Enter a number: ");
                                   int Messages = input.nextInt(); 
                                   if(Messages == 0){

                                   break;
                                   }
                                    
                                   switch(Messages){

                                   case 1-> System.out.println("Write messages");
                                   case 2-> System.out.println("Inbox");
                                   case 3-> System.out.println("Outbox");      
                                   case 4-> System.out.println("Picture messages");
                                   case 5-> System.out.println("Templates");
                                   case 6-> System.out.println("Smileys");
                                   case 7-> {
                                          while(true){
                                        System.out.println("""
                                    ========MESSAGE SETTINGS===========
                                              1. Set
                                              2. Common
                                              0.back

                                                  """);
                                              System.out.println("Enter a number: ");
                                             int setInput = input.nextInt();
                                                 if(setInput == 0){
                                                 break;
                                                 }
                                                 switch(setInput){

                                                case 1-> {
                                                 while(true){
                                                System.out.println("""
                                                 ======SET======
                                                 1.Message centre number
                                                 2.Message sent as
                                                 3.Message validity
                                                 0. back

                                                 """);
                                                 int setOne = input.nextInt();
                                                 if(setOne == 0){
                                                        break;
                                                        }
                                                    switch(setOne){

                                                  case 1-> System.out.println("Message centre number");
                                                  case 2-> System.out.println("Message sent as");
                                                  case 3-> System.out.println("Message validity");           
                                                 
                                                        }    
              
                                                }   
                                                 } 
                                                 case 2->{
                                                        while(true){
                                                 System.out.println("""
                                                 ======COMMON======
                                                 1.Delivery reports
                                                 2.Reply via same centre
                                                 3.Character support
                                                 0. back
                                                 """);
                                                      
                                                   int commonOne = input.nextInt();
                                                        if(commonOne == 0){
                                                        break;
                                                        }
                                                        switch(commonOne){
                                                  case 1-> System.out.println("Delivery reports");
                                                  case 2-> System.out.println("Reply via same centre");
                                                  case 3-> System.out.println("Character support");


                                                       } 
                                                        
                                             
                                                        }
                                                        }

                                                 }
                                                 }

                                                 }

                                            case 8-> System.out.println("Info service");
                                            case 9-> System.out.println("Voice mailbox number");
                                            case 10-> System.out.println("Service command editor");
              
                            }
                                          }
                                   }
                                   case 3-> System.out.println("chat");


                                   case 4->{ 
                                             while(true){
                                            System.out.println("""
                                          =====CALL REGISTER=====
                                          1.Missed calls
                                          2.Received calls
                                          3.Dialled numbers
                                          4.Erase recent call lists
                                          5.Show call duration
                                          6.Show call costs
                                          7.Call cost settings
                                          8.Prepaid credit
                                          0.back
                                           """);
                                   System.out.println("Enter any number");
                               int register = input.nextInt();
                                    if(register == 0){
                                       break;
                                   } 
                                  switch(register){
                                   case 1-> System.out.println("Missed calls");
                                   case 2-> System.out.println("Recieved calls");
                                   case 3-> System.out.println("Dialled numbers");
                                   case 4-> System.out.println("Erase recent call lists");
                                   case 5-> {
                                                 
                                             while(true){ 
   
                                          System.out.println("""
                                          ======SHOW CALL DURATION======
                                          1.Last call duration
                                          2.All calls duration
                                          3.Recieved call duration
                                          4.Dialed call duration
                                          5.Clear timers
                                          0.back
                                                 """);  
                                   System.out.println("Enter a number: ");
                                   int callDuration = input.nextInt();
                                    if(callDuration == 0){
                                      break;
                                        }      

                                   switch(callDuration){
                                          case 1-> System.out.println("last call duration");
                                          case 2-> System.out.println("All Calls duration");
                                          case 3-> System.out.println("Recived call durations");
                                          case 4-> System.out.println("Dialed calls duration");
                                          case 5-> System.out.println("Clear timers");
                                              }   


                                          }    
                                            
                                   
                                           }   
                                   case 6->{
                                          while(true){

                                         System.out.println("""
                                          ====SHOW CALL COSTS====
                                          1.Last call cost
                                          2.All calls'cost
                                          3.Clear counters
                                             """);
                                 System.out.println("Enter a number:");
                                 int showCallCost = input.nextInt();   


                                          

                                   
                                    switch(showCallCost){
                                        case 1-> System.out.println("Last call cost");
                                        case 2-> System.out.println("All calls'cost");
                                        case 3-> System.out.println("Clear counters");
      
                                          


                                          }                                                            
                                   
                                          }      
                              case 7-> {                   
                                        System.out.println("""
                                       ====CALL COST SETTINGS====
                                    1.Call cost limit
                                    2.Show costs in      
                                       """)  ;
                              System.out.println("Enter any number");
                               int callsetting = input.nextInt();
                                  if(callsetting == 0){  
                                                 }        
                                  switch(callsetting){
                                   case 1-> System.out.println("Call cost limit");
                                   case 2-> System.out.println("Show costs in");
                                          }
                                   }      
                                case 8->System.out.println("Prepaid credit");
                                   }
                                       




                                          }
}

       
                           case 5->{ 



          
                                   System.out.println("""
                                    ====TONES====
                                   1.Ringing tone
                                   2.Ringing volume
                                   3.Incoming call alert
                                   4.Composer
                                   5.Messages
                                   6.Keypad tones
                                   7.Warning and game tones
                                   8.Vibrating alert
                                   9.Screen saver     
                                   """);
                            System.out.println("Enter a number to access");
                    
                                   int tones = input.nextInt();
                                    
                                   switch(tones){

                                   case 1-> System.out.println("Ringing tone");
                                   case 2-> System.out.println("Ringing volume");
                                   case 3-> System.out.println("Incoming call alert");      
                                   case 4-> System.out.println("Composer");
                                   case 5-> System.out.println("Message alert tone");
                                   case 6-> System.out.println("Keypad tones");
                                   case 7-> System.out.println("Warning and game tones");
                                   case 8-> System.out.println("Vibrating alert");
                                   case 9-> System.out.println("Screen saver");

                                          }   
 }     

                            case 6->{

                                   System.out.println("""
                                    ======SETTINGS=====
                                   1.Calling settings
                                   2.Phone settings
                                   3.Security settings
                                   4.Restore factory settings
                                        
                                     """);
                            System.out.println("Enter a number to access");

                                   int settings = input.nextInt();
                                      
                                      switch(settings){

                                       case 1->{
                                   System.out.println("""
                                =====CALL SETTINGS=====
                            1.Automatic redial
                            2.Speed dialing
                            3.Call waiting options
                            4.Own number sending
                            5.Phone line in use
                            6.Automatic answer     

                                   """);

                             System.out.println("Enter a number to access");
                    
                                   int callsettings = input.nextInt();
                                    
                                   switch(callsettings){
                                   
                                   case 1-> System.out.println("Automatic redial");
                                   case 2-> System.out.println("Speed dailing");
                                   case 3-> System.out.println("Call waiting options");      
                                   case 4-> System.out.println("Own number sending");
                                   case 5-> System.out.println("Phone line in use");
                                   case 6-> System.out.println("Automatic answer");
                                   

                                          }


                                          }

                                case 2->{
                            
                           System.out.println("""
                          =====PHONE SETTINGS====  
                     1.Language
                     2.Cell info display
                     3.Welcome note
                     4.Network selection
                     5.Lights
                     6.Confirm SIM service actions                         
                            """);

                            System.out.println("Enter a number to access");
                    
                                   int phonesettings = input.nextInt();
                                    
                                   switch(phonesettings){
                                   
                                   case 1-> System.out.println("Language");
                                   case 2-> System.out.println("cell info display");
                                   case 3-> System.out.println("Welcome notes");      
                                   case 4-> System.out.println("Network selection");
                                   case 5-> System.out.println("Lights");
                                   case 6-> System.out.println("Confirm SIM service ");
                                   

                                          }
                                   }

                            case 3->{
                         System.out.println("""
                          ====SECURITY SETTINGS=====   
                         1.PIN code request
                         2.Call barring service
                         3.Fixed dailling 
                         4.Closed user group
                         5.Phone security
                         6.Change access codes
                              
                                    """);
                     System.out.println("Enter a number to access");
                          int securitySettings = input.nextInt();
                            switch(securitySettings){
                     
                                   case 1-> System.out.println("PIN code request");
                                   case 2-> System.out.println("Call barring service");
                                   case 3-> System.out.println("Fixed dailing");      
                                   case 4-> System.out.println("Closed user group");
                                   case 5-> System.out.println("Phone security");
                                   case 6-> System.out.println("Change access codes ");
                            
                                          }
                            
                                           }
                                   case 4->System.out.println("Restore Factory Settings");
                                   } 
                                   }
                                   
                                
                                 case 7-> System.out.println("Call divert");
                                 case 8-> System.out.println("Games");  
                                 case 9-> System.out.println("Calculator");  
                                 case 10-> System.out.println("Reminders");  


                                case 11->{

                            System.out.println("""
                            =====CLOCK======     
                            1.Alarm Clock
                            2.Clock Settings
                            3.Date Settings
                            4.Stopwatch
                            5.Countdown timer
                            6.Auto update of date and time      
                            """);
                     System.out.println("Enter a number to access");
                            int clockSettings = input.nextInt();
                            switch(clockSettings){
                                   
                                   case 1-> System.out.println("Alarm Clock");
                                   case 2-> System.out.println("Clock Settings");
                                   case 3-> System.out.println("Date Settings");
                                   case 4-> System.out.println("Stopwatch");
                                   case 5-> System.out.println("Countdown timer");
                                   case 6-> System.out.println("Auto update of date and time");       

                                          }
                                                 }
                                   case 12-> System.out.println("Profiles");
                                   case 13-> System.out.println("SIM services");

                                   










                                   }       

                             




                                   }  




                           
                                   
}
}

