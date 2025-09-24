public class FindPermutation {
    public static void findpermutation(String str, String ans){
        // base case
        if(0==str.length()){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i=0;i<str.length();i++){
            char curr= str.charAt(i);
            String newstr=str.substring(0,i)+ str.substring(i+1);
            findpermutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findpermutation(str, "");
    }
    
}
