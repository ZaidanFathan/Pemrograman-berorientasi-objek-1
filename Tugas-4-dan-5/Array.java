import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi Array
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5]; // Membuat array kosong dengan ukuran 5

        // Inisialisasi array2 menggunakan loop
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 2; // Mengisi array2 dengan angka genap
        }

        // Percabangan menggunakan if dan switch
        int number = 3;
        if (number < 5) {
            System.out.println("Number is less than 5");
        } else if (number == 5) {
            System.out.println("Number is equal to 5");
        } else {
            System.out.println("Number is greater than 5");
        }

        // Menggunakan switch
        switch (number) {
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            case 3:
                System.out.println("Number is Three");
                break;
            default:
                System.out.println("Number is something else");
                break;
        }

        // Perulangan dengan for
        System.out.println("Array1 elements using for loop:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // Perulangan dengan while
        int j = 0;
        System.out.println("Array2 elements using while loop:");
        while (j < array2.length) {
            System.out.println(array2[j]);
            j++;
        }

        // Perulangan dengan do-while
        int k = 0;
        System.out.println("Array1 elements using do-while loop:");
        do {
            System.out.println(array1[k]);
            k++;
        } while (k < array1.length);

        // Menyalin array
        int[] arrayCopy = Arrays.copyOf(array1, array1.length);
        System.out.println("Copied array:");
        System.out.println(Arrays.toString(arrayCopy));

        // Array Multidimensional
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan elemen dari array multidimensi
        System.out.println("Multidimensional Array:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int l = 0; l < multiArray[i].length; l++) {
                System.out.print(multiArray[i][l] + " ");
            }
            System.out.println();
        }

        // Resizing array (menggunakan ArrayList)
        java.util.ArrayList<Integer> dynamicArray = new java.util.ArrayList<>();
        for (int m = 0; m < 5; m++) {
            dynamicArray.add(m); // Menambahkan elemen
        }
        System.out.println("Dynamic Array after adding elements: " + dynamicArray);

        // Menggunakan break dan continue
        System.out.println("Break and Continue Example:");
        for (int n = 0; n < 10; n++) {
            if (n == 5) {
                continue; // Lewati angka 5
            }
            if (n == 8) {
                break; // Hentikan loop jika n mencapai 8
            }
            System.out.println(n);
        }
    }
}
