public class OOPS {
    public static void main(String[] args) {
        Account a=new Account();
        a.name="Deepanshu";
        a.setPass("xyz");
        System.out.println(a.name);
        a.displayPass();
        
    }
}

class Account{
    public String name;
    private String pass;
    public void setPass(String pwd){
        pass=pwd;
    }
    public void displayPass(){
        System.out.println(pass);
    }
}