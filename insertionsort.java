import java.util.Scanner;
public class insertionsort {
    public static void insort (int arr[],int size){
        // bubble sorting
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
            //Keep swapping
            arr[j+1] = arr[j];
            j--;
            }
            arr[j+1] = current;}
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
        insort(list,list.length);
    }
}