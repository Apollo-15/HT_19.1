package app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        arrayUtils.mergeSort(arrayUtils.array, 0, arrayUtils.array.length - 1);
        System.out.println("Array from smaller to bigger number: " + Arrays.toString(arrayUtils.array));

        int binaryFounded = arrayUtils.binarySearch(arrayUtils.array, 78);
        System.out.println("Founded by index: " + binaryFounded);
    }
}