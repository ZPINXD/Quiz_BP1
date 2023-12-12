/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz_searching;

/**
 *
 * @author Vano
 */
import java.util.Scanner;
public class Quiz_Searching {

    public static void main(String[] args) {
        String a = "";
        int j=1;
        Scanner s = new Scanner (System.in);
        boolean ketemu=false; 
        String hp[]={"Xiaomi","Redmi","Oppo","Samsung","Realme","Iphone","Asus","Lenovo"};
        System.out.println("Berikut beberapa merek Handphone yang kami jual");
        for (int i = 0; i < hp.length; i++) {
            System.out.println(i+1+"."+hp[i]);
        }
        System.out.print("Cari Merek Handphone: ");
        String Cari = s.next();
        for (int i = 0; i < hp.length; i++) {
            if (hp[i].compareToIgnoreCase(Cari)==0) {
                ketemu = true;
                a = hp[i];
                j=i;
                break;
            }   
        }
        if (ketemu==true) {
            System.out.println("Merek "+ a +" Berada pada nomor : " + j);
            }
        else{
            System.out.println("Merek Handphone yang anda cari tidak ditemukan ");
        }
    }
}
