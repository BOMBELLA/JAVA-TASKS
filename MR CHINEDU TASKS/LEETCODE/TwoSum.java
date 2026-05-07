

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
//PSCODE
// initailise the unknown target using two index
// using a nexted for loop to find the target 
// because the nexted for loop adds up
//use an if statement to compare
// return the result of the target



public class TwoSum {

    public int [] twoSum(int[] nums, int target) {

        int [] result = new int [2];

    for(int index = 0; index < nums.length; index ++){

     for(int inner = index + 1; inner < nums.length; inner++){

     if(nums[index] + nums[inner] == target) {

            result[0] = index;
           result [1] = inner; 
        return result;

     }   

     }   
    }
        return new int [0];



    }
}
