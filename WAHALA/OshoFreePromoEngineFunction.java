public class OshoFreePromoEngineFunction{

           public static void main(String[] args){
//         System.out.print(OshoFreePromoEngineFunction.getValueabove15000(18000));
         System.out.print(OshoFreePromoEngineFunction.getValueabove5000(7000));

}


public static int getValueabove5000(int numbers){
       int result = 0;
       if(numbers >= 5000 && numbers <= 14900){
              System.out.println("This is STARTER10 and 10% is deducted from your current amount ");

}
              int amount = numbers * 10/100;
              result = numbers - amount;
              return result;
              
}


public static int getValueabove15000(int numbers){
       int result = 0;
       if(numbers >= 15000 && numbers <= 29999){
              System.out.println("This is BIGBOY20 and 20% is deducted from your current amount ");

}
              int amount = numbers * 20/100;
              result = numbers - amount;
              return result;
              

}



public static int getValueBove30000(int numbers){
       int result = 0;
       if(numbers >= 30000){
              System.out.println("This is OSHOFREE35 and 35% is deducted from your current amount ");

}
              int amount = numbers * 35/100;
              result = numbers - amount;
              return result;
              
}




}

