# RipeConceptsExam


## declaration of properties
* notPaired - an int primitive property that holds the return value which is the unpaired.
* mapOccurance - a Map/HashMap that holds a key-value pair to record the occurances of each element from array int.
```
		int notPaired = 0;
		Map<Integer, Integer> mapOccurrences = new HashMap<>();
```

### update 09/19/2024 removed this part
## iteration of array int (int[] A)
* using for-each loop to iterate within the array int (int[] A).
* inside the loop block, there is a condition to check if the element is not yet existing in the map as key. the element will be added as key and the value of 1 is explicitly added since it's the first occurance of this element.
* else it will put key-value pair entry to map (element is the key and value is the current value of the entry with incremental value of 1).
```
		for(int num: A) {
			if(mapOccurrences.get(num) ==null) {
				mapOccurrences.put(num, 1);
			} else mapOccurrences.put(num, mapOccurrences.get(num) + 1);
		}
```

### update 09/19/2024 removed this part
## iteration of map
* for-each to iterate the mapOccurances entrysets.
* inside the loop block there is a checking if an entry value is equal to 1. meaning it's occurance is only 1. Then the key will be passed as value of notPaired property.
```
		for (Map.Entry<Integer, Integer> entry : mapOccurrences.entrySet()) {
			if(entry.getValue() == 1) {
				notPaired = entry.getKey();
			}
		}
```

### update 09/19/2024 change implementation to this(XOR).
## iteration of int[]A and XOR each property of int.
* for-each to iterate the int[] A
* XOR each int property.
```
        for (int num : A) {
            notPaired ^= num;  
        }
```
