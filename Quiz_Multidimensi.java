package com.example;
import java.util.Scanner;

public class App 
{
    
    public static void main( String[] args )
    {    
        Scanner s = new Scanner(System.in);
        //MULTIDIMENSI
        String nama[] = new String[10];
        int harga[] = new int[10];
        int menu = 0; 
        int pilihan = 1;
        for(int i = 0; i<nama.length-1; i++){
            if(pilihan == 1){
                System.out.print("Masukkan nama barang: ");
                nama[i] = s.next();
                System.out.print("Masukkan harga barang: ");
                harga[i] = s.nextInt();
            }
            else{
                break;
            } 
            System.out.println("Pilih");
            System.out.println("1. Isi barang lagi");
            System.out.println("2. Selesai");
            pilihan = s.nextInt(); 
        }
        for(int h = 0; h<nama.length;h++){
                System.out.println(nama[h] + " Rp" + harga[h]);
        }
        
    }
}
