
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void reverseQueueUsingStack(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

    }

    public static void reverseQueueUsingRecursion(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int data=q.remove();
        reverseQueueUsingRecursion(q);
        q.add(data);

    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);

        reverseQueueUsingRecursion(q);
        reverseQueueUsingStack(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
       
    }
    
}
