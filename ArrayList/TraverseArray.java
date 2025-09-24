import java.util.ArrayList;
public class TraverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // size of Arraylis 
        int size= list.size();
        for(int i=0;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
    }
    
}
