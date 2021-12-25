/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harga;
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class HargaBarang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int harga, harga1, harga2, harga3, harga4; 
        double total, diskon;
        
        System.out.println("Masukkan Harga Barang 1 = ");
        harga1 = input.nextInt();
        System.out.println("Masukkan Harga Barang 2 = ");
        harga2 = input.nextInt();
        System.out.println("Masukkan Harga Barang 3 = ");
        harga3 = input.nextInt();
        System.out.println("Masukkan Harga Barang 4 = ");
        harga4 = input.nextInt();
        total = harga1+harga2+harga3+harga4;
        
        if (total>=500000){
            diskon= total*0.3;
            System.out.println("Total Pembelian Anda adalah = "+diskon);
        }
        else if (total<=500000 && total>=300000){
            diskon=total*0.2;
            System.out.println("Total Pembelian Anda adalah = "+diskon);
        }
        else if (total<=300000 && total>=150000){
            diskon=total*0.1;
            System.out.println("Total Pembelian Anda adalah = "+diskon);
        }
        else {
            System.out.println("Total Pembelian Anda adalah = "+total);
        }
    }
}