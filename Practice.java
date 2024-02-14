import java.util.*;
public class Practice
{
    public static void conquer(int arr[],int l,int mid,int r)
    {
        int merged[] = new int [r-l+1];

        int idx1 = l;
        int idx2 = mid+1;
        int x = 0 ;

        while(idx1 <= mid && idx2 <= r)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid)
        {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <=r)
        {
            merged[x++] = arr[idx2++];
        }

        
        for(int i=0,j=l ;i<merged.length;i++,j++)
        {
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[],int l,int r)
    {
        if(l >= r)
        {
            return;
        }
        int mid = l+(r-l)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, r);
        conquer(arr, l, mid, r);

    }
    public static void main(String args [])
    {
        int arr[] = {7,8,5,4,9,2,6,4};
        int n = arr.length;
        divide(arr, 0, n-1);
        System.out.println("Sorted array is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}