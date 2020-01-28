import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        for(int i = 0; i <= size - 1; i++)
        {
            array[i] = in.nextInt();
        }
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int elem_1 = -1;
        int elem_2 = -1;
        for(int i = 0; i <= size - 1; i++)
        {
            if(s1 == array[i])
            {
                elem_1 = i;
            }
            if(s2 == array[i]){
                elem_2 = i;
            }
        }
        System.out.println(elem_1);
        System.out.println(elem_2);
    }
}