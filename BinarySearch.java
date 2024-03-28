import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); //As binary Search always works on sorted Arrays
        System.out.println("Sorted Array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search:");
        int key=sc.nextInt();
        int index=binarySearch(arr, key);
        if(index==-1)
        System.out.println("The element not present in the array:");
        else
        System.out.println("The index where the element is found is: "+index);
    }
    private static int binarySearch(int a[], int k){
        int start=0;
        int end=a.length-1;
        int mid=start+(end-start)/2;
        
        while(start<=end){
            if(a[mid]==k)
                return mid;
            else if(a[mid]<k)
                start=mid+1;
            else
                end=mid-1;
            mid=start+(end-start)/2;
        }
        return -1;
    }
}
