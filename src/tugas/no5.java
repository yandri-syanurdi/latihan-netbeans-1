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
public class no5 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : detik.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : konversi nilai detik ke x jam, y menit, z detik
     */
        
        
        int detik_yandri, x_yandri, y_yandri, z_yandri, temp_yandri;
        
        
        /*--INPUT--*/
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan nilai detik: ");
        detik_yandri = keyboard.nextInt();
        
        /*--KONVERSI--*/
        x_yandri = detik_yandri/3600;
        temp_yandri = detik_yandri % 3600; //mod --> %
        y_yandri = temp_yandri / 60;
        z_yandri = temp_yandri % 60;
        System.out.println(" ");
        System.out.println(" ");
        /*--OUTPUT--*/
        System.out.println(detik_yandri + " detik  = " + x_yandri + " jam " + y_yandri + " menit " + z_yandri + " detik ");
        
        
        
    } 
    
}
