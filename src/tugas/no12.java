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
public class no12 {
    public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : piramidkosong.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menentukan bilangan terbesar dari sejumlah data yang diinputkan user
     */
    int i_yandri,j_yandri,k_yandri,l_yandri,m_yandri,n_yandri; 
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Ukuran = "); 
    n_yandri = keyboard.nextInt(); 
    for(i_yandri=1;i_yandri<=(2*n_yandri)+1;i_yandri++) 
    {
        System.out.print("*"); 
    }
    //endfor 
    System.out.println(""); 
    for(i_yandri=1;i_yandri<=n_yandri;i_yandri++) 
    { 
        for(j_yandri=n_yandri;j_yandri>=i_yandri;j_yandri--)
        {
            System.out.print("*");
        }
        //endfor 
        for(k_yandri=1;k_yandri<=i_yandri;k_yandri++) 
        {
           System.out.print(" ");  
        }
        //endfor 
        for(m_yandri=1;m_yandri<=i_yandri-1;m_yandri++) 
        {
            System.out.print(" ");
        }
        //endfor 
        for(l_yandri=n_yandri;l_yandri>=i_yandri;l_yandri--) 
        {
            System.out.print("*");
        }
        //endfor 
        System.out.println(""); 
    }
  }

}

 