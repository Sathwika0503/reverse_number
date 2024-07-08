public class ReverseNumber{
	public static void main(String args[]){
		int n1=Integer.parseInt(args[0]);
		int temp=n1;
		int rem,rev=0;
		while(n1>0){
			rem=n1%10;
			rev=rev*10 + rem;
			n1=n1/10;
		}
		System.out.println("Rverse of "+temp+" is "+rev);
	}
}

