import java.util.Scanner;

class quickSort{
    public static int partition(int list[],int low,int high){
        int pivot=list[high];
        int i=low-1;
        for (int j = low; j < high; j++) {
            if (list[j]<pivot) {
                i++;
                int temp=list[j];
                list[i]=list[j];
                list[j]=temp;
            }
        }
        // swap with pivot 
        i++;
        int temp =list[i];
        list[i]=list[high];
        list[high]=temp;
        return i;
    }
    public static void quicksort(int list[],int low,int high){
        if(low < high){
            int pindx= partition(list,low,high);
            quicksort(list,low,pindx-1);
            quicksort(list, pindx+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // taking input
        System.out.println("enter your element:");
        for(int i=0;i<size;i++ )
        {
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,size-1);
        // printing sorted array
        System.out.println("sorted list :");
        for(int i = 0; i<size ;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
}