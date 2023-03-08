package insertionsort;
//Program for insertion sort
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int i = 1;
        while (i != arr.length){
            int key = arr[i];
            for (int j = i; j > 0; j--) {
                if(key <= arr[j-1]){
                    arr[j] = arr[j-1];
                    arr[j-1] = key;
                }
            }
            i++;
        }
        for (int key:arr) {
            System.out.println(key);
        }
    }
    public static void main(String[] args) {

        int arr[]={3,1,2,4,5,2};
        insertionSort(arr);
    }
}
