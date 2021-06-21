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
public class no6 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : ganjilgenap.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menentukan apakah suatu bilangan merupakan bilangan ganjil atau genap
     */
        
        
        int angka_yandri;
        
        
        /*--INPUT--*/
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Angka =  ");
        angka_yandri = keyboard.nextInt();
        
        if (angka_yandri % 2 == 0)
        {
            System.out.println(angka_yandri + " Merupakan bilangan genap ");
        }
        else //angka % 2 = 1
        {
           System.out.println(angka_yandri + " Merupakan bilangan ganjil "); 
        }
        //endif
 
    } 
    
}
