public class Recursion{
    public static void binaryString(String str,int i){
        if(i==str.length()-1){
            System.out.println("Valid String");
            return;
        }
        if((str.charAt(i)=='1') && (str.charAt(i+1)=='1')){
            System.out.println("not valid string");
            return;
        }
        binaryString(str, i+1);
        
    }
    public static int friendsPairing(int n){
        if(n==1 || n==2) return n;
        else{
            return friendsPairing(n-1)+ (n-1)*friendsPairing(n-2);
        }
    }
    public static void removeDuplicate(String str,int i,StringBuilder newString,boolean  map[]){
        if(i==str.length()){
            System.out.println(newString);
            return ;
        }
        char ch=str.charAt(i);
        if(map[ch-'a']==true){
            removeDuplicate(str, i+1, newString, map);
        }
        else{
            newString.append(ch);
            map[ch-'a']=true;
            removeDuplicate(str, i+1, newString, map);
        }
    }
    public static int tilingProblem(int n){
        if(n==0 ||  n==1){
            return 1;
        }
        int vertical=tilingProblem(n-1);
        int horizontal= tilingProblem(n-2);
        return vertical+horizontal;
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(arr[i]==key) return i;
        return firstOccurence(arr, key, i+1);
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1) return true;
        else if(arr[i]>arr[i+1]) return false;
        return isSorted(arr, i+1);
    }

    public static int  fibbo(int n){
      
        if(n==0) return 0;
        else if(n==1) return 1;
        return fibbo(n-1) + fibbo(n-2);
       
    }
    public static int sumNaturalNum(int n){
        if(n==1){
            return 1;
        }
        return n+sumNaturalNum(n-1);
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void printNumInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printNumInc(n-1);
        System.out.print(n+" ");
    }
    public static void printNumDec(int n){
        if(n>0){
            System.out.print(n+" ");
            printNumDec(n-1); 
        }
    }

    public static void main(String [] args){
        // printNumDec(10);
        // System.out.println();
        // printNumInc(10);
        // System.out.println(factorial(5));
        // System.out.println(sumNaturalNum(5));
        // int n=8;
        // for (int i=0;i<n;i++)
        // System.out.print (fibbo(i) + " ");
        // int arr[]={1,4,3,4,5,6,4,3,5};
        // System.out.println(firstOccurence(arr, 5,0));
        // System.out.println(tilingProblem(5));
        // String str="apnacollege";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(4));
        binaryString("0001001",0);

    }

}
