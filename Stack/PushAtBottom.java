import java.util.Stack;
public class PushAtBottom{
    public static void insertAtBottom(Stack<Integer> st, int data){

        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top=(int)st.pop();
        insertAtBottom(st, data);
        st.push(top);

    }


    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        // st.push(20);
        // st.push(30);
        System.out.println(st);
        insertAtBottom(st, 40);
        System.out.println(st);
    }
}