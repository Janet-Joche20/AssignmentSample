
public class Palindrome {

	public static void main(String[] args) {
		
		int a =383,s=0,n,n1;
		n=a;
		while(n>0)
		{
			n1 = n%10;
			s = (s*10)+n1;
			n = n/10;
		}
		
		if(a==s)
		{
			System.out.println(a+" is a palindrome number");
		}
		else
		{
			System.out.println("Not");	
		}
	}

}
