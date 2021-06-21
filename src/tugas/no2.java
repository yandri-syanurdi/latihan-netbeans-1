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
public class no2 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : tukar.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menukar isi dua buah variabel
     */
        int bil1_yandri, bil2_yandri; //variabel yang akan ditukar
        int temp_yandri; //variabel bantuan 
        
        bil1_yandri = 23; 
        bil2_yandri = -10; 
        System.out.println("Sebelum ditukar bil1 = " + bil1_yandri + " bil2 = " + bil2_yandri);
       //proses menukar isi variabel
        temp_yandri=bil1_yandri;
        bil1_yandri=bil2_yandri;
        bil2_yandri=temp_yandri;
        
        System.out.println("Setelah ditukar bil1 = " + bil1_yandri + " bil2 = " + bil2_yandri);
        
    } 
    
}
