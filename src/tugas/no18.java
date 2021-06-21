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
public class no18 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : bubble sort.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : mengurutkan isi tabel dari besar ke kecil menggunakan algoritma bubble sort
     */
        
        int [] A_yandri = new int [100];
        int n_yandri, i_yandri, d_yandri, swap_yandri,c_yandri; 
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan banyak isi array : "); 
        n_yandri = keyboard.nextInt();
        
        
        System.out.println("Masukkan " + n_yandri +  " buah angka "); 
        System.out.println(" ");
        
        for ( i_yandri = 0 ; i_yandri<n_yandri ; i_yandri++ ) 
        {
            A_yandri[i_yandri] = keyboard.nextInt();
        }

        for ( i_yandri = 1 ; i_yandri <= ( n_yandri - 1 ) ; i_yandri++ ) 
        { 
            for ( d_yandri = n_yandri-1 ; d_yandri>=i_yandri ; d_yandri-- ) 
            { 
                if ( A_yandri[d_yandri] > A_yandri[d_yandri-1] ) 
                { 
                    swap_yandri = A_yandri[d_yandri]; 
                    A_yandri[d_yandri] = A_yandri[d_yandri-1]; 
                    A_yandri[d_yandri-1] = swap_yandri; 
                } 
            } 
        } 
        System.out.println("Isi array besar ke kecil: "); 
        System.out.println(" ");
        for ( i_yandri = 0 ; i_yandri < n_yandri ; i_yandri++ ) 
        {
            System.out.print(" " + A_yandri[i_yandri]);
        }
           System.out.println(" ");
           System.out.println(" ");
           System.out.println(" ");

        }
    
}
