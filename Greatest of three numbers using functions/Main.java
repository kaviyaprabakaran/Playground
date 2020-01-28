import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=in.nextInt();
    int n3=in.nextInt();
    int r=greatest(n1,n2,n3);
    System.out.println(r);
  }
  public static int greatest(int n1,int n2,int n3)
  { 
    int h=0,greatest=0;
    if(n1>n2)
    {
      if(n1>n3)
      {
        h=n1;
      }
      else{
        h=n3;
      }
      greatest=h;
    }
    if(n1<n2)
    {
      if(n2>n3)
      {
        h=n2;
      }
      else{
        h=n3;
      }
        greatest=h;
    }
    return greatest;
  }
}