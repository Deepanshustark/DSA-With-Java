import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer> list,int i,int j){
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(5); list.add(9);
        list.add(3); list.add(6);
        int i=1,j=3;
        //before swap
        System.out.println("before swap = "+list);
        swap(list,i,j);
        //after
        System.out.println("After Swap = "+list);
    }    
}
