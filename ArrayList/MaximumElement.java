import java.util.ArrayList;
public class MaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(87);
        list.add(63);
        list.add(85);
        list.add(94);list.add(107);list.add(15);
        int largest=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest=list.get(i);
                ind=i;
            }
        }
        System.out.println(list);
        System.out.println("The index = "+ ind);
        System.out.println("Largest num = "+ largest);

    }
}
