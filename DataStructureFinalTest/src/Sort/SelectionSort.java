package Sort;


	import java.util.Scanner;

	//3 2 6 5 9 4 8
	public class SelectionSort {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a[] = new int[7];
			// 輸入陣列
			for (int i = 0; i < 7; i++) {
				a[i] = input.nextInt();
			} // 讓程式跑7次
			for (int j = 7; j > 0; j--) {
				int big = a[0], place = 0;
				for (int i = 0; i < j; i++) {
					// 找最大值還有他的位子
					if (big < a[i]) {
						big = a[i];
						place = i;
					}
				} // 讓最大值跟最後面的數交換
				int temp = a[j - 1];
				a[j - 1] = a[place];
				a[place] = temp;
				// 列印
				for (int i = 0; i < 7; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println(" ");
			}
		}
	}
