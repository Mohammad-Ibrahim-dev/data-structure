 import java.util.Scanner;
 public class bubblesort {
    public static void sort (int arr[],int size){
      // bubble sorting
        for(int j=0;j<size;j++)
        { for(int i=0;i<size-1;i++)
           {  if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
           }
        } 
        System.out.println("------ YOUR SORTED LIST -------");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number of element :");
        int max = scan.nextInt();
        int list[] = new int[max];
        //taking input element
        System.out.println("enter the element :");
        for(int i=0;i<max;i++)
        {
            list[i] =scan.nextInt();
        }
        sort(list,list.length);
    }
}