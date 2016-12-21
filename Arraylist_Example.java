import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Example {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			arr.add(i);
		}
		Iterator<Integer> itr=arr.iterator();//getting Iterator from arraylist to traverse elements  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }

	}

}