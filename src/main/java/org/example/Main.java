package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//       int number=2+3*4;
//        System.out.println(number);
//boolean b= number+10<100;
//        System.out.println(b);
//int i=100;
//boolean b1=true;
//boolean ered =b1 && i++<1000;
//        System.out.println(ered);
//        System.out.println(i);
//        int i=100;
//        int j=199;
//        i=j;
//        System.out.println(i<200 ? "kisebb": "nagyobb" );
//    int[] szam = new int[10];
//
//        szam[0] = 1;
//        szam[1] = 2;
//        szam[2] = 3;
//        szam[3] = 4;
//        szam[4] = 5;
//        szam[5] = 6;
//        szam[6] = 7;
//        szam[7] = 8;
//        szam[8] = 9;
//        szam[8] = 10;
//        System.out.println(szam[5]);
//

        //  int[][] szam = new int[10][10];

//////////////////////////////////////////////////////////////////////////////CONTROLFLOW//////////////////////
//        int honapnap = 4;
//        System.out.println("üdv!");
//        if(honapnap== 2){
//            System.out.println("hétfő");
//
//        }
//        if(honapnap==3)
//            System.out.println("kedd");
//        System.out.println("viszlat");
//
//if(honapnap== 4){
//    System.out.println("4");
//
//}else{
//    System.out.println("nem negy");
//}
//    } ///////////////////////////////////////////////////////////////////// 3 közül kiértékelés
//int szam =0;
//if(szam>0){
//    System.out.println("a szam pozitiv");
//}else if(szam<0){
//    System.out.println("a szam negativ");
//}else {
//    System.out.println("a szam nulla");
//}
////////////////////////////////////////////////////////////////////////Switchcase
//int nap=3;
//switch ( nap) {
//    case 1 :
//        System.out.println("hétfő");break;
//    case 2 :
//        System.out.println("k");break;
//    case 3 :
//        System.out.println("sző");break;
//    case 4 :
//        System.out.println("cs");break;
//    case 5 :
//        System.out.println("p");break;
//    case 6 :
//        System.out.println("szo");break;
//    case 7 :
//        System.out.println("vas");break;
//}


/////////////////////////////////////////////////////////////////////stringes switch
//int nap =8;
//String napneve = switch (nap){
//    case 1 -> "hétfő";
//    case 2 -> "kedd";
//    case 3 -> "szerda";
//    case 4 -> "csüü";
//    case 5 -> "péntek";
//    default -> "ismeret";
//};
////        System.out.println(napneve);
//        System.out.println("üdv");
        /////////////////////////////////////////////////////////////forciklus
//for(int i=0;i<10;i++){
//    System.out.print("a szam:");
//    System.out.print(i);
//    System.out.println();
//}
//////////////////////////////////////////////////////////////////forciklus stringes tömbel
//  String[] names = { "feri","zoli","vivi","zoe"};
//  for (String nev : names){
//      System.out.print("neve:");
//      System.out.print(nev);
//      System.out.println();
//  }
////////////////////////////////////////////////////////////////////////////

//        System.out.println("  A B C D E F G H ");      //////////////////////////////tábla
//        for(int i=0; i<8; i++){
//            System.out.print((char)('A'+i)+" ");
//            for(int j=0; j<8; j++){
//                System.out.print("- ");
//            }
//            System.out.println();
//        }

//        System.out.println("adjon meg egy szamot:");
//
//       int szam = scanner.nextInt();
//        System.out.println("a szamod:"+ szam);
//        System.out.println("adjon meg egy  lebegős szamot:");
//        double mydoublenumber = scanner.nextDouble();
//        System.out.println("a szam:"+mydoublenumber);

//        System.out.print("adjon meg szöveget:");
//        String text = scanner.nextLine();
//        System.out.println("a szöveg: "+text);


///////////////////////////////////////////////////////////////////// 2számszorzása
//int c=0;
//        System.out.print("A:");
//        int a =scanner.nextInt();
//        System.out.print("B:");
//        int b = scanner.nextInt();
//c=a*b;
//        System.out.println("a szamok szorzata:"+c);
//
//
////////////////////////////////////////////////////////////////////////////// POSZTMODERN ATM
        System.out.print("adjaon meg egy összeget:");
        int penzosszeg = scanner.nextInt();
        while (penzosszeg<0 || penzosszeg%5!=0){
            System.out.print("nem jo szam,adja meg ujra:");
             penzosszeg = scanner.nextInt();

        }
        int[]cimletek = {20_000,10_000,5_000,2_000,1_000,500,200,100,50,20,10,5};
               int mardek=penzosszeg;
               int[]darabok=new int[cimletek.length];
               for(int i=0;i<cimletek.length;i++)
               {
                   darabok[i]=mardek/cimletek[i];
                   mardek=mardek%cimletek[i];
               }

               System.out.println("20 ezresből:"+darabok[0]);
               System.out.println("10 ezresből:"+darabok[1]);
               System.out.println("5 ezresből:"+darabok[2]);
        System.out.println("2 ezresből:"+darabok[3]);
        System.out.println("ezresből:"+darabok[4]);
        System.out.println("ötszászasból:"+darabok[5]);
        System.out.println("kétszázasból:"+darabok[6]);
        System.out.println("százasból:"+darabok[7]);
        System.out.println("ötvenesből:"+darabok[8]);
        System.out.println("huszasból:"+darabok[9]);
        System.out.println("tizesből:"+darabok[10]);
        System.out.println("ötösből:"+darabok[11]);



        /////////////////////////////////////////////////////////////
    }
    /////main end
}