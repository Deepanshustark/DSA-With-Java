import java.util.ArrayList;
public class Operation{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        // Add element in a list  -->   list_name.add(element)
        list.add(10);  //O(1)
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println("ArrayList = "+list);
        // Add element in list -->;ist_name.add(index,element)
        list.add(2,60);
        System.out.println("ArrayList = "+ list);

        // Get function --> return the element present at index --> list_name.get(index)
        System.out.println("element present at 2 pos = " + list.get(2));

        // remove() --> delete and return the element present at index --> list_name.remove(index)
        int ele= list.remove(2);
        System.out.println("The deleted element = "+ ele);
        System.out.println(list);

        // set(inedx,element) --> insert element at idx position(by deleteing the element present at position index)
        list.set(2,90);
        System.out.println(list);

        // contain() --> return true if element present in list else false
        System.out.println(list.contains(40));
        boolean check=list.contains(110);
        System.out.println(check);

        // size() --> return size of ArrayList
        int size=list.size();
        System.out.println("Array size = "+ size);
    }
}