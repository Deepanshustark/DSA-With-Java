public class NextGreaterElement {

    public static void bruteForce(int arr[], int next[]){
        for(int i=0;i<arr.length;i++){
            int currElement=arr[i];
            next[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                int nextElement=arr[j];
                if(currElement < nextElement){
                    next[i]=nextElement;
                    break;
                } 
            }
        }
    }

    public static void main(String[] args){
        int arr[]={6,8,0,1,3};
        int next[]= new int[arr.length];
        bruteForce(arr,next);
        for(int i=0;i<next.length;i++){
            System.out.print(next[i]+ " ");
        }
    }
    
}
