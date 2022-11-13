import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sonuc=1,taban,kuvvet;
        Scanner input = new Scanner(System.in);

        System.out.print("Üslü sayının tabanını giriniz: ");
        taban = input.nextInt();

        System.out.print("Üslü sayının kuvvetini giriniz: ");
        kuvvet = input.nextInt();

        for(int i=1;i<=kuvvet;i++){
            sonuc *=taban;
        }
        System.out.print("Üslü sayının sonucu: "+sonuc);
    }
}