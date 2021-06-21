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
public class no10 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : permutasi.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menghitung nilai permutasi 2 buah input
     */
        
        int n_yandri,r_yandri,fn_yandri,fnr_yandri,i_yandri,perm_yandri; 
        Scanner keyboard = new Scanner(System.in);
        System.out.print(" n = "); 
        n_yandri = keyboard.nextInt();
        System.out.print(" r = "); 
        r_yandri = keyboard.nextInt();
        fn_yandri=1; 
        for(i_yandri=1;i_yandri<=n_yandri;i_yandri++)
        {
            fn_yandri=fn_yandri*i_yandri;
        }
        //endif 
        fnr_yandri=1; 
        for(i_yandri=1;i_yandri<=(n_yandri-r_yandri);i_yandri++) 
        {
            fnr_yandri=fnr_yandri*i_yandri;
        }    
        //endif 
        perm_yandri = fn_yandri/fnr_yandri; 
        System.out.println(n_yandri + " permutasi " + r_yandri + " = " + perm_yandri);
        

    } 
    
}
