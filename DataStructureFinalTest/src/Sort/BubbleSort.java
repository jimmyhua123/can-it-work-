package Sort;
import java.util.Scanner;
public class BubbleSort {
	//3 2 6 5 9 4 8
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[7];
		//輸入陣列
		for (int i = 0; i < 7; i++) {
			a[i] = input.nextInt();
		}//讓程式跑7次
		for (int i = 7; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				//當a[j]大於於a[j+1]時，兩個交換
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}//列印
			for (int k = 0; k < 7; k++) {
				System.out.print(a[k] + " ");
			}System.out.println();
		}
	}
}
