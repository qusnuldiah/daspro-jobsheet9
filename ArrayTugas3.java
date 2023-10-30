import java.util.Scanner;

public class ArrayTugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jmlElemen = sc.nextInt();

        int[] nilaiElemen = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            nilaiElemen[i] = sc.nextInt();
        }

        int max = nilaiElemen[0];
        int min = nilaiElemen[0];
        int total = nilaiElemen[0];

        for (int i = 1; i < jmlElemen; i++) {
            if (nilaiElemen[i] > max) {
                max = nilaiElemen[i];
            }
            if (nilaiElemen[i] < min) {
                min = nilaiElemen[i];
            }
            total += nilaiElemen[i];
        }

        double rata = (double) total / jmlElemen;
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Rata-rata: " + rata);
        sc.close();
    }
}
