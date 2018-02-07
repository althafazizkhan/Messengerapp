import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class method {

	public static void main(String[] args) {

		String[] items = { "apple", "mango", "tomato", "pie" };
		List<String> ls = Arrays.asList();


		for (String x : items) {

			ls.add(x);
		}
		
		String[] items2 = { "banana", "mango", "tomato", "gum" };
		List<String> ls1 = new ArrayList<String>();

		for (String y : items2) {

			ls1.add(y);
		}


		for(int i=0; i<ls.size();i++) {
			System.out.printf("%s ", ls.get(i));
		}

		//for(int j=0; j<ls1.size();j++) {
			//System.out.printf("%s ", ls1.get(j));
		//}
		
		
	

	}
	
public void compare(List<String>l1, List<String>l2) {
		
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()) {
			if(l2.contains(l1)) {
				it.remove();
			}
		}

}
}