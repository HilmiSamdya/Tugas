public class ArrayDuplikat {
    public static void main(String[] args) {
        // Array 1D dengan elemen duplikat
        int[] angka1D = {1, 2, 3, 2, 4, 1, 5, 3};
        System.out.println("Array 1D dengan duplikat:");
        tampilkanArray1D(angka1D);
        System.out.println();

        // Array 2D dengan elemen duplikat
        int[][] angka2D = {
                {10, 20, 10},
                {30, 40, 30, 50},
                {20, 60, 70}
        };
        System.out.println("Array 2D dengan duplikat:");
        tampilkanArray2D(angka2D);
    }

    // Metode untuk menampilkan elemen array 1D
    public static void tampilkanArray1D(int[] arr) {
        for (int angka : arr) {
            System.out.print(angka + " ");
        }
        System.out.println();
    }

    // Metode untuk menampilkan elemen array 2D
    public static void tampilkanArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
