import java.util.Comparator;
import java.util.PriorityQueue;

public class comparableAndComparator {

	static class Student implements Comparable<Student> {
		int rolno;
		int height;
		int weight;

		Student(int rolno, int height, int weight) {
			this.rolno = rolno;
			this.height = height;
			this.weight = weight;
		}

		@Override
		public int compareTo(Student o) {
			return this.rolno - o.rolno;
		}

		public String toString() {
			return "Rmo = " + this.rolno + ", Ht = " + this.height + ", Wt = " + this.weight;
		}
	}

//	static class StudentWeightComparator implements Comparator<Student> {
//		public int compare(Student s1, Student s2) {
//			return s1.weight - s2.weight;
//		}
//	}

	public static void main(String args[]) {
		int[] arr = { 10, 2, 17, 3, 18, 9, 22 };
//		PriorityQueue<Student> pq = new PriorityQueue<>(new StudentWeightComparator()); //this will use COMPARE  and do compare on weight basis
		PriorityQueue<Student> pq = new PriorityQueue<>(); // this is comparator  and this will do in roll number

		pq.add(new Student(10, 180, 81));
		pq.add(new Student(2, 185, 85));
		pq.add(new Student(12, 170, 84));
		pq.add(new Student(17, 179, 88));
		pq.add(new Student(7, 182, 82));

		while (pq.size() > 0) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}
