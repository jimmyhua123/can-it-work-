package heap;

public class heap {
	public static void main(String[] args) {
		int[] arr = { 2, 9, 7, 15, 1 };
		System.out.println("Before heap:");
		printArray(arr);
		heapSort(arr);
		System.out.println("After heap sort:");
		printArray(arr);
	}

	public static void heapSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		buildMaxHeap(arr); // 構建最大堆
		for (int i = arr.length - 1; i > 0; i--) { // 排序
			exchangeElements(arr, 0, i); // 交換堆頂和第0位置元素
			maxHeap(arr, i, 0); // 因為交換元素後，有可能違反堆的性質，所以沉降元素
		}
	}

	private static void buildMaxHeap(int[] arr) { // 構建最大堆
		if (arr == null || arr.length <= 1) {
			return;
		}
		int half = arr.length / 2;
		for (int i = half; i >= 0; i--) {
			maxHeap(arr, arr.length, i);
		}
	}

	private static void maxHeap(int[] arr, int heapSize, int index) {
		int left = index * 2; // 定義左子樹上的元素
		int right = index * 2 + 1; // 定義右子樹上的元素
		int largest = index; // 定義largest為最大的元素
		if (left < heapSize && arr[left] > arr[largest]) {// 判別最大元素與左子樹上的元素大小
			largest = left;
		}
		if (right < heapSize && arr[right] > arr[largest]) {// 判別最大元素與右子樹上的元素大小
			largest = right;
		}
		if (index != largest) { // 判斷根元素是否為最大元素
			exchangeElements(arr, index, largest);
			maxHeap(arr, heapSize, largest);
		}
	}

	public static void printArray(int[] arr) { // 列印陣列
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	public static void exchangeElements(int[] arr, int index1, int index2) { // 交換元素
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}