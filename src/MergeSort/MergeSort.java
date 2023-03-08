package MergeSort;

//Program for merge sort
public class MergeSort {
    public void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low+i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=low;

        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            } else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr,int p, int q){
        if(p<q){
            int mid = (p + q)/2;
            mergeSort(arr,p,mid);
            mergeSort(arr,mid+1,q);
            merge(arr,p,mid,q);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,6,1,5};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr,0, arr.length-1);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
