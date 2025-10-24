package oop;

public class ArrayMinMax {
    public int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Jika array kosong, kembalikan nilai default (misalnya, min =
            // Integer.MAX_VALUE dan max = Integer.MIN_VALUE)
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
        }
        // Menganggap elemen pertama sebagai nilai min dan max
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // Mengiterasi array untuk mencari nilai minimum dan maksimum
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        // Mengembalikan nilai min dan max dalam array
        return new int[] { min, max };
    }
}