import java.util.*;

public class Lotto649 {

	public static void main(String[] args) {
		int Num = 0;
		Set<Integer> Lotto_unsorted = new LinkedHashSet<Integer>();
		Set<Integer> Lotto_sorted = new TreeSet<Integer>();
		
		// TreeSet 遇到重複值時會忽略不計，用 while 確保號碼數量
		while(true) {
			Num = (int)(Math.random()*49)+1;
			Lotto_unsorted.add(Num);
			Lotto_sorted.add(Num);
			if(Lotto_unsorted.size() == 6) {
				break;
			}
		}
		
		System.out.println("大樂透投注產生器：");
		System.out.println("開出順序：" + Lotto_unsorted);
		System.out.println("大小順序：" + Lotto_sorted);
		
	}

}
