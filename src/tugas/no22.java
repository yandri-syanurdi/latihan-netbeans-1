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
public class no22 {
    public static void main(String [] args) {
    int [] nilai = new int [100];
    Scanner keyboard = new Scanner(System.in);
    int n,i;
    double jumlah,rata2;
    int max,min;
    max = -99999;
    min = 999999;
    System.out.println("masukan banyak data");
    n = keyboard.nextInt();
    for(i=0;i<n;i++)
    {
        System.out.print("masukan nilai ke - " + (i+1) + " = ");
        nilai[i]=keyboard.nextInt();
    }
    jumlah=0;
    for(i=0;i<n;i++)
    {
        if(nilai[i]>max)
        {
            max=nilai[i];
        }
        
        if(nilai[i]<min)
        {
            min=nilai[i];
        }
        jumlah = jumlah + nilai[i];
    }
    rata2 = jumlah/n;
    
    
    System.out.println("");    
        System.out.println("Total = " + jumlah); 
        System.out.println("");
        System.out.println("");
        System.out.println("Rata-rata = " + rata2);
                System.out.println("max = " + max);

                        System.out.println("min = " + min);

        System.out.println("");
    
    
    
    
    
    
}
}
