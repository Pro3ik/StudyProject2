package package1;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        //int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12};
        int[] array1 = {10,1, 3, 9, 4, 2, 6, 7, 5, 8};


        //Array reverse
        //funcRev(array1);

        //Bubble Sort
        bSort(array1);


    }

/*    public static void funcRev(int array1[]) {
        for (int i = 0; i < (array1.length)/2; i++) {
            int x = array1[i];
            array1[i] = array1[array1.length - (i+1)];
            array1[array1.length - (i+1)] = x;
        }
        String strArr = Arrays.toString(array1);
        System.out.println(strArr);
    }*/

    public static void bSort(int array1[]) {
        boolean isSorted = false;
        while (isSorted == false) {
            for (int i = 0; i < array1.length - 1; i++) {
                isSorted = true;
                if (array1[i] > array1[i + 1]) {
                    int x = array1[i + 1];
                    array1[i + 1] = array1[i];
                    array1[i] = x;
                    isSorted = false;
                    i=0;
                }
            }
        }
        String strArr = Arrays.toString(array1);
        System.out.println(strArr);
    }
}
