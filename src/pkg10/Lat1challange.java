/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

import java.util.Scanner;

/**
 *
 * @author Yeremia Rizky
 */
public class Lat1challange {
     public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = new String[] {"hp","laptop","pc","mouse","headseat"};
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan Data Yang Ingin Dicari:");
        cari = s.next();
        for (int i = 0; i < data.length; i++){
            if(!cari.equals(data[i])) {
            } else {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data ditemukan");
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
}

