import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);
        list.add(50);
        // before
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+ " ");
       }
       System.out.println();
       // After
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " " );
        }

    }
    
}
