import java.util.*;

public class Lotto649_WinningNum {

	public static void main(String[] args) {
		int Num, SNum = 0;
		Set<Integer> LottoWin_unsorted = new LinkedHashSet<Integer>();
		Set<Integer> LottoWin_sorted = new TreeSet<Integer>();
		
		SNum = (int)(Math.random()*49)+1;
		LottoWin_unsorted.add(SNum);
		LottoWin_sorted.add(SNum);
		
		while(true) {
			Num = (int)(Math.random()*49)+1;
			LottoWin_unsorted.add(Num);
			LottoWin_sorted.add(Num);
			if(LottoWin_unsorted.size() == 7) {
				break;
			}
		}
		
		System.out.println("大樂透開獎產生器：");
		System.out.println("開出順序：" + LottoWin_unsorted);
		System.out.println("大小順序：" + LottoWin_sorted);

	}

}
