import java.util.Scanner;
public class selectionsort {
public static void Ssort (int arr[],int size){
      // selection sorting
        for(int j=0;j<size-1;j++)
        { int smallest = j;
            for(int i=j+1;i<size;i++)
           {  if(arr[i]<arr[smallest])
            {
                smallest=i;
            } //swap
                int temp = arr[smallest];
                arr[smallest]=arr[j];
                arr[j]=temp;
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
        Ssort(list,list.length);
    }
}