package ti_regsore.pkg22205039.latihan23.nilai_terbesar_terkecil;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program nilai terbesar dan terkecil
*/
import java.util.Scanner;
public class TI_RegSore_22205039Latihan23Nilai_terbesar_terkecil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
 
        int maks = 0,min = 100;
        System.out.println("===== PROGRAM NILAI TERBESAR DAN TERKECIL =====");
        System.out.print("Masukan Nama Petugas : ");
        String Nama = input.nextLine();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        int jml = input.nextInt();
        for(int i = 1; i <= jml; i++){
            System.out.print(" Masukan Nilai Mahasiswa Ke " + i + " : ");
            int angka = input.nextInt();
            if(angka > maks){
                maks = angka;
            }else if(angka < min ) {
                min = angka;
            }
        }
        System.out.println("========= HASIL NILAI MAHASISWA ==========");
        System.out.println("Nilai Terbesar Adalah  = " + maks);
        System.out.println("Nilai Terkecil Adalah  = " + min);
    } 
}