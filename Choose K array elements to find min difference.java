/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int minDiff(int[] arr,int n,int k){
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++)
        {
        result = Math.min(result, arr[i + k - 1] - arr[i]);
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
// 		System.out.println("helo");
        int arr[]={10, 100, 300, 200, 1000, 20, 30};
        int n=arr.length;
        int k=3;
        System.out.println(minDiff(arr,n,k));
        
	}
}
