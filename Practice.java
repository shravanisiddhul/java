import java.util.*;
public class Practice{
	static int PositiveCount;
	static int NegativeCount;
	static int ZeroCunt;
	public static void Count(int PostiveCount,int NegativeCount,int ZeroCount){
		Scanner sc = new Scanner(System.in);
		char choice ;
		do{
			System.out.println("Enter Number: ");
			int n = sc.nextInt();
			
			if(n>0)
			{
				PositiveCount++;
			}else if(n < 0){
				NegativeCount++;
			}else{
			ZeroCount++;
			}
			System.out.println("Do you want to enter Another Number ?(y/n)");
			choice = sc.next().charAt(0);
		}while(choice=='Y' || choice=='y');
		
		System.out.println("Positive Number : "+PositiveCount);
		System.out.println("Negative Number : "+NegativeCount);
		System.out.println("Zero Number : "+ZeroCount);
		
	}
	
	public static void main(String args [])
	{
		Count(0,0,0);
		
	}
}	
				