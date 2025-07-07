package Sortings;

public class selectionSort {
    public static void main(String ar[]){
        System.out.println("Enter array size:");

        int size= Input.sc.nextInt();
        
        int a[]=new int[size];
        Input.giveInput(a, size);
        
        int min;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int c=a[i];
            a[i]=a[min];
            a[min]=c;
            
        }
        Input.print(a);
    }
    
}
