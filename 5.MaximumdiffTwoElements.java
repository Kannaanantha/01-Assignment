package com.app;

public class MaximumdiffTwoElements {
	 
	 public static void main(String[] args) {
	  int arr[]={ 2, 5, 1, 7, 3, 9, 5};
	  //int arr[]={ 9, 2, 12, 5, 4, 7, 3, 19, 5};
	  System.out.println("Maximum difference between two elements : "+calculateMaxDifferenceBetweenTwoElements(arr));
	 
	 }
	 public static int calculateMaxDifferenceBetweenTwoElements(int[] arr)
	 {
	  int minElementTillNow=arr[0];
	  int maxDifference=Integer.MIN_VALUE;
	  for (int i = 0; i < arr.length; i++) {
	   int difference=0;
	   if(arr[i] >minElementTillNow)
	   {
	    difference=arr[i]-minElementTillNow;
	    if(difference > maxDifference)
	    {
	     maxDifference=difference;
	    }
	   }
	   else
	   {
	    minElementTillNow=arr[i];
	   }
	  }
	  return maxDifference;
	 }
	 
	}
