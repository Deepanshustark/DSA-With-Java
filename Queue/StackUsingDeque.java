import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque{
     static class Stack{
        static Deque<Integer> deque = new LinkedList<>();
       
        public  void push(int data){
            deque.addLast(data);
        }
        public  int pop(){
            return deque.removeLast();
        }
        public  int peek(){
            return deque.getLast();
        }

     }
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

       
        
    }
}