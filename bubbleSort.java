package Sortings;
public class bubbleSort {
    
    public static void main(String ar[]){
        
        System.out.println("Enter array size:");

        int size= Input.sc.nextInt();
        
        int a[]=new int[size];
        Input.giveInput(a, size);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        Input.print(a);
    }
    
}
