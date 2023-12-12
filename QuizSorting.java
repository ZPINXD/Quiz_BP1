package com.mycompany.pengurutandata;

import java.util.Scanner;
public class QuizSorting {

    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
      String a="";
      int harga [] = {12500,5000,17500,20000,10000};
      boolean ketemu=false;
      String barang [] ={"pensil","bolpoin","lem","stipo"};
        System.out.println("1. Harga terendah ke tertinggi\n2. Harga Tertinggi ke terendah\n3. Berdasarkan abjad");
          System.out.println("Pilih urutan yang anda inginkan : ");
        int pilih=s.nextInt();
        if(pilih==1){
            System.out.print("Harga barang sebelum diurutkan : ");
        for (int i=0;i<harga.length;i++){
            System.out.print("Rp. "+harga[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<harga.length;i++){
            for (int j=0;j<harga.length-1;j++){
               if(harga[j]>harga[j+1]) {
                   int temp=harga[j];
                   harga[j]=harga[j+1];
                    harga[j+1]=temp;
                    
               }
            }
    }
        System.out.print("Harga barang setelah diurutkan : ");
        for(int i=0;i<harga.length;i++){
            System.out.print("RP. "+harga[i]+" ");
        }
        
        }
        else if(pilih==2){
                     System.out.print("Harga barang sebelum diurutkan : ");
        for (int i=0;i<harga.length;i++){
            System.out.print("Rp. "+harga[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<harga.length;i++){
            for (int j=0;j<harga.length-1;j++){
               if(harga[j]<harga[j+1]) {
                   int temp=harga[j];
                   harga[j]=harga[j+1];
                    harga[j+1]=temp;
                    
               }
            }
    }
        System.out.print("Harga barang setelah diurutkan : ");
        for(int i=0;i<harga.length;i++){
            System.out.print("RP. "+harga[i]+" ");
        }

        }
        else if(pilih==3){
            for(int i=0;i<barang.length;i++){
                for (int j = i + 1; j < barang.length; j++) {
                if(barang[j].compareToIgnoreCase(barang[i])< 0){
                 String temp = barang[i];
                 barang[i] = barang [j];
                 barang [j] = temp;
                }
               
            }
        }
            for(int i=0;i<barang.length-1;i++){
                System.out.print(barang[i] + " ");
                }
        }
}
}