package Java_Basics;

import java.util.Arrays;

class ArrayBasics {
    public static void main(String[] args) {
        System.out.println("Java Arrays Basics");
        // type[] varname = new type[size];
        // declaration
        int[] arr1;
        // instantiation or memory allocation
        arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        // declaration and instantiation
        int[] arr = new int[5];
        // initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // Declaring array literal
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        // array size
        int size = intArray.length;
        System.out.println("Size of the array: " + size);
        // accessing the elements of the specified array
        for (int i = 0; i < size; i++)
            System.out.println("Element at index " + i + " : " + intArray[i]);

        System.out.println(Arrays.binarySearch(arr, 40));
        System.out.println(Arrays.asList(intArray));
        System.out.println(Arrays.equals(arr, arr1));
        Arrays.fill(arr1, 6);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}