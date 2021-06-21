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
public class no15 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : menghapus_array.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menghapus posisi nilai sebuah array yang ditentukan user
     */
        
        
        int [] A_yandri = new int [100];
        int pos_yandri, c_yandri, n_yandri;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan banyak elemen array : "); 
        n_yandri = keyboard.nextInt();  
        System.out.println(" ");
        System.out.println("Masukkan " + n_yandri + " buah data "); 
        System.out.println(" ");
        for ( c_yandri = 0 ; c_yandri < n_yandri ; c_yandri++ ) 
        {
            System.out.print("Nilai ke- " + (c_yandri+1) + " = "); 
            A_yandri[c_yandri] = keyboard.nextInt(); 
        } 
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Masukkan posisi nilai yang ingin anda hapus : "); 
        pos_yandri = keyboard.nextInt(); 
        
        if ( pos_yandri >= n_yandri+1 || pos_yandri<=0 ) 
        {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Posisi tidak ada. Penghapusan gagal");
            System.out.println(" ");
        }
        else 
        { 
           System.out.println(" ");
           System.out.println(" ");
           System.out.println("Penghapusan berhasil dilakukan."); 
           System.out.println(" ");
            for ( c_yandri = pos_yandri - 1 ; c_yandri < n_yandri - 1 ; c_yandri++ )        
            {
                A_yandri[c_yandri] = A_yandri[c_yandri+1]; 
            }
            
            System.out.println("Array setelah penghapusan\n"); 
            
            for( c_yandri = 0 ; c_yandri < n_yandri-1 ; c_yandri++ ) 
            {
               System.out.println("Nilai ke- " + (c_yandri+1) + " = " + A_yandri[c_yandri]);  
            }  
            System.out.println(" ");
        }
 
  }
    
}
