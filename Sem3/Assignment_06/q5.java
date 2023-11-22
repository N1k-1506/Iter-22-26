//Given a list n numbers,find the element which appears maximum no. of times 

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 

class q5 { 
	
	static int mostFrequent(int arr[], int n) 
	{ 
		Map<Integer, Integer> hp = 
			new HashMap<Integer, Integer>(); 
		
		for(int i = 0; i < n; i++) 
		{ 
			int key = arr[i]; 
			if(hp.containsKey(key)) 
			{ 
				int freq = hp.get(key); 
				freq++; 
				hp.put(key, freq);
			} 
			else
			{ 
				hp.put(key, 1); 
			} 
		} 
		int max_count = 0, res = -1; 
		
		for(Entry<Integer, Integer> val : hp.entrySet()) 
		{ 
			if (max_count < val.getValue()) 
			{ 
				res = val.getKey(); 
				max_count = val.getValue(); 
			} 
		} 
		
		return res; 
	} 
	public static void main (String[] args) { 
		
		int arr[] = {40,50,30,40,50,30,30}; 
		int n = arr.length; 
		
		System.out.println(mostFrequent(arr, n)); 
	} 
} 

