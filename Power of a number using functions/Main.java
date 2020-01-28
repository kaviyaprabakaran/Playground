import java.util.Scanner;
class Main
{
  public static int power(int m,int n)
  {
    int r=1;
    for (int i=1;i<=n;i++)
    {
    r=r*m;
    }
    return r;
  }
    public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
      int b=in.nextInt();
      int s=power(a,b);
      int num=s;
      System.out.println(num);
    }
}
    