package Sort;

import java.util.Scanner;

public class RankSort {

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
		System.out.println();
		Ranksort(a, a.length);
		System.out.println("ranksort=");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

	private static void Ranksort(int[] a, int n) {
		int r[]=new int [6];
		for (int i = 0; i < 6; i++) {
			int count = 0;
			for (int j = 0; j < 6; j++) {
				if (a[i] > a[j]) {
					count++;
				}
			}r[i]=count;
		}
		for (int j = 6; j > 0; j--) {
			int big = a[0], place = 0;
			for (int i = 0; i < j; i++) {
				if (big < a[i]) {
					big = a[i];
					place = i;
				}
			}
			int temp = a[j - 1];
			a[j - 1] = a[place];
			a[place] = temp;
		}
		System.out.println("rank = ");
		for (int i = 0; i < 6; i++) {
			System.out.print(r[i] + " ");
		}System.out.println();

	}

}
