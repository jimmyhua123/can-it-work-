package queue_try;

public class queue {
	int queue[] = new int[8];
	int front = 0;
	int rear = 0;

	public void put(int x) {
		if ((rear + 1) % 8 == front) {
			System.out.print("full\n");
		} else {
			rear = (rear + 1) % 8;
			queue[rear] = x;
		}
	}

	public int remove() {
		if (front == rear) {
			return -1;
		} else {
			front = (front + 1) % 8;
			int x = queue[front];
			queue[front] = 0;
			return x;
		}
	}
}
