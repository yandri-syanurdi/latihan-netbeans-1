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


public class no13 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : array3.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menghitung total dan rata-rata nilai 10 orang mahasiswa yang disimpan dalam array
     */
        
        
        int [] nilai_yandri = new int [100];
        int indeks_yandri, n_yandri;
        float total_yandri,ratarata_yandri;
        Scanner keyboard = new Scanner(System.in);
        //Pembacaan data dari keyboard
        System.out.print("Masukan banyak data : "); 
        n_yandri = keyboard.nextInt(); 
        System.out.println("Pembacaan data nilai "); 
        System.out.println("");
        for (indeks_yandri=0;indeks_yandri<n_yandri;indeks_yandri++)
        { 
            System.out.print("Nilai mahasiswa ke - " + (indeks_yandri+1) + " = ");
            nilai_yandri[indeks_yandri] = keyboard.nextInt();
        } 
        // Perhitungan total dan rata-rata 
        total_yandri=0; 
        for (indeks_yandri=0;indeks_yandri<n_yandri;indeks_yandri++) 
        {
           total_yandri=total_yandri+nilai_yandri[indeks_yandri]; 
        }   
        //endfor 
        ratarata_yandri=(float)total_yandri/n_yandri; 
        // Menampilkan data yang telah dimasukan dan rata-rata. 
        System.out.println("");
        System.out.println("");
        System.out.println(" Menampilkan Data Nilai "); 
        System.out.println("");
        for (indeks_yandri=0;indeks_yandri<n_yandri;indeks_yandri++) 
        {
            System.out.println("Nilai mahasiswa ke- " + (indeks_yandri+1) + " = "  + nilai_yandri[indeks_yandri]);
        }
        System.out.println("");    
        System.out.println("Total = " + total_yandri); 
        System.out.println("");
        System.out.println("");
        System.out.println("Rata-rata = " + ratarata_yandri);
        System.out.println("");
        
    
  }

    
}
