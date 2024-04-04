import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10001));
        }
        System.out.println(Arrays.toString(array));
        long c = System.currentTimeMillis();
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
        long m = System.currentTimeMillis();
        long b=m-c;
        System.out.println("Time: " + b);


        int[] array2= new int[10000];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int) (Math.random() * 10001));
        }
        System.out.println(Arrays.toString(array2));
        long time2 = System.currentTimeMillis();
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
        long time3 = System.currentTimeMillis();
        long time4 = time3-time2;
        System.out.println("Time: " + time4);

        int[] array3= new int[10000];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = ((int) (Math.random() * 10001));
        }
        System.out.println(Arrays.toString(array3));
        long time5 = System.currentTimeMillis();
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
        long time6 = System.currentTimeMillis();
        long time7 = time6-time5;
        System.out.println("Time: " + time7);

        int[] a= new int[10000];

        for (int i = 0; i < a.length; i++) {
            a[i] = ((int) (Math.random() * 10001));
        }
        int j;
        System.out.println(Arrays.toString(a));
        long time8 = System.currentTimeMillis();

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
        long time9 = System.currentTimeMillis();
        long time10 = time9-time8;
        System.out.println("Time: " + time10);


        }

    static void swap(int[] array, int ind1, int ind2 ) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
