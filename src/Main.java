import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {42,76,34,23,35,87,54,12,98,93,85,65,11,14};
        System.out.println(Arrays.toString(getArray(array)));
    }

    public static int[] getArray(int[] array) {
        int[] array1 = new int[5];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
            if (i > 1 && i < 7) {
                array1[j] = array[i];
                j++;
            }
        }
        return array1;
    }
}