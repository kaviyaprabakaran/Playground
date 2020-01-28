import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int array[]=new int[size];
      int g=0;
      for (int i=0;i<=size-1;i++)
      {
        array[i]=in.nextInt();
      }
      for(int i=0;i<=size-1;i++)
      {
        if(g<=array[i])
        {
          g=array[i];
        }
      }
      System.out.println(g);
    }
}
        
     