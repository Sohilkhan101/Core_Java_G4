package Lecture28;

import java.util.Comparator;

public class colorComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {

		return o1.color.compareTo(o2.color);
	}

}
