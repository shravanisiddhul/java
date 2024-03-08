import bank.*;

// Access Modifiers 
class Account
{
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }
}
public class Bank{
    public static void main(String args [])
    {
        Account acc1 = new Account();
        acc1.name = "Shravani";
        acc1.email = "shravanisiddhul1473@gmail.com";
        acc1.setPassword("123");
        
        System.out.println("Name is : "+acc1.name);
        System.out.println("Email is : "+acc1.email);
        System.out.println("password is :"+acc1.getPassword());
    }

}