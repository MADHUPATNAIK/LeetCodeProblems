/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
import java.util.Scanner;

class TwoSum{
  private static Scanner sc = new Scanner(System.in);
  public static int[] twoSumResult(int[] nums, int target) {
        int n = nums.length;
        int a=0,b=0;
        for(int i=0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]+nums[j] == target){a = i; b = j ; break;}
            }
        }
        
        int arr[]= {a,b};
        return arr;
   }
  public static void main (String[] args) { 
  
    //Assuming reader gives the input
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int[] sol = twoSumResult(arr, target);
    for(int i=0; i<sol.length; i++) System.out.println(sol[i]);
  }
}
