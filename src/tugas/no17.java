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
public class no17 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : mencari_array.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : mencari nilai sebuah array
     */
        
        int nilai_yandri [ ] ={2,5,4,2,3,2}; 
        int i_yandri,x_yandri,jum_yandri,flag_yandri;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan nilai yang dicari = ");
        x_yandri = keyboard.nextInt();
        System.out.println(" ");
        System.out.println("---Isi Array---");
        System.out.println(" ");
        
        for (i_yandri=0;i_yandri<=5;i_yandri++) 
        {
            System.out.println("Nilai " + i_yandri +  " = " + nilai_yandri[i_yandri]); 
        }
        
        System.out.println(" "); 
        System.out.println(" ");
        i_yandri=0; 
        jum_yandri=0; 
        flag_yandri=0; 
        while (i_yandri<=5) 
        { 
            if(nilai_yandri[i_yandri]==x_yandri) 
            { 
                flag_yandri=1; 
                System.out.println("Nilai " + x_yandri + " ada pada indeks ke " + i_yandri); 
                jum_yandri=jum_yandri+1; 
            } 
            i_yandri++; 
        } 
        if(flag_yandri!=1) 
        {
            System.out.println("Nilai tidak ada");
        }
        System.out.println(" ");     
        System.out.println("Ditemukan sebanyak " + jum_yandri + " kali "); 

        }
    
}
