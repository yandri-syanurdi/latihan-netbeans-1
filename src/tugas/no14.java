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
public class no14 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : nilai_mhs.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : input nilai, banyak isi array yang bilangan genap
     */
        
        
        int [] nilai_yandri = new int [100];
        int x_yandri, i_yandri, num_genap_yandri;
        Scanner keyboard = new Scanner(System.in);
        
        //Banyak data yang ingin diinputkan
        System.out.print("Masukkan banyak data yang akan diinputkan : ");
        x_yandri = keyboard.nextInt(); 
        //Input data 
        for (i_yandri=0;i_yandri<x_yandri;i_yandri++) 
        { 
            System.out.print("Masukkan angka = "); 
            nilai_yandri[i_yandri] = keyboard.nextInt();
        } 
        //banyak bilangan genap 
        num_genap_yandri=0; 
        for(i_yandri=0;i_yandri<x_yandri;i_yandri++) 
        { 
            if(nilai_yandri[i_yandri]%2==0) 
            {
               num_genap_yandri=num_genap_yandri+1; 
            }        
        } 
        System.out.println("Banyak isi array yang genap = " + num_genap_yandri); 
        
 
  }
    
}
