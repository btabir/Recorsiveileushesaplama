package Metotlar;

import java.util.Scanner;

public class Recorsiveileushesaplama {

    static int power(int a,int b){

        int result= 1;

        for (int i = 1; i<=b ; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Taban Degerini Giriniz : ");
        int a =input.nextInt();

        System.out.print("Us Degerini Giriniz : ");
        int b=input.nextInt();

        System.out.println("Sonuc : "+power(a,b));
    }
}


