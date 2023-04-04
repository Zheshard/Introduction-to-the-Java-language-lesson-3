
// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ex_2 {
	public static List<Integer> removeEvenNum(List<Integer> sourcelist) {
		List<Integer> outputList = new ArrayList<>();
		for (int i = 0; i < sourcelist.size(); i++) {

			if (sourcelist.get(i) % 2 != 0) {
				outputList.add(sourcelist.get(i));
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(13, 1, 12, 5, 7, 2, 11, 14, 19, 0));
		System.out.println(removeEvenNum(list));
	}
}
