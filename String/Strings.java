
//     public static void main(String[] args) {
//         String dir="WNEENESENNN";
        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev=rev+str.charAt(i);
        // }
        // System.out.println(rev);
        // if(str.equals(rev)) {System.out.println("Palindrome");}
        // else {System.out.println("Not Palindrome");}
        // boolean flag=true;
        // for(int i=0,j=str.length()-1;i<=j;i++,j--){
        //     if(str.charAt(i)!=str.charAt(j)){
        //         System.out.println("String not palidrome");
        //         flag=false;
        //         break;
                
        //     }
        // }
        // if(flag){
        //         System.out.println("palindrome");
        //     }



  ///
//     }

// }
///// SHORTEST PATH
// public class Strings{
//     public static void main(String[] args) {
//         String dir="NS";
//         int x=0,y=0;
//         for(int i=0;i<dir.length();i++){
//             if(dir.charAt(i)=='W'){
//                 x--;
//             }
//             else if(dir.charAt(i)=='E'){
//                 x++;
//             }
//             else if(dir.charAt(i)=='N'){
//                 y++;
//             }
//             else if(dir.charAt(i)=='S'){
//                 y--;
//             }
//         }
       
//         System.out.println("X= "+x + "  y = "+y);
//         int res=(int)Math.pow(x,2)+(int)Math.pow(y,2);
//         res=(int)Math.sqrt(res);
//         System.out.println("Shortest path = "+res);
//     }
// }

// LARGETS STRING (LEXICOGRAPHIC METHOD)

// public class Strings{
//     public static void main(String[] args) {
//         String fruits[]={"abbbcd","abbbce"};                                                                                 
//         String largest=fruits[0];
//         for(int i=0;i<fruits.length-1;i++){
//             if(fruits[i].compareToIgnoreCase(fruits[i+1])>0){
//                 largest=fruits[i];

//             }
//             else{
//                 largest=fruits[i+1];

//             }
//         }
//         System.out.println("Largest string = "+largest);
//     }
// }

//  convert first letter of each word into uppercase
// import java.lang.*;
// public class Strings{
//     public static String toUpper(String str){
//         StringBuilder sb = new StringBuilder("");
//         char ch=Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' '){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }

//         }
//         return sb.toString();

//     }
//     public static void main(String[] args) {
//         String str="hi, i am deepanshu";
//         System.out.println(toUpper(str));

//     }
// }

// String compression 

public class Strings{
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            Integer count=1;
            char ch=str.charAt(i);
            while(ch==str.charAt(i+1)  && i<str.length()-1){
                count++;
                i++;
            }
            if(count>1){
                sb.append(i);
                sb.append(count);
            }
            else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}