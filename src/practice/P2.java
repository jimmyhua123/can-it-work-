package practice;

public class P2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int count = 0,endc=1;
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			count++;
			if(count==endc) {
					System.out.println();
					count=0;
					endc++;
			}
				
			}
		
	}

}
