import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gideceğiniz Km'yi Giriniz");
        int kmgirisi = input.nextInt();

        double kmBasiUcret = 2.20;

        int minUcret=20;

        double topalmUcret = 10;
        topalmUcret +=kmgirisi * kmBasiUcret;
        topalmUcret = (topalmUcret<20) ? 20 : topalmUcret;
        System.out.println("Toplam Tutar : " + topalmUcret);






    }
}
