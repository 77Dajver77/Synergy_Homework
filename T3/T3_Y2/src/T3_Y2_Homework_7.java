//7.  Напишите метод, который возвращает наибольший элемент массива.
//8.  Напишите метод, который принимает три массива, а возвращает массив, сумма элементов которого самая большая.
//9.  Напишите метод, который принимает массив чисел, а возвращает исходный массив, но без отрицательных чисел.
public class T3_Y2_Homework_7 {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 2, 3, 0, 5};
        int[] number2 = {10, 12, 22, 3, 0, 8};
        int[] number3 = {-9, 18, 2, -43, 230, -228};
        int[] bigArray = symmaArray(number1, number2, number3);
        int[] absArray = modArray(number3);
        System.out.println("Максимальное значение в массиве = " + numberMax(number2));
        System.out.println("Массив с максимальной суммой элементов");
        for (int x = 0; x < number1.length; x++){
            System.out.println(bigArray[x]);
        }
        System.out.println("Массив без отрицательных чисел");
        for (int x = 0; x < absArray.length; x++){
            System.out.println(absArray[x]);
        }
    }

    static int numberMax(int[] arrayMax) {
        int max = arrayMax[0];
        for (int x = 0; x < arrayMax.length; x++) {
            if (max < arrayMax[x]) {
                max = arrayMax[x];
            }
        }
        return max;
    }

    static int[] symmaArray(int[] array1, int[] array2, int[] array3) {
        int symma1 = 0, symma2 = 0, symma3 = 0;
        for (int x = 0; x < array1.length; x++) {
            symma1 = array1[x] + symma1;
            symma2 = array2[x] + symma2;
            symma3 = array3[x] + symma3;
        }
        if ((symma1 > symma2)) {
            if (symma1 > symma3) {
                return array1;
            } else return array3;
        }
        if (symma2 > symma3) {
            return array2;
        } else return array3;
    }

    static int[] modArray (int[] array){
        for (int x = 0; x < array.length; x++){
            array[x] = Math.abs(array[x]);
        }
        return array;
    }
}
