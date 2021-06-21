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
public class no19 {
     public static void main(String[] args) {
     // TODO code application logic here
     /* Nama File : matriks3.c
        Pembuat   : Yandri Syanurdi / 1701082002
        Tgl pembuatan : 9 September 2018
        Deskripsi : menentukan apakah sebuah matriks merupakan matriks identitas
     */
         
    
    int [][] A_yandri = new int [10] [10];
    int brs_yandri,kol_yandri,i_yandri,j_yandri,jum_yandri,iden_yandri; 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Masukkan ukuran baris matriks : "); 
    brs_yandri = keyboard.nextInt();
    System.out.print("Masukkan ukuran kolom matriks : "); 
    kol_yandri = keyboard.nextInt();
     
for (i_yandri=0;i_yandri<brs_yandri;i_yandri++) 
{ 
    for(j_yandri=0;j_yandri<kol_yandri;j_yandri++) 
    { 
        System.out.print("A[" + i_yandri + "][" + j_yandri + "] = "); 
        A_yandri[i_yandri][j_yandri] = keyboard.nextInt();   
    } 
} 
System.out.println(" "); 
System.out.println("Matriks anda adalah : "); 
System.out.println(" "); 
for (i_yandri=0;i_yandri<brs_yandri;i_yandri++) 
{ 
    for(j_yandri=0;j_yandri<kol_yandri;j_yandri++) 
    { 
        System.out.print(" " + A_yandri[i_yandri][j_yandri]); 
    } 
    System.out.println(" "); 
} 
//periksa matriks identitas 
iden_yandri=0; 
System.out.println(" "); 
System.out.println(" "); 
if(brs_yandri==kol_yandri) 
{ 
    for (i_yandri=0;i_yandri<brs_yandri;i_yandri++) 
    { 
        for(j_yandri=0;j_yandri<kol_yandri;j_yandri++) 
        { 
            if ((i_yandri==j_yandri) && (A_yandri[i_yandri][j_yandri]==1)) 
                iden_yandri=iden_yandri +1; 
        } 
    } 
    if (iden_yandri==brs_yandri) 
    {
        System.out.println(" "); 
        System.out.println("Matriks identitas. ");
        System.out.println(" "); 
    }   
    else 
    {
        System.out.println(" "); 
        System.out.println("Bukan matriks identitas.");
        System.out.println(" "); 
    }
        
} 
else 
{
   System.out.println(" "); 
   System.out.print("Bukan matriks identitas. "); 
   System.out.println(" "); 
}

     }
}
