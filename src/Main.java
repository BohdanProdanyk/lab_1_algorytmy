import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
               }
           }
           swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));


        int[] array2 = {10, 2, 10, 3, 2, 5};
        System.out.println(Arrays.toString(array2));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array2.length; i++) {
                if (array2[i] < array2[i - 1]) {
                    swap(array2, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array2));

        int[] array3 = {10, 2, 10, 1, 2, 5};
        System.out.println(Arrays.toString(array3));
        for (int left = 1; left < array3.length; left++) {
            int value = array3[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array3[i]) {
                    array3[i + 1] = array3[i];
                } else {
                    break;
                }
            }
            array3[i + 1] = value;
        }
        System.out.println(Arrays.toString(array3));

        int[] a = {10, 2, 10, 3, 1, 2, 5};
        int j;
        System.out.println(Arrays.toString(a));

        for (int left = 1; left < a.length; left++) {
            int key = a[left];
            if (a[left-1]>a[left]) {
                int leftIndex =0;
                int rightIndex=left-1;
                do{
                    int ser= (leftIndex + rightIndex)/2;
                    if(a[ser] < key) {
                        leftIndex =ser +1;
                    } else {
                        rightIndex = ser;
                    }
                } while(leftIndex < rightIndex);
                for (j=left-1; j>=leftIndex; j--)
                    a[j+1]=a[j];
                a[leftIndex] = key;
            }}
        System.out.println(Arrays.toString(a));

        }

    static void swap(int[] array, int ind1, int ind2 ) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
