/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4javamethodslibraryclass;

/**
 *
 * @author agus budi
 */
public class StringMath {
    
    public static void cobaString(String nama){
        System.out.println(nama.length());
        System.out.println(nama.charAt(46));
        System.out.println(nama.substring(0, 11));
        String nama1 = "dewi";
        String nama2 = "Dewi";
        int hasilPerbandingan = nama1.compareTo(nama2);
        System.out.println("lexico: " + hasilPerbandingan);
        if(hasilPerbandingan==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
