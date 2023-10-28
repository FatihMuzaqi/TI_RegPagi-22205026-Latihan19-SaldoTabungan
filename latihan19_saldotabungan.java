package tipedata;
import java.text.DecimalFormat;
import java.util.Scanner;
public class latihan19_saldotabungan {
   public static void main(String[] args){
    Scanner inputan = new Scanner(System.in);
        int saldoAwal, bungaPerBulan, lamaBulan;
        System.out.print("Saldo awal: Rp. ");
        saldoAwal = inputan.nextInt();
        System.out.print("Bunga per bulan (%): ");
        bungaPerBulan = inputan.nextInt();
        System.out.print("Lama (bulan): ");
        lamaBulan = inputan.nextInt();

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan / 100);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedsaldoAwal = decimalFormat.format(saldoAwal);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + formattedsaldoAwal);
        }
    }
}