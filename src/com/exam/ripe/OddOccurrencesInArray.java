package com.exam.ripe;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
	
	public static int solution( int[] A) {
		int notPaired = 0;
		Map<Integer, Integer> mapOccurrences = new HashMap<>();
		
		
		//iteratation of array int.
		for(int num: A) {
			if(mapOccurrences.get(num) ==null) {
				mapOccurrences.put(num, 1);
			} else mapOccurrences.put(num, mapOccurrences.get(num) + 1);
		}
		
		
		/// iteration for map occurance
		for (Map.Entry<Integer, Integer> entry : mapOccurrences.entrySet()) {
			if(entry.getValue() == 1) {
				notPaired = entry.getKey();
			}
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
