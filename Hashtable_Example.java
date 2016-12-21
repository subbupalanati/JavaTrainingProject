import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hashtable_Example {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>(); 
		hm.put(100,"siva");
		hm.put(101,"suri");
		hm.put(102,"siri");
		hm.put(103,"veda");
		hm.put(104,"srilatha");
		
		 for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		 }
		 
		 Integer maxKey=Integer.MIN_VALUE;
		 String maxValue = null; 
		 for(Entry<Integer, String> entry : hm.entrySet()) {
		      if(entry.getKey() > maxKey) {
		          maxKey = entry.getKey();
		      }
		
		 }
		 System.out.println("max value is "+maxKey);
}
}
//output:
/*104 srilatha
103 veda
102 siri
101 suri
100 siva
max value is 104
*/