//4.  Реализуйте методы merge(int[] array1, int[] array2), merge(int[] array1, int[] array2,int[] array3), merge(int[] array1, int[] array2,
//    int[] array3, int[] array4) - который возвращает новый массив, в котором он соединяет все предыдущие (было 3 массива по 10 элементов,
//    станет массив с 20 элементами).

public class T3_Y8_Homework_4 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {9, 10, 11, 12, 12, 14};
        int[] array4 = {15, 16, 17};


        getMergeArray(array1, array2);
        getMergeArray(array1, array2, array3);
        getMergeArray(array1, array2, array3, array4);


    }

    static int[] getMergeArray(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        for (int x = 0; x < array1.length; x++) {
            array[x] = array1[x];
        }
        int y = 0;
        for (int x = array1.length; x < (array1.length + array2.length); x++) {
            array[x] = array2[y];
            y++;
        }
        return array;
    }

    static int[] getMergeArray(int[] array1, int[] array2, int[] array3) {
        int[] array = new int[array1.length + array2.length + array3.length];

        for (int x = 0; x < array1.length; x++) {
            array[x] = array1[x];
        }
        int y = 0;
        for (int x = array1.length; x < (array1.length + array2.length); x++) {
            array[x] = array2[y];
            y++;
        }

        y = 0;
        for (int x = array1.length + array2.length; x < (array1.length + array2.length + array3.length); x++) {
            array[x] = array3[y];
            y++;
        }
        return array;
    }

    static int[] getMergeArray(int[] array1, int[] array2, int[] array3, int[] array4) {
        int[] array = new int[array1.length + array2.length + array3.length+array4.length];

        for (int x = 0; x < array1.length; x++) {
            array[x] = array1[x];
        }
        int y = 0;
        for (int x = array1.length; x < (array1.length + array2.length); x++) {
            array[x] = array2[y];
            y++;
        }

        y = 0;
        for (int x =array1.length + array2.length; x < (array1.length + array2.length + array3.length); x++) {
            array[x] = array3[y];
            y++;
        }

        y = 0;
        for (int x =array1.length + array2.length + array3.length; x < (array1.length + array2.length + array3.length + array4.length); x++) {
            array[x] = array4[y];
            y++;
        }
        return array;
    }
}
