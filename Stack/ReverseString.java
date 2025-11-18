import java.util.Stack;
public class ReverseString {

    public static String reverseString(Stack<Character> st ,String str){
        StringBuilder rev = new StringBuilder("");
        for(int i=0;i<str.length();i++){
           st.push(str.charAt(i));
        }
        for(int i=st.size()-1;i>=0;i--){
       
            char top = (char)st.pop();
            rev=rev.append(top);
        }
        return rev.toString();
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String str="naman";
        System.out.println(reverseString(st,str));
       
    }
}
