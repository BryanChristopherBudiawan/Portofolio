/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class Harga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Barang1,Barang2, Barang3;
        double Total, Diskon;
        
        System.out.println("Masukkan Harga Barang 1 : ");
        Barang1 = input.nextInt();
        System.out.println("Masukkan Harga Barang 2 : ");
        Barang2 = input.nextInt();
        System.out.println("Masukkan Harga Barang 3 : ");
        Barang3 = input.nextInt();
        Total = Barang1 + Barang2 + Barang3;
        
        if(Total>=250000){
            Diskon = Total*0.15;
            System.out.println("Selamat Anda Mendapatkan Diskon jadi sisa Harga Anda Adalah : "+Diskon);
        }else {
            System.out.println("Mohon Maaf Anda Tidak Mendapatkan Diskon");
        } 
    }
}
