
//     public static float  binomial(int n)
//     {  int nfact=1;
//        for(int i=1;i<=n;i++){
//         nfact=nfact*i;
//        }
//        return nfact;
//     }
  
//     public static void main(String[] args) {
//         int n,r;
//         float coff;
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         r=sc.nextInt();
//         float fact_n=binomial(n);
//         float fact_r=binomial(r);
//         float fact_nr=binomial((n-r));
//         float coeff=fact_n/(fact_r*fact_nr);
//         System.out.println("binomial coefficent is : "+coeff);

       
//     }
       
// }

// public class function{
//     public static void main(String[] args) {
//         System.out.println(sum(4,5));
//         System.out.println(sum(4f,5f));
//     }

//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
// }


public class function{
    public static  void checkprime(int a){
        boolean flag=false; 
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.print("Given number is not prime");
        }
        else{
            System.out.print("Given number is  prime");
        }
    }

    public static void main(String[] args) {
        checkprime(10);
    }
}
    