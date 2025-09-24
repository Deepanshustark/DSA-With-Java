import java.util.ArrayList;
public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i*1);
            list2.add(2*(i));
            list3.add(3*(i));
        }
        
        mainList.add(list); mainList.add(list2); mainList.add(list3);
        // list.add(10); list.add(20); list.add(30);
        // list2.add(40); list2.add(50); list2.add(60);
        // mainList.add(list);
        // mainList.add(list2);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currentList= mainList.get(i);
        //     for(int j=0;j<currentList.size();j++){
        //         System.out.print(currentList.get(j)+" ");
        //     }
        // }
        
        System.out.println(mainList);
    }
}
