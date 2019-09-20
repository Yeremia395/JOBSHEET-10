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
public class pratikum4 {
     public static void main(String []args){
        String cari;
        Scanner p = new Scanner(System.in);
        System.out.print("masukkan kata / kalimat : ");
        cari = p.nextLine();
         int a = 0;
        for(int i = 0;i < cari.length();i++){
            if(cari.charAt(i) == 'a'){
                a++;
            }
        }
             int i = 0;
        for(int j = 0;j < cari.length();j++){
            if(cari.charAt(j) == 'i'){
                i++;
            }
        }
          int u = 0;
        for(int k = 0;k < cari.length();k++){
            if(cari.charAt(k) == 'u'){
                u++;
            }
        }
          int e = 0;
        for(int l = 0;l < cari.length();l++){
            if(cari.charAt(l) == 'e'){
                e++;
            }
        }
          int o = 0;
        for(int m = 0;m < cari.length();m++){
            if(cari.charAt(m) == 'o'){
                o++;
            }
        }
        int f;
        f = a + i + u + e + o;
        System.out.println("jumlah huruf a = "+ a);
        System.out.println("jumlah huruf i = "+ i);
        System.out.println("jumlah huruf u = "+ u);
        System.out.println("jumlah huruf e = "+ e);
        System.out.println("jumlah huruf o = "+ o);
    }
}

    

