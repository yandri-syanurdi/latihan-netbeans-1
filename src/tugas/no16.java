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
public class no16 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : menambahkan_array.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menambahkan nilai sebuah array yang posisi nya ditentukan user
     */
        
         int [] A_yandri = new int [100]; 
         int pos_yandri, c_yandri, n_yandri, nilai_yandri;
         Scanner keyboard = new Scanner(System.in);
         
         
         System.out.print("Masukkan banyak elemen array :  "); 
         n_yandri = keyboard.nextInt();
         
         System.out.println(" ");
         System.out.println("Input " + n_yandri + " buah nilai"); 
         System.out.println(" ");
         
         for ( c_yandri = 0 ; c_yandri < n_yandri ; c_yandri++ ) 
         {
             
             System.out.print("Nilai ke-" + (c_yandri+1) + " = " ); 
             A_yandri[c_yandri] = keyboard.nextInt();
         } 
         System.out.println(" ");
         System.out.print("Masukkan lokasi tempat nilai baru akan diisikan : "); 
         pos_yandri = keyboard.nextInt();
         System.out.println(" ");
         System.out.println(" ");
         System.out.print("Masukkan nilai baru yang akan diisikan : "); 
         nilai_yandri = keyboard.nextInt();
         System.out.println(" ");
         
         for ( c_yandri = n_yandri - 1 ; c_yandri >= pos_yandri - 1 ; c_yandri-- ) 
         {
             A_yandri[c_yandri+1] = A_yandri[c_yandri];
         }
         
         A_yandri[pos_yandri-1] = nilai_yandri; 
         
        System.out.println("Array setelah penambahan nilai baru adalah : "); 
        System.out.println(" "); 

         
         for( c_yandri = 0 ; c_yandri <= n_yandri ; c_yandri++ ) 
         {
             System.out.println("Nilai ke- " + (c_yandri+1) +  " = " + A_yandri[c_yandri]);
         }
         
         System.out.println(" ");
         
        }
 }
    

