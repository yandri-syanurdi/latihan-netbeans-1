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
// mengimpor Scanner ke program
import java.util.Scanner;

public class no3 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : input2.c
     */
        String [] nama_yandri = new String [50];
        String huruf_yandri;
        int umur_yandri;
        double nilai_yandri; 
        /*--INPUT--*/
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan sebuah huruf: ");
        huruf_yandri = keyboard.next();
        System.out.print("Masukan sebuah bilangan pecahan: ");
        nilai_yandri = keyboard.nextInt();
        System.out.print("Masukan nama anda: ");
        nama_yandri[1] = keyboard.next();
        System.out.print("Masukan umur anda: ");
        umur_yandri = keyboard.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        /*--OUTPUT--*/
        System.out.println("Nilai variabel yang Anda masukan adalah: ");
        System.out.println("Huruf = " + huruf_yandri);
        System.out.println("Nama anda = " + nama_yandri[1]);
        System.out.println("Umur anda = " + umur_yandri);
        System.out.println("Bilangan pecahan = " + nilai_yandri);  
    } 
}
