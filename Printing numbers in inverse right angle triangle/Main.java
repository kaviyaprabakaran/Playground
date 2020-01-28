import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int num=n;
      for(int row=1;row<=n;row++)
      {
        for(int col=num;col>=1;col--)
        {
          System.out.print(col);
        }
        System.out.print("\n");
        num=(num-1);
      }
    }
}
