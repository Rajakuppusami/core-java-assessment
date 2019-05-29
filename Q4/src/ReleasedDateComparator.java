import java.util.Comparator;

public class ReleasedDateComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getReleasedDate().compareTo(o2.getReleasedDate());
	}
	//Your code goes here...
}
