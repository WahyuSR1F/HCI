package com.sinauJava;

import java.util.Scanner;

public class SexualAct {
    public static void main(String[] args) {
        // program seksual act
        Scanner SexualAct = new Scanner(System.in);
        System.out.println("Sexsual act menikah = 1 atau Luarnikah= 0 :");
        System.out.println( " ketika 1 atau 0 =");
        int a = SexualAct.nextInt();

        if (a == 1 ){
            System.out.println("paksaan = 1 atau tidak= 0   :");
            System.out.println( " ketika 1 atau 0 =");
            int b = SexualAct.nextInt();
            if (b == 1){
                System.out.println(" itu merupakan LEGAL ACT ");
            }else {
                System.out.println(" itu merupakan KDRT (pidana)");
            }
        }else {
            System.out.println(" itu merupakan ILEGAL ACT");
            System.out.println(" apakah ia  dengan orang dengan (dewasa= 1 atau anak= 0) \n pilih salah satu :");
            System.out.println( " ketika 1 atau 0 =");
            int c = SexualAct.nextInt();

            if ( c == 1){
                System.out.println(" apakah dia (lawan= 1 atau sesama =0 ) \n jenis pilih salah satu :");
                System.out.println( " ketika 1 atau 0 =");
                int  d = SexualAct.nextInt();
                if (d == 1 ){
                    System.out.println(" dia telah melakukan zina pidanakan !! ");
                }else {
                    System.out.println(" banyak cewek cantik kok sama pria ihh tolol you pidanakan!!");
                }
            }else {
                System.out.println("melibatkan dengan siapa anak itu orang \n (dewasa= 1 atau anak = 0)pilih salah satu :");
                System.out.println( " ketika 1 atau 0 =");
                int  e = SexualAct.nextInt();
                if (e == 1 ){
                    System.out.println( " emang keji merupakan kejahatan pedofilia ");
                    System.out.println(" hukuman pidanah kalau bisa hukuman mati");
                }else {
                    System.out.println(" perhatian orang tua dan guru kurang sehinnga\n anak dibiarkan melihat bokep");
                    System.out.println(" masuk dalam pidana anak");
                }
            }
        }
    }
}
