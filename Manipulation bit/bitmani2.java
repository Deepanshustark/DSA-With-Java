public class bitmani2 {

    public static int setIth(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int clearIth(int n,int i){
        int bit=~(1<<i);
        return (n & bit);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(setIth(10, 2));
        System.out.println(clearIth(10, 2));
    } 

}
