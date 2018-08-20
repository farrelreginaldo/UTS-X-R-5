/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.praktik.x.r5;

/**
 *
 * @author Farrel
 */
import java.util.Scanner;
public class UTSPraktikXR5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Toko Farrel Reginaldo");
        
        String customerID = "Kiki";
        System.out.print("\nHi, kak "+customerID);
          Scanner daftarBeli = new Scanner (System.in);
        int hargaPensil = 35000;
        int hargaPenghapus = 10000;
        int hargaBolpoin = 10500;
        int hargaPenggaris20cm = 3000;
        int hargaPenggaris30cm = 5000;
        int hargaBukutulis = 328000;
        int done = 0;
              
        System.out.println("\nDaftar Harga");
        System.out.println("1. Harga pensil : "+ "Rp" + hargaPensil+",00");
        System.out.println("2. Harga penghapus : "+ "Rp"+hargaPenghapus+",00");
        System.out.println("3. Harga Bolpoin : " +"Rp"+ hargaBolpoin+",00");
        System.out.println("4. Harga Penggaris (20 cm) : "+ "Rp"+hargaPenggaris20cm+",00");
        System.out.println("5. Harga Penggaris (30 cm) : "+"Rp"+hargaPenggaris30cm+"00");
        System.out.println("6. Harga Buku Tulis : "+ "Rp"+hargaBukutulis+",00");
        
        System.out.println("\nDaftar Beli");
        System.out.println("Ketik harga barang yang anda beli.");
        System.out.println("Maksimal pembelian 10 barang, jika membeli lebi dari 10 bisa melakukan transaksi lagi, Terima kasih.");
        System.out.println("Mohon kejujurannya.");
       
       
        System.out.print("1. ");
        int barang1 = daftarBeli.nextInt();
        
        System.out.print("2. ");
        int barang2 = daftarBeli.nextInt();
        
        System.out.print("3. ");
        int barang3 = daftarBeli.nextInt();
        
        System.out.print("4. ");
        int barang4 = daftarBeli.nextInt();
        
        System.out.print("5. ");
        int barang5 = daftarBeli.nextInt();
        
        System.out.print("6. ");
        int barang6 = daftarBeli.nextInt();
        
        System.out.print("7. ");
        int barang7 = daftarBeli.nextInt();
        
        System.out.print("8. ");
        int barang8 = daftarBeli.nextInt();
        
        System.out.print("9. ");
        int barang9 = daftarBeli.nextInt();
        
        System.out.print("10. ");
        int barang10 = daftarBeli.nextInt();
        
        int towal = barang1 + barang2 + barang3 + barang4 + barang5 + barang6 + barang7 + barang8 + barang9 + barang10;
       
        if (towal > 500000) {
        int tokir = towal*(50/100);
            System.out.println("Selamat, anda mendapat diskon 50%");
        System.out.println("Harga total = Rp"+ tokir+",00");
        } 
        else if(towal > 300000) {
        int tokir = towal*(80/100);
            System.out.println("Selamat, anda mendapatkan diskon 20%");
        System.out.println("Harga total = Rp"+ tokir+",00");
        } 
        else if(towal >100000) {
        int tokir = towal*(90/100);
            System.out.println("Selamat, anda mendapatkan diskon 10%");
        System.out.println("Harga total = Rp"+ tokir+",00");
        }  
        else {
            System.out.println("Total harga = Rp"+ towal+",00");
        } 
        String kasir= "Adi";
        System.out.println("Nama Kasir : "+kasir);
        System.out.println("Terima Kasih");
    }
    
}
