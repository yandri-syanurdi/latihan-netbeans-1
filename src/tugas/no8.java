/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author LENOVO G405
 */
import java.util.Scanner;
public class no8 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : tiketbis.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menentukan total pembelian tiket bis
     */
        
       int menu_yandri,jum_tiket_yandri; 
       int harga_yandri;
       int tot_awal_yandri; 
       double tot_bayar_yandri; 
       double diskon_yandri;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Program Pembelian Tiket "); 
       System.out.println("====================================== "); 
       System.out.println("| KELAS || HARGA/ORANG |"); 
       System.out.println("====================================== "); 
       System.out.println("|1. Ekonomi || Rp.150.000,- |"); 
       System.out.println("|2. Eksekutif || Rp.250.000,- |"); 
       System.out.println("|3. Super Eksekutif || Rp.350.000,- |"); 
       System.out.println("======================================"); 
       System.out.print("Masukkan kelas tiket pilihan anda (1/2/3) : "); 
       menu_yandri = keyboard.nextInt(); 
       switch (menu_yandri)
       
        { 
            case 1 : { System.out.print("Masukkan jumlah tiket yang ingin dibeli : "); 
            jum_tiket_yandri = keyboard.nextInt(); 
            System.out.println("Tiket Kelas Ekonomi sebanyak " + jum_tiket_yandri +  " buah "); 
            harga_yandri = 150000; 
            break; 
            } 
            case 2 : { System.out.print("Masukkan jumlah tiket yang ingin dibeli : "); 
            jum_tiket_yandri = keyboard.nextInt(); 
            System.out.println("Tiket Kelas Eksekutif sebanyak " + jum_tiket_yandri +  " buah "); 
            harga_yandri = 250000; 
            break; 
            }
            case 3 : { System.out.print("Masukkan jumlah tiket yang ingin dibeli : "); 
            jum_tiket_yandri = keyboard.nextInt(); 
            System.out.println("Tiket Kelas Super Eksekutif sebanyak " + jum_tiket_yandri +  " buah ");
            harga_yandri = 350000; 
            break; 
            } 
            default : { System.out.println("Maaf, pilihan tidak tersedia "); 
            jum_tiket_yandri = 0;
            harga_yandri = 0;
            } 
        
     } 
       
       tot_awal_yandri = jum_tiket_yandri * harga_yandri; 
       if (jum_tiket_yandri>4 && tot_awal_yandri!=0)
       { 
           System.out.println("Selamat anda mendapat diskon 10%!!"); 
           
           diskon_yandri =  0.1 * tot_awal_yandri;
           
       } 
       else //jum_tiket_yandri<=4 
       {
           diskon_yandri = 0; 
       }
       tot_bayar_yandri = tot_awal_yandri - diskon_yandri; 
       System.out.println("Biaya tiket yang harus dibayar = " + tot_bayar_yandri);
       
       
    
}

}