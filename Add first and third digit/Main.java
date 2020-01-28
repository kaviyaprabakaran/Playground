import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
	  int n1=n/100;
      int n3=n%10;
      int sum=n1+n3;
      System.out.println(sum);
	}
}