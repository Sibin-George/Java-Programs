package javaprograms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 20, 10, 30, 40, 50 };

        Arrays.sort(a);

        int l = 0;
        int key = 20;
        int h = a.length - 1;
        boolean flag = false;

        while (l <= h) {
            int mid = (l + h) / 2;
       

            if (a[mid] == key) {
                System.out.println("Element found");
                flag = true;
                break;
            } else if (a[mid] > key) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (!flag) {
            System.out.println("Element not found");
        }
    }
}
