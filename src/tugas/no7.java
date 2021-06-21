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
public class no7 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : menubalok.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : pilihan hitungan balok
     */
        
        
       int menu_yandri; 
       int p_yandri,l_yandri,t_yandri; 
       int la_yandri, lp_yandri, v_yandri;
       Scanner keyboard = new Scanner(System.in);
        System.out.println(" Menu Balok "); 
        System.out.println("1.Hitung luas alas "); 
        System.out.println("2.Hitung luas permukaan "); 
        System.out.println("3.Hitung volume "); 
        System.out.println("4.Keluar program "); 
        System.out.println("======================== ");
        System.out.print("Masukkan menu pilihan anda (1/2/3/4) : ");
        menu_yandri = keyboard.nextInt();
        
        switch (menu_yandri) 
        { 
            case 1 : { System.out.print("Panjang = "); 
            p_yandri = keyboard.nextInt(); 
            System.out.print("Lebar = "); 
            l_yandri = keyboard.nextInt(); 
            la_yandri = p_yandri*l_yandri; 
            System.out.println("Luas alas = " + la_yandri); 
            break; 
            } 
            case 2 : { System.out.print("Panjang = "); 
            p_yandri = keyboard.nextInt();  
            System.out.print("Lebar = "); 
            l_yandri = keyboard.nextInt(); 
            System.out.print("Tinggi = "); 
            t_yandri = keyboard.nextInt(); 
            lp_yandri = (2*p_yandri*l_yandri) + (2*p_yandri*t_yandri) + (2*l_yandri*t_yandri); 
            System.out.println("Luas permukaan = " + lp_yandri); 
            break; 
            } 
            case 3 : { System.out.print("Panjang = "); 
            p_yandri = keyboard.nextInt();
            System.out.print("Lebar = "); 
            l_yandri = keyboard.nextInt(); 
            System.out.print("Tinggi = "); 
            t_yandri = keyboard.nextInt(); 
            v_yandri = p_yandri*l_yandri*t_yandri; 
            System.out.println("Volume = " + v_yandri); 
            break; 
            } 
            case 4 : { System.out.println("Keluar program.. byeee....\n"); 
            break; 
            } 
            default : System.out.println("Pilihan tidak tersedia\n"); }
        
    } 
    
}
