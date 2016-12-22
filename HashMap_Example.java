import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example {

	public static void main(String[] args) {
		 HashMap<Integer, String> employee = new HashMap<Integer, String>();
		 employee.put(10,"subbu");
		 employee.put(11,"salma");
		 employee.put(12,"phani");
		 employee.put(13,"ammu");
		 employee.put(14,"chintu");
		 Set set = employee.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	}

}
/* output
10: subbu
11: salma
12: phani
13: ammu
14: chintu
*/