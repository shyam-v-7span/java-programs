package Collections.List;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.List; 

// find minimum and maximum element from array list

public class ArrayListMinMax { 

	public static void getMin(List<Integer> list) 
	{ 
		if (list == null || list.size() == 0) { 
			System.out.println("list is empty");
		} 

		
		Collections.sort(list); 
		System.out.println("minimum element = "+list.get(0)); 
	} 
 
	public static void getMax(List<Integer> list) 
	{ 
		if (list == null || list.size() == 0) { 
			System.out.println("list is empty"); 
		} 

		List<Integer> sortedlist = new ArrayList<>(list); 
		Collections.sort(sortedlist); 
        System.out.println("maximum element = "+sortedlist.get(sortedlist.size() - 1));
	}

	public static void main(String[] args) 
	{ 
		List<Integer> list = new ArrayList<>(); 
 
		list.add(44); 
		list.add(13); 
		list.add(20); 
		list.add(1); 
        list.add(54); 
		list.add(18); 

        getMin(list);
        getMax(list); 
	} 
} 
