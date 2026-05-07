

public class CountOccuring{

    
       public static int getCountOfMostOccuringNumber(int [] arrayNums) {

        // int  []  arrayNums  = {1,2,2,2,3};

         //int  result =  new int(most);  
   
        //int []    result  = new int [3];
         int storeMost = 0;
       for(int index = 0; index < arrayNums.length; index++){
         int most = 0;

       for(int inner = 0; inner < arrayNums.length; inner++){

               if(arrayNums[index] == arrayNums[inner]){
              most++;
              }
        }

              if (most >  storeMost){
                 storeMost = most;
               }

       }
                 return storeMost ;

       }



public static void main(String[]args){


int  []  arrayNums  = {1,2,2,2,3,8,7,8,8,9,8,2,9,8,8,2};
int mostOccuringTimes = getCountOfMostOccuringNumber(arrayNums);
System.out.println(mostOccuringTimes);


}

}



