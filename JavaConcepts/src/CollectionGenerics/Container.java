package CollectionGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Container<T extends Number> {
	T value;

	Container(T value) {
		this.value = value;
	}

	// Over
	public void show01(ArrayList<? extends Number> arr) {
		System.out.println(arr.get(0).getClass().getName());
	}

	/*
	 * to put it another way, the effective method name is composed from the name
	 * you created plus the parameter types. And that concept was defined before the
	 * introduction of generics, so it just sees delete(List list), ignoring the
	 * generics type parameter that you added to the List. So you have two methods
	 * of the same effective method name, and that's what the compiler complains
	 * about.
	 */
	public void show02(ArrayList<? super Integer> arr) {
		System.out.println(arr.get(0).getClass().getName());
	}

	public static void main(String[] args) {
		Container<Integer> cont = new Container<Integer>(10);
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		cont.show01(list1);
//		cont.show02(new ArrayList<Integer>());

	}
}
