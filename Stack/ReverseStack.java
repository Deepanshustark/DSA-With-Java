import java.util.Stack;
public class ReverseStack {
    public static void revreseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top=(int)st.pop();
        revreseStack(st);
        insertAtBottom(st, top);
    }
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
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        revreseStack(st);
        System.out.println(st);

    }
}
