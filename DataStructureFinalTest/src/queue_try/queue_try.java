package queue_try;

public class queue_try {
	public static void main(String[] args) {
		queue s = new queue();
		s.put(7);
		System.out.println(s.remove());
		System.out.println(s.remove());
		s.put(8);
		s.put(6);
		s.put(5);
		System.out.println(s.remove());
		s.put(4);
		s.put(2);
		s.put(3);
		s.put(12);
		s.put(18);
		s.put(11);
		System.out.println(s.remove());
	}
}
