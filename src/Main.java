import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
//Сортування обміном
//        System.out.println("Сортування обміном");
//        int[] array = {8,6,1,4,2,9,3,5,7};
//        System.out.println(Arrays.toString(array));
//        boolean needIteration = true;
//        while (needIteration){
//            needIteration = false;
//            for (int i = 1; i < array.length; i++){
//                if (array[i] < array[i - 1]){
//                    swap(array,i,i-1);
//                    needIteration = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));

//Сортування вибором
//        System.out.println("Сортування вибором");
//        int[] array1 = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println(Arrays.toString(array1));
//        for (int left = 0; left < array1.length; left++) {
//            int minInd = left;
//            for (int i = left; i < array1.length; i++) {
//                if (array1[i] < array1[minInd]) {
//                    minInd = i;
//                }
//            }
//            swap(array1, left, minInd);
//        }
//        System.out.println(Arrays.toString(array1));

//Сортування вставками з лінійним пошуком
//        System.out.println("Сортування вставками з лінійним пошуком");
//        int[] array2 = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println(Arrays.toString(array2));
//        for (int left = 1; left < array2.length; left++) {
//            int value = array2[left];
//            int i = left - 1;
//            for (; i >= 0; i--) {
//                if (value < array2[i]) {
//                    array2[i + 1] = array2[i];
//                } else {
//                    break;
//                }
//            }
//            array2[i + 1] = value;
//        }
//        System.out.println(Arrays.toString(array2));

////Сортування вставками з бінарним пошуком
//        System.out.println("Сортування вставками з бінарним пошуком"); //найшвидший алгоритм
//        int[] array3 = {10, 2, 10, 3, 1, 2, 5};
//        for (int left = 1; left < array3.length; left++) {
//            int key = array3[left];
//            if (array3[left - 1] > array3[left]) {
//                int leftIndex = 0;
//                int rightIndex = left - 1;
//                int ser;
//                do {
//                    ser = (leftIndex + rightIndex) / 2;
//                    if (array3[ser] < key) {
//                        leftIndex = ser + 1;
//                    } else {
//                        rightIndex = ser;
//                    }
//                } while (leftIndex < rightIndex);
//                for (int j = left - 1; j >= leftIndex; j--)
//                    array3[j + 1] = array3[j];
//                array3[leftIndex] = key;
//            }
//        }
//        System.out.println(Arrays.toString(array3));
//    }
//}
// Сортування з рандомного елемента
//        int[] array4 = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println("Сортування з рандомного елемента");
//        System.out.println(Arrays.toString(array4));
//
//        Random random = new Random();
//        int startIndex = random.nextInt(array4.length);
//
//        sortFromIndex(array4, startIndex);
//
//        System.out.println("Масив після сортування з позиції " + startIndex + ":");
//        System.out.println(Arrays.toString(array4));
//
//    } public static void sortFromIndex(int[] array, int startIndex) {
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

//    public static void swap(int[] array, int ind1, int ind2){
//        int tmp = array[ind1];
//        array[ind1] = array[ind2];
//        array[ind2] = tmp;
//    }
