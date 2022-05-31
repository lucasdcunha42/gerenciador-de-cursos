package br.com.allura;

import java.util.Scanner;
public class Teste3 {

    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }

    public class Converter {

        static String binary="";

        public static String toBinary (int num){

            while(num > 0) {
                binary = (num%2)+binary;
                num /= 2;
            }
            return binary;
        }
    }
}