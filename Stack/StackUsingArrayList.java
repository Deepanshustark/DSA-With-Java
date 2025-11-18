import java.util.ArrayList;

public class StackUsingArrayList{
    public static class StackA{
        static ArrayList<Integer> list = new ArrayList<>();

        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static boolean isEmpty(){
            return list.isEmpty();
        }
        public static int peek(){
            int top=list.get(list.size()-1);
            return top;
        }

        public static void main(String[] args) {
            // StackA s= new StackA();
            // s.push(10);
            // s.push(20);
            // s.push(30);
            // s.push(40);
            System.out.println(list);
        }
    }
}