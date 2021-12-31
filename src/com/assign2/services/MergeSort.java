package com.assign2.services;

public class MergeSort {
	void mergeDescending(double array[], int low, int mid, int high) 
	{
		int i, j, k;  
	    int n1 = mid - low + 1;    
	    int n2 = high - mid;    
	    double LeftArray[] = new double[n1];  
	    double RightArray[] = new double[n2];  
	      
	    for (i = 0; i < n1; i++)    
	    LeftArray[i] = array[low + i];    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = array[mid + 1 + j];
	    
	    i = 0; 
	    j = 0; 
	    k = low; 
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] >= RightArray[j])    
	        {    
	        	array[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	        	array[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	    	array[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	    	array[k] = RightArray[j];    
	        j++;    
	        k++;    
	    } 
	}
	void merge(double array[], int low, int mid, int high)    
	{    
	    int i, j, k;  
	    int n1 = mid - low + 1;    
	    int n2 = high - mid;    
	    double LeftArray[] = new double[n1];  
	    double RightArray[] = new double[n2];  
	      
	    for (i = 0; i < n1; i++)    
	    LeftArray[i] = array[low + i];    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = array[mid + 1 + j];
	    
	    i = 0; 
	    j = 0; 
	    k = low; 
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	        	array[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	        	array[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	    	array[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	    	array[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	  
	void mergeSortingAscending(double array[], int low, int high)  
	{  
	    if (low < high)   
	    {  
	        int mid = (low + high) / 2;  
	        mergeSortingAscending(array, low, mid);  
	        mergeSortingAscending(array, mid + 1, high);  
	        merge(array, low, mid, high);  
	    }  
	}  
	
	void mergeSortingDescending(double array[], int low, int high)
	{  
	    if (low < high)   
	    {  
	        int mid = (low + high) / 2;  
	        mergeSortingDescending(array, low, mid);  
	        mergeSortingDescending(array, mid + 1, high);  
	        mergeDescending(array, low, mid, high);  
	    }  
	}
	  
	void printingArray(double array[], int n)  
	{  
	    for (int i = 0; i < n; i++)  
	        System.out.print(array[i] + " ");  
	}
	  
}
