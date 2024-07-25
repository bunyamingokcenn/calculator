import java.util.Scanner;

public class Main {

    //Toplama Metodu
    public static void sum() {
        int result = 0, counter;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            result += input.nextInt();
        }
        System.out.println("Toplam: " + result);
    }

    //Çıkarma Metodu
    public static void minus() {
        int result = 0, s1, s2;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        s1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        s2 = input.nextInt();

        result = (s1 - s2);

        System.out.println("Fark: " + result);
    }

    //Çarpma Metodu
    public static void times() {
        int result = 1, counter;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            result *= input.nextInt();
        }
        System.out.println("Çarpım: " + result);
    }

    //Bölme Metodu
    public static void divide() {
        double result, s1, s2;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        s1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        s2 = input.nextInt();

        result = (s1 / s2);

        System.out.println("Bölme sonucu: " + result);
    }

    //Üslü Sayı Metodu
    public static void power() {
        int result = 1, base, exponent;

        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        base = input.nextInt();

        System.out.print("Üs sayısını giriniz: ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Üs sonucu: " + result);
    }

    //Faktöriyel Metodu
    public static void factorial() {
        int result = 1, factorialNum;

        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyel sayısını giriniz: ");
        factorialNum = input.nextInt();

        for (int i = 1; i <= factorialNum; i++) {
            result *= i;
        }

        System.out.println("Faktöriyel sonucu: " + result);
    }

    //Mod Alma Metodu
    public static void mod() {
        int result, s1, s2;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz:");
        s1 = input.nextInt();

        System.out.print("2. sayıyı giriniz:");
        s2 = input.nextInt();

        result = (s1 % s2);

        System.out.println("Mod sonucu: " + result);
    }

    //Dikdörtgen Alan ve Çevre Metodu
    public static void rectangle() {
        int perimeter, area, longEdge, shortEdge;

        Scanner input = new Scanner(System.in);

        System.out.print("Uzun kenar giriniz: ");
        longEdge = input.nextInt();

        System.out.print("Kısa kenar giriniz: ");
        shortEdge = input.nextInt();

        perimeter = (longEdge + shortEdge) * 2;
        area = (longEdge * shortEdge);


        System.out.println("Dikdörtgenin çevresi: " + perimeter + "\n" +
                "Dikdörtgenin alanı: " + area);

    }


    public static void main(String[] args) {
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Gelişmiş Hesap Makinesine Hoş Geldiniz\n" +
                "======================================");

        String menu = """
                1 - Toplama İşlemi
                2 - Çıkarma İşlemi
                3 - Çarpma İşlemi
                4 - Bölme İşlemi
                5 - Üslü Sayı Hesaplama
                6 - Faktöriyel Hesaplama
                7 - Mod Alma İşlemi
                8 - Dikdörtgen Alan ve Çevre Hesaplama
                0 - Çıkış Yap""";

        System.out.println(menu);

        do {
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();

            switch (select) {

                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı...");
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız, lütfen tekrar deneyiniz.");

            }

        } while (select != 0);


    }
}

















































