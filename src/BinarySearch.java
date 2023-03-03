// Program to find words from list of words
public class BinarySearch {
    public static String[] sort(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void binarySearch(String[] arr,String key){
        int min=0;
        int max=arr.length-1;
        while (min<=max){
            int mid =min+(max-min)/2;

            if(key.equals(arr[mid])){
                System.out.print("Array is ");
                for (String s:arr) {
                    System.out.print(s+" ");
                }
                System.out.println("\n"+key+" found at: "+ mid+1);
                return;
            }
            if(key.compareTo(arr[mid])<0){
                max=mid-1;
            }else {
                min=mid+1;
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        String arr[] = {"shubham","rajesh","kundan"};
        String key = "shubham";
        binarySearch(sort(arr),key);
    }
}