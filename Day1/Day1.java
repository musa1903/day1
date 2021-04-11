package infoTechPackage.Day1.Day1;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args){
        String s = "Hesap Makinesi";
        System.out.println(s);

        Scanner scan = new Scanner(System.in); // sisteme kullanıcıdan veri girisi
        System.out.println("1.rakamı giriniz:");
        int a = scan.nextInt();
        System.out.println("2.rakamı giriniz:");
        int z = scan.nextInt();
        /*double d = scan.nextDouble();
        String ss = scan.nextLine();*/

        System.out.println("Toplam = " + (a+z));
        System.out.println("Çıkarma = " + (a-z));
        System.out.println("Çarpma = " + (a*z));
        System.out.println("Bölme = " + (a/z));
        System.out.println("" + a*z+5);
        System.out.println(5+a*z + "");






    }
}
