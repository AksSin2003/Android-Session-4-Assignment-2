import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int limit=100;

Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int i=sc.nextInt();
	     {
			boolean isPrime=true;
			
			
			for(int b=2;b<i;b++)
			{
				if (i%b==0){
						isPrime=false;
						break;
				}
			}
			if (isPrime){
				System.out.print( "It is a Prime Number.");
			}
			else
			{
				System.out.print("It is a Composite Number.");
			}
		}


	}

}
