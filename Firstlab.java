import java.util.Scanner;
public class Firstlab {
	
	
	public void add(){
		System.out.println("Enter any two number");
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum is : "+sum);
	}
	
	public void greatest() {
		int c,d;
		System.out.println("Enter any two number");
		Scanner sc = new Scanner(System.in);
		c=sc.nextInt();
		d=sc.nextInt();
		if(c>d) {
			System.out.println(c+" is greatest");
		}
		else if (d>c) {
			System.out.println(d+" is greatest");
		}
		else {
			System.out.println("Both are Equal");
		}
	}
	
	public void odd() {
		int e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  number");
		e=sc.nextInt();
		if(e%2==0) {
			System.out.println(e+ " is even");
		}
		else {
			System.out.println(e+" is odd");
		}
	}
	public void reverse() {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int f;
		int rev = 0 ,rem ;
		f=sc.nextInt();
		while(f!=0) {
			rem=f%10;
			rev=rev*10+rem;
			f=f/10;
		}
		System.out.println("Reverse is : "+rev);
	}
	
	public void digits() {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int digit,sum=0;
		while(g > 0)  
		{  
		//finds the last digit of the given number    
		digit = g % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		g = g / 10;  
		}  
		System.out.println("Sum is : "+sum);
	}
	
	public void palindrome() {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int f;
		int rev = 0 ,rem ;
		f=sc.nextInt();
		int real = f;
		while(f!=0) {
			rem=f%10;
			rev=rev*10+rem;
			f=f/10;
		}
		if (real==rev) {
		System.out.println(real+"Palindrome");
		}
		else {
			System.out.println(real+" Not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		Firstlab ob = new Firstlab();
		ob.add();
		ob.greatest();
		ob.odd();
		ob.reverse();
		ob.digits();
		ob.palindrome();
	}
}