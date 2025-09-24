
import java.util.ArrayList;

public class MostWater {
    public static int storeWatre(ArrayList<Integer> line){
        int maxWater=0;
        for(int i=0;i<line.size();i++){
            for(int j=i+1;j<line.size();j++){
                int he=Math.min(line.get(i),line.get(j));
                int width=j-i;
                int currWater=he*width;
                maxWater= Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> line=new ArrayList<>();
        line.add(1); line.add(8);
        line.add(6); line.add(2);
        line.add(5); line.add(4);
        line.add(8); line.add(3); line.add(7);
        
        System.out.println(storeWatre(line));
    }
}
