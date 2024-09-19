package com.exam.ripe;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
	
	public static int solution( int[] A) {
		int notPaired = 0;
//		Map<Integer, Integer> mapOccurrences = new HashMap<>();
		//iteration of int[] A
        for (int num : A) {
        	// XOR each int property inside array
            notPaired ^= num;  
        }
		
		///return value
		return notPaired;
	}
	
	public static void main(String[] args) {
//		Array:9,3,9,3,9,7,9
//		Array:1,2,9,2,1
		int[] Arr = {9,3,9,3,9,7,9};
		
		System.out.println(solution(Arr));
		
	}

}
