import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa:");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2Lulus;
        double rata2TdkLulus;
        int jmlMhsLulus = 0;
        int jmlMhsTdkLulus = 0;


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlMhsLulus++;
            }
            else {
                totalTdkLulus += nilaiMhs[i];
                jmlMhsTdkLulus++;
            }
        }

        rata2Lulus = totalLulus/jmlMhsLulus;
        System.out.println("Rata-rata nilai = "+rata2Lulus);
        System.out.println("Jumlah mahasiswa yang lulus = " + jmlMhsLulus);
        rata2TdkLulus = totalTdkLulus/jmlMhsTdkLulus;
        System.out.println("Rata-rata nilai = "+rata2TdkLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jmlMhsTdkLulus);
    sc.close();
    }
}