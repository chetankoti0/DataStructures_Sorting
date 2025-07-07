package Sortings;

public class mergeSort {
    public static void merge(int a[],int lb,int mid,int ub){
        int b[]=new int[ub+1];
        int i=lb;
        int j=mid+1;
        int k=lb;
        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){
                b[k]=a[i];
                
                i++;
            }
            else{
                b[k]=a[j];
               
                j++;
            }
            k++;
        }
        while(j<=ub && i>mid){
            b[k]=a[j];
            j++;
            k++;
        }
        while(i<=mid && j>=ub){
            b[k]=a[i];
            i++;
            k++;
        }
        for (int x = lb; x <= ub; x++) {
        a[x] = b[x];
    }
    Input.print(b);
    Input.print(a);

    }
    public static void div(int a[],int lb,int ub){
        int mid;
        if(lb<ub){
            mid=(lb+ub)/2;
            div(a,lb,mid);
            div(a,mid+1,ub);
            merge(a,lb,mid,ub);

        }
        
    }
    public static void main(String ar[]){
        System.out.println("Enter the size of the array");
        int n=Input.sc.nextInt();
        int a[]=new int[n];
        Input.giveInput(a, n);
        int lb=0,ub=n-1;
        div(a,lb,ub);
    }
    
}
