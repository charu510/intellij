package Arrays;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,50};
        System.out.println(Binary(ar,60));
        int[] arr1={0,1,0,2,1,2};
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1);
        }
    }

    public static int Binary(int[] ar, int item) {
        int low = 0;
        int high = ar.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (ar[mid] == item) {
                return mid;
            } else if (ar[mid] > item) {
                high = mid - 1;
            } else if (ar[mid] < item) {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static int[] SortLinear(int[] arr){
        int mid=0;//0
        int low=0;//1
        int hi=arr.length-1;//2
        while(low<=hi){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,hi);
                mid++;
                hi--;
            }

        }
        return arr;
    }
    public static void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        j=temp;
    }
}


