import java.util.Scanner;

public class mergeSort {
  
  
    public static void conquer(int arr[], int si,int mid, int ei){
    int[] mearge= new int [ei-si+1];
    int indx1=si;
    int indx2=mid+1;
    int x =0;
    while(indx1<=mid && indx2<=ei)
    {  if(arr[indx1]<=arr[indx2]){
         mearge[x] = arr[indx1];
         x++;indx1++;
         }
        else{
            mearge[x++]=arr[indx2++];
         }
    }
    while (indx2<=ei) {
        mearge[x]= arr[indx2];
          indx2++;
          x++;   
          }     
    while(indx1<=mid) {
        mearge[x++]=arr[indx1++];   
          }

   //  coping to original  array
    for(int i=0; i<mearge.length;i++)
      {
        arr[si+1]=mearge[i];
      }
   }


   public static void divide( int arr[] ,int si,int ei){
    if(si>=ei){
        return;
    }

    int mid = si + (ei-si)/2;
    divide(arr,si,mid);
    divide(arr,mid+1,ei);
    conquer(arr, si,mid, ei);
   }
   

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size =sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter your array :");
        for(int i=0 ;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        divide(arr,0, size-1);

        for(int i=0;i<arr.length;i++){ 
        System.out.print(arr[i]+" ");}
        System.out.println();
    }
}
