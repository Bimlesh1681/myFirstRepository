package HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentsMarks_HashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> marksMap = new HashMap<String, Integer>();
		
		marksMap.put("Tom", 98);
		marksMap.put("Jerry", 100);
		marksMap.put("Harry", 95);
		marksMap.put("Peter", 89);
		marksMap.put(null, null);
		marksMap.put(null, 0);
		marksMap.put("Kiran", null);
		marksMap.put("Kiran", 100);
		
		//System.out.println(marksMap);
		
		System.out.println(marksMap.get(null));

	}

}
