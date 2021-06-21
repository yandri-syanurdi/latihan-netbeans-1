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
public class no9 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : hitungbonus.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menentukan bonus akhir tahun karyawan
     */
       
       int gol_yandri,masakerja_yandri, umur_yandri; 
       int bonus_yandri; 
       char ulang;
       ulang='y';
       
       
       do {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("***Program Bonus Akhir Tahun*** "); 
       System.out.println("------ Golongan Karyawan ------ "); 
       System.out.println(" 1. Staf "); 
       System.out.println(" 2. Non-staf "); 
       System.out.println("------------------------------- "); 
       System.out.print("Masukkan golongan anda (1/2) : "); 
       gol_yandri = keyboard.nextInt(); 
       switch (gol_yandri)
  
        { 
            case 1: { System.out.print("Masukkan masa kerja anda : "); 
            masakerja_yandri = keyboard.nextInt();
            System.out.print("Masukkan umur anda : "); 
            umur_yandri = keyboard.nextInt(); 
            if (masakerja_yandri>=5 && umur_yandri>=45) 
            {
                bonus_yandri=1000000;
            }     
            else if (masakerja_yandri>=5 && umur_yandri<45) 
            {
                bonus_yandri=700000;
            }    
            else 
            {
                bonus_yandri=500000;
            } 
            break; 
            } 
            
            case 2: { System.out.print("Masukkan masa kerja anda : "); 
            masakerja_yandri = keyboard.nextInt();
            System.out.print("Masukkan umur anda : "); 
            umur_yandri = keyboard.nextInt();
            if (masakerja_yandri>5 && umur_yandri>45) 
            {
                bonus_yandri=400000; 
            }   
            else //not kondisi 
            {
                 bonus_yandri=250000;
            }   
            break; 
            
            } 
            default : { System.out.println("Maaf, golongan anda salah!!!"); 
                        bonus_yandri=0;}
       } 
       
            System.out.println(" ");
            System.out.println("Bonus akhir tahun anda = Rp. " + bonus_yandri +  ",-");
            
            System.out.print("Apakah anda akan mengulang program : "); 
            ulang = keyboard.next().charAt(0); 
            
            
            
           
            
            
       }  
       while(ulang=='y' || ulang=='Y');
       

}
    
}

