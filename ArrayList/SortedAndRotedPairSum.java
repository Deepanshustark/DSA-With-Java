import java.util.ArrayList;
public class SortedAndRotedPairSum {
    // 2 Pointer Approach  --> O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target){
        // breaking piont 
        int bp=-1;
        int n= list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)> list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1; // left pointer
        int rp=bp;   // right pointer
        while(lp!=rp){
            // case 1
            if(list.get(lp)+ list.get(rp)== target){
                return true;
            }
            // case 2
            else if(list.get(lp)+ list.get(rp)>target){
                rp=(n+rp-1)%n;
            }
            // case 3
            else{
                lp=(lp+1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        // target 
        int target=166;

        System.out.println(pairSum(list, target));
    }
}
