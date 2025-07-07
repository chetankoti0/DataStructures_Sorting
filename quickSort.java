package Sortings;

public class quickSort {
    public static void swap(int a[],int b,int c)
    {
        int c1=a[b];
        a[b]=a[c];
        a[c]=c1;
    }

    public static int Partition(int a[],int i,int j){
        int c=a[i];
        int start =i+1;
        int end=j;
        while(start<=end){
            if(a[start]<c){
                start++;
            }
            if(a[end]>c){
                end--;
            }
        }
        if(start<end){
            swap(a,start,end);
        }
        swap(a,i,end);
        return end;
    }

    public static void quickSort1(int a[],int lb,int up)
    {
        if(lb<up){
            int loc=Partition(a,lb,up);
            quickSort1(a,lb,loc-1);
            quickSort1(a,loc+1,up);
        }
       
    }

    public static void main(String ar[]){
        
        System.out.println("Enter size of the array :");
        int n=Input.sc.nextInt();
        int a[]=new int[n];
        Input.giveInput(a, n);
        quickSort1(a,0,n-1);
        Input.print(a);
    }
    
}
