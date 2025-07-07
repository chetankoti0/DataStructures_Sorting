package Sortings;

public class insertionSort {
    public static void main(String ar[]){
        System.out.println("Enter the size");
        int size=Input.sc.nextInt();
        int a[]=new int[size];
        Input.giveInput(a, size);
        int j,temp;
        for(int i=1;i<size;i++){
            j=i-1;
            temp=a[i];
            while(j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        Input.print(a);
    }
    
}
