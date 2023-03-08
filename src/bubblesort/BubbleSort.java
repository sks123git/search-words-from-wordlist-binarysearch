package bubblesort;

// Program to sort using bubble sort
public class BubbleSort {
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int key:array) {
            System.out.print(key+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={2,1,4,3,7,3};
        System.out.println("array");
        for (int i:array) {
            System.out.print(i+" ");
        }
        System.out.println("\nSorted array is");
        bubbleSort(array);

    }
}