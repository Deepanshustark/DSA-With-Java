public class dv {
    public static void main(String[] args) {
        int dec=7;
        int bin=0,powr=0;
        int d,ld;
        d=dec; 
        while(d!=0){
            ld=d%2;
            bin=(ld*(int)Math.pow(10,powr))+bin;
            d=d/2;
            powr++;
        }
        System.out.println(bin);
    }

}
