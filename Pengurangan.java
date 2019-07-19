/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengurangan;

import java.util.Scanner;

/**
 *
 * @author SSA
 */
public class Pengurangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner pengurangan = new Scanner (System.in);
int Pertama, Kedua, HasilJumlah;
System.out.print("1. Masukan Angka : ");
    Pertama = pengurangan.nextInt();
System.out.print("2. Masukan Angka : ");
    Kedua = pengurangan.nextInt();
    HasilJumlah = Pertama - Kedua;
System.out.println("Hasil Dari Pengurangan "+Pertama+" - "+Kedua+" = "+HasilJumlah);
System.out.println("By : Muhamad AkhToriq (18364002)");
    }
    
}
