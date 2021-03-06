import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		String[] name = {"Tom", "Jack" , "Bob", "Sue"};
		
		List<String> list = new ArrayList<String>();
		
		for(String names : name)
			list.add(names);
		
		
		String[] removeNames = {"Jack" , "Bob", "Sue"};
		
		List<String> removeList = new ArrayList<String>();
		
		for(String names : removeNames)
			removeList.add(names);
		
		
		System.out.println("ArrayList: ");
		
		// list 또한 index로 바로 접근 가능하다.
		for(int count = 0; count < list.size(); ++count) {
			System.out.printf("%s ",list.get(count));
		}
		
		// removing name, list comparison
		removeNames(list, removeList);
		
		System.out.printf
		("%n%nArrayList after calling removeNames:%n");
		
		for(String names : list)
			System.out.printf("%s ", names);
	}
	
	private static void removeNames(Collection<String>c1, Collection<String> c2) {
		
		Iterator<String> iter = c1.iterator();
		
		while(iter.hasNext()) {
			if(c2.contains(iter.next()))
				iter.remove();
		}
		
	}
	
}
