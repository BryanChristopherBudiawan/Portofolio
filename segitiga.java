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
public class segitiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sisi1, sisi2, sisi3;
        
        System.out.println("Masukkan Nilai Sisi 1 : ");
        sisi1 = input.nextInt();
        System.out.println("Masukkan Nilai Sisi 2 : ");
        sisi2 = input.nextInt();
        System.out.println("Masukkan Nilai Sisi 3 : ");
        sisi3 = input.nextInt();
        
        if(sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga Sama Sisi");
        } 
        else if (sisi1 == sisi2 || sisi1 != sisi2 || sisi2 != sisi3){
        System.out.println("Segitiga Sama Kaki");
        }
        else {
        System.out.println("Segitiga Sisi Beda");
    }
    }
}
