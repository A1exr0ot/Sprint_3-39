package project;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + min);
    }
}