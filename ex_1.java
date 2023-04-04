
// Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex_1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(0, 13, 2, 1, 12, 5, 21, 7, 2, 11, 14, 19, 3, 1, 2, 4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5, 0, 9, 6, 11));
		mergeSort(list);
		selectionSort(list2);
		System.out.println(list);
		System.out.println(list2);
	}

	// сортировка слиянием:
	public static void mergeSort(List<Integer> sourcelist) {
		if (sourcelist.size() > 1) {
			int mid = sourcelist.size() / 2;
			List<Integer> left = new ArrayList(sourcelist.subList(0, mid));
			List<Integer> right = new ArrayList(sourcelist.subList(mid, sourcelist.size()));

			mergeSort(left);
			mergeSort(right);

			int i = 0;
			int j = 0;
			int k = 0;

			while (i < left.size() && j < right.size()) {
				if (left.get(i) < right.get(j)) {
					sourcelist.set(k, left.get(i));
					i++;
				} else {
					sourcelist.set(k, right.get(j));
					j++;
				}
				k++;
			}

			while (i < left.size()) {
				sourcelist.set(k, left.get(i));
				i++;
				k++;
			}

			while (j < right.size()) {
				sourcelist.set(k, right.get(j));
				j++;
				k++;
			}
		}
	}

	// сортировка выборкой:
	public static void selectionSort(List<Integer> sourcelist) {
		for (int i = 0; i < sourcelist.size() - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < sourcelist.size(); j++) {
				if (sourcelist.get(j) < sourcelist.get(smallest)) {
					smallest = j;
				}
			}
			int temp = sourcelist.get(i);
			sourcelist.set(i, sourcelist.get(smallest));
			sourcelist.set(smallest, temp);
		}
	}
}
