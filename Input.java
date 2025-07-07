package Sortings;
import java.util.*;
public class Input {
    
    public static final void print(int a[]){
        System.out.println("Sorted array :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static final Scanner sc=new Scanner(System.in);

    public static final void giveInput(int a[],int size){
        System.out.println("Enter "+size+" inputs :");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

    }
}
