
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex_3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(13, 1, 12, 5, 7, 2, 11, 14, 19, 0));
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(list.stream().mapToInt(Integer::intValue).average());
	}
}
