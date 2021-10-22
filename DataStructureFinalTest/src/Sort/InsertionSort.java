package Sort;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Please give an array which length is 6:");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("The original array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
		Insertionsort(a, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void Insertionsort(int[] a, int n) {

		for (int i = 1; i < a.length; i++) {
			int x = a[i];
			int j = i - 1;
			while (j >= 0 && x < a[j]) {
				//j會慢慢減到0
				a[j + 1] = a[j--];//右==左
			}
			a[j + 1] = x;//左==右
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}System.out.println("i = "+i+"\n");
		}
	}

}