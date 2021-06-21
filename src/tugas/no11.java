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
public class no11 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : maksimum.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menentukan data yang diinput user
     */
        int i_yandri,n_yandri,bil_yandri,max_yandri; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Program mencari bilangan terbesar. \n"); 
        System.out.print("Masukkan banyak data : ");
        n_yandri = keyboard.nextInt();
        System.out.print("Masukkan bilangan : "); 
        bil_yandri = keyboard.nextInt();
        max_yandri=bil_yandri; 
        for (i_yandri=2; i_yandri<=n_yandri;i_yandri++) 
        { 
            System.out.print("Masukkan bilangan : "); 
            bil_yandri = keyboard.nextInt(); 
            if (bil_yandri>max_yandri) 
                max_yandri=bil_yandri; 
        } 
        System.out.println("");
        System.out.println("");
        System.out.println("Bilangan terbesar = " + max_yandri);

    } 
    
}
