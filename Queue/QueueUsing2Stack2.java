import java.util.Stack;
public class QueueUsing2Stack2 {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static  Stack<Integer> s2 = new Stack<>();

        // isEmpty()
        public  boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        // add() --> O(1)
        public  void add(int data){
            s1.push(data);
        }        

        // remove() --> amontised O(1) asymptotic --> O(n)
        public  int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            if(!s2.isEmpty()){
                return s2.pop();
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        // peek() --> O(n)
        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            if(!s2.isEmpty()){
                return s2.peek();
            }
            else{
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
