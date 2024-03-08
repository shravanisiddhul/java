import bank.*;

class Account
{
	public String name;
	protected String email;
	private String password;

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String str)
	{
		this.password = str;
	}
}
public class Practice
{
	public static void main(String args [])
	{
		Account acc2 = new Account();
		acc2.name = "Shravani";
		acc2.email = "shravanisiddhul1473@gmail.com";
		acc2.setPassword("123");
		System.out.println(acc2.name);
		System.out.println(acc2.email);
		System.out.println(acc2.getPassword());
	}

}