import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;

public class childclass {

	public void compare( Collection<String> l1, Collection<String> l2) {
		
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()) {
			if(l2.contains(l1)) {
				it.remove();
			}
		}
	}
}
