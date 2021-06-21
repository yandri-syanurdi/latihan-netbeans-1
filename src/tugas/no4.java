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
public class no4 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : kabataku.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : melakukan proses kabataku
     */
        
        
        int x_yandri, y_yandri;
        int tambah_yandri, kurang_yandri, kali_yandri;
        double bagi_yandri;
        
        /*--INPUT--*/
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan bilangan pertama : ");
        x_yandri = keyboard.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        y_yandri = keyboard.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        /*--PROSES--*/
        tambah_yandri = x_yandri + y_yandri;
        kurang_yandri = x_yandri - y_yandri;
        kali_yandri = x_yandri * y_yandri;
        bagi_yandri = x_yandri / y_yandri;
        
        /*--OUTPUT--*/

        System.out.println("Hasil tambah = " + tambah_yandri);
        System.out.println("Hasil kurang = " + kurang_yandri);
        System.out.println("Hasil kali = " + kali_yandri);
        System.out.println("Hasil bagi = " + bagi_yandri);
        
        
    } 
    
}
