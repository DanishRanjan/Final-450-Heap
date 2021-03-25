import java.util.Collections;
import java.util.PriorityQueue;

public class Introduction {
public static void main(String args[]) {
//	PriorityQueue<Ineteger> pq = new PriorityQueue<>();//this is for increasing order
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//this is for decreasing Order
	int[] rank = {22, 99, 3, 11, 88, 4, 1};
	
	for(int val : rank) { //nlogn
		pq.add(val);
	}
	
	while(pq.size()>0) {
		System.out.println(pq.peek());
		pq.remove();
	}
}
}
