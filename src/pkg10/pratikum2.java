/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

/**
 *
 * @author Yeremia Rizky
 */
public class pratikum2 {
    public static void main(String[] args) {
        int data[] = {83,76,45,90,85,80,78,74};
        double ratarata = 0.0;
        for (int i=0; i<data.length; i++)ratarata+=data [i];
        ratarata/=data.length;
        System.out.println(ratarata);
        for(int i=0; i < data.length; i++){
            if (data[i]>ratarata){
                System.out.println(data[i]);
            }
        }
    }
    
}
    

