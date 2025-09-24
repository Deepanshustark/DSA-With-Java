
public class db {
    public static void main(String[] args) {
        int binary=1011;
        int b=binary;
        int dec=0;
        int powr=0;
        int ld;
        while(b!=0){
            ld=b%10;
            dec=dec+(ld*(int)Math.pow(2,powr));
            b=b/10;
            powr++;
    
        }
        System.out.print(dec);
    }
}
