package anagramdetector;

// Program to detect strings are anagram
public class AnagramDetector {
    public void checkAnagram(String[] arr1, String[] arr2){
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals(arr2[i]))
                count++;
        }
        System.out.println();
        if (count==arr1.length) {
            System.out.println("Strings are anagram");
        }else {
            System.out.println("Strings are not anagram");
        }
    }
    public void sort(String[] array){
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i-1;
            while (j>=0 && array[j].compareTo(key)>0){
                array[j+1]=array[j];
                --j;
            }
            array[j+1] = key;
        }
    }
    public static void main(String[] args) {
        String[] arr1= new String[]{"h","e","a","r","t"};
        String[] arr2= new String[]{"e","a","r","t","h"};
        AnagramDetector detector = new AnagramDetector();
        detector.sort(arr1);
        detector.sort(arr2);
        for (String i:arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (String i:arr2) {
            System.out.print(i+" ");
        }
        detector.checkAnagram(arr1,arr2);
    }
}

