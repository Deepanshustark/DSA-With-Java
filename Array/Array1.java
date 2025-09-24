//     public static void main(String[] args) {
//         int arr[]=new int[10];
//         System.out.println(arr[5]);
//     }
// }



// class Array1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[]=new int[10];
//         System.out.println("Lengh of array = "+ arr.length);
//         arr[0]=sc.nextInt();
//         arr[1]=sc.nextInt();
//         arr[2]=sc.nextInt();

//         System.out.println("arr[0] = "+arr[0]);
//         System.out.println("arr[1] = "+arr[1]);
//         System.out.println("arr[2] = "+arr[2]);
//         for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
//     }
// }
//     public static void main(String[] args) {
//         int word=0;
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         System.out.println("Sentence is + "+ str);
//         for(int i=0;i<str.length();i++){
//         if(str.charAt(i)==' '){
//             word++;
        
//         }
        
//        }
//        word++;
//        System.out.println("Numver of words in a sentence is = "+word);
//     }
// }

// class Array1{
//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]+=10;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={50,60,70};
//         update(arr);
//         for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
//     }
// }
//                                Linear search
//     public static int findIndex(int arr[],int key){
      
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==key){
//               return i;
//             }

//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10,12,14};
//         Scanner sc =new Scanner(System.in);
//         int key;
//         System.out.print("Enter key : ");
//         key=sc.nextInt();
//         int index=findIndex(arr, key);
//         if(index!=-1){

//             System.out.println("the "+key+" find at index "+index);
//         }
//         else{
//             System.out.println("Element not present in an given array !");
//         }
//     }
// }


//                      largest in an array

// class Array1{
//     public static int largestInArray(int arr[]) {
//         int largest=Integer.MIN_VALUE;    // minimum value
//         // System.out.println(largest);
//         // System.out.println(Integer.MAX_VALUE);
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int arr[]={100,10,50,64,78,16,46,15};
//         int lar= largestInArray(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         System.out.println("largest element = "+lar);
//     }
// }


//         binary search

// class Array1{
//     public static int binarySearch(int num[],int key){
//         int start,end,mid;
//         start=0;
//         end=num.length-1;
//         while(start<=end){
//             mid=((start+end)/2);
//             if(num[mid]==key){
//                 return mid;
//             }
//             else if(num[mid]>key){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
//         }
//        return -1;
//     }
//     public static void main(String[] args) {
        
//         int num[]={2,4,6,8,10,12,14};
//         int key=10;
//         int index=binarySearch(num, key);
//         if(index!=-1){

//             System.out.println("INDEX IS = "+ index);
//         }
//         else{
//             System.out.println("Elwmwnt not found");
//         }
//     }
// }

//              reverse an array

// class Array1{
//     public static void reverseArray(int arr[]){
//         for(int i=0,j=arr.length-1;i<=j;i++,j--){
//             if(i==j){
//                 arr[i]=arr[j];
//             }
//             else if(i<j){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
        
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         reverseArray(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// pairs in array

// class Array1{
//     public static int pairs(int arr[]){
//         int num=0;
//         for(int i=0;i<=arr.length-2;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print("("+arr[i]+","+arr[j] + ") ");
//                 num++;
//             }
//             System.out.println();
//         }
//         return num;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         int num=pairs(arr);
//         System.out.println("number of possible pairs = "+ num);
//     }
// }


//    subarrays

// class Array1{
//     public static void subarrays(int arr[]){
//         int num=0;
//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;j<arr.length;j++){
//                 int end=j;
//                 num++;
//                 for(int k=start;k<=end;k++){ 
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();

//             }
//         }
//         System.out.println("Number of subarray = "+num);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         subarrays(arr);
//     }
// }

//             maximum sum of sub-array
// class Array1{
//     public static void maxSubArraysSum(int arr[]){
//         int curSum;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;j<arr.length;j++){
//                 int end=j;
//                 curSum=0;
//                 for(int k=start;k<=end;k++){ 
//                     curSum+=arr[k];
                   
//                 }
//                 System.out.println(curSum);
//                 if(maxSum<curSum){
//                     maxSum=curSum;
//                 }
//             }
//         }
//         System.out.println("Maximum sum of sub array = "+maxSum);
//     }
//     public static void main(String[] args) {
//         int arr[]={1,-2,6,-1,3};
//         maxSubArraysSum(arr);
//     }
// }

//     MAXIMUM SUM OF SUbARRAY bY PREFIX SUM

// class Array1{
//     public static void maxSubArraysSum(int arr[]){
//         int curSum;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int[arr.length];
//         prefix[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             prefix[i]=arr[i]+prefix[i-1];
//         }

//         for(int i=0;i<arr.length;i++){
//             int start=i;
//             for(int j=i;j<arr.length;j++){
//                 int end=j;
//                 curSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
//                 if(maxSum<curSum){
//                     maxSum=curSum;
//                 }
//             }
//         }
//         System.out.println("Maximum sum of sub array = "+maxSum);
//     }
//     public static void main(String[] args) {
//         int arr[]={1,-2,6,-1,3};
//         maxSubArraysSum(arr);
//     }
// }
 
//       KADANE'S ALGO

class Array1{

    public static void kadanesSum(int arr[]){
        int curSum=0,maxSum=Integer.MIN_VALUE;
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                check=true;
            }
        }


      if(check){
        for(int i=0;i<arr.length;i++){
           curSum=curSum+arr[i];
           if(curSum<0)
           {
            curSum=0;
           }
            if(maxSum<curSum) maxSum=curSum;
        }
        System.out.println(maxSum);
    }
    else{
        int smallest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest<arr[i]) smallest=arr[i];
        }
        System.out.println(smallest);
    }


    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,4};
        kadanesSum(arr);
    }
}