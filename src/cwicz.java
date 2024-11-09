// od 100 zl do 10 tys zl
// 6-12 rat = 2,5%
// 13-24 rat = 5%
// 25-48 rat = 10%

import java.util.Scanner;
public class cwicz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj cene towaru: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.print("Podaj ilość  rat: ");
        int rate = input.nextInt();
        input.nextLine();
        input.close();
        System.out.println("-------------------------");

        if (price < 100 || price > 10_000 || rate < 6 || rate > 48) {
            System.out.println("Podano błędne dane !!!:");
            System.out.println("Cena powinna być w przedziale od 100zł do 10 000zł");
            System.out.println("Liczba rat powinna być w przedziale od 6 do 48");
        } else {
                double mnoznik;
                if (rate <= 12) {
                    mnoznik = 0.025;
                } else if (rate <= 24) {
                    mnoznik = 0.05;
                } else {
                    mnoznik = 0.1;
                }

//                to jest skrocony zapis if
// double multiplier = rate <= 12 ? 0.025 : rate <=24 ? 0.05 : 0.1;

                double odsetki = (price * mnoznik);
                double TotalPrize = (price + odsetki);
                double OneRate = (odsetki / rate);
                System.out.println("Kwota odsetek wynosi: " + odsetki + "zł");
                System.out.println("Suma rat wynosi: " + TotalPrize + "zł");
                System.out.println("Kwota jednej raty wynosi: " + OneRate + "zł");


            }
        }
    }

