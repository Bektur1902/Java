package lesson3;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {

        // Task 1
//        int [] array1 = {1,1,3};
//        int [] array2 = {1,1,3};
//        String isEqual;
//
//        if (array1.length == array2.length) {
//            isEqual = "Да";
//            for (int i = 0; i < array1.length; i++) {
//                if (array1[i] != array2[i]) {
//                    isEqual = "Нет";
//                    break;
//                }
//            }
//        }else {
//            isEqual = "Нет";
//        }
//        System.out.println(isEqual);

        // Task 2
//        int[] array1 = {1,2,3};
//        int[] array2 = {4,5,6};
//
//        int[] resArray = new int[array1.length + array2.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            resArray[i * 2] = array1[i];
//            resArray[i * 2 + 1] = array2[i];
//        }
//        System.out.println(Arrays.toString(resArray));

        // Task3
//        char[] arr = {'a', 'b', 'x', 'y', 'z'};
//        String result = "";
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    result = "No";
//                    break;
//                }else {
//                    result = "Yes";
//                }
//            }
//        }
//        System.out.println(result);

        // Task4
//        int[] arr = {1,-2,0,7,5};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //Task 6

        double[] arr = {12.23, 56.03, 118.72, 0.95};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 1 > arr[j] % 1) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
