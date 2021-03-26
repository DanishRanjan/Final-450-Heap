import java.io.*;
import java.util.*;

public class priorityQueueUsingHeap {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      data.add(val);
      upHeapify(data.size()-1);
    }
      
    private void upHeapify(int i){
          if(i == 0){
              return;
          }
          int parentIndex = (i-1)/2;
          if(data.get(i) < data.get(parentIndex)){
              swap(i, parentIndex);
              upHeapify(parentIndex);
          }
          
      }
      
 
    
    
    private void swap(int i, int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i,jth);
        data.set(j, ith);
    }
    public int remove() {
       if(this.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      
      swap(0, data.size() -1);
      int val = data.remove(data.size()-1);
      downHeapify(0);
      return val;
    }
      
      private void downHeapify(int ParentIndex){
          
          int minimum = ParentIndex; 
          
          int leftIndex = (2 * ParentIndex) + 1;
          if(leftIndex < data.size() && data.get(leftIndex) < data.get(minimum)){
              minimum = leftIndex;
          }
          
          int rightIndex = (2 * ParentIndex) + 2;
          if(rightIndex < data.size() && data.get(rightIndex) < data.get(minimum)){
              minimum = rightIndex;
          }
          
          if(minimum != ParentIndex){
              swap(ParentIndex, minimum);
              downHeapify(minimum);
          }
      }
    

    public int peek() {
      if(this.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      return data.get(0);
    }

    public int size() {
     return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}