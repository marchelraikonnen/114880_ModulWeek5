package Week04.marchel.id.ac.umn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("--------Program Menghitung Bangun Ruang--------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------Lingkaran-----------");
                    System.out.print("Masukkan jari-jari : ");
                    double r = s.nextDouble();
                    System.out.print("Warna               : ");
                    String warna1 = s.next();
                    Circle circle = new Circle(r, warna1);
                    System.out.println("Jari-jari          : " + formatNumber(circle.getRadius()));
                    System.out.println("Keliling Lingkaran : " + circle.getPerimeter());
                    System.out.println("Luas Lingkaran     : " + circle.getArea());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-----------Persegi-----------");
                    System.out.print("Masukkan panjang sisi : ");
                    double side = s.nextDouble();
                    System.out.print("Warna                : ");
                    String warna2 = s.next();
                    Square square = new Square(side, warna2);
                    System.out.println("Panjang Sisi        : " + formatNumber(square.getSide()));
                    System.out.println("Keliling Persegi    : " + square.getPerimeter());
                    System.out.println("Luas Persegi        : " + square.getArea());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("----------Persegi Panjang----------");
                    System.out.print("Masukkan panjang : ");
                    double length = s.nextDouble();
                    System.out.print("Masukkan lebar   : ");
                    double width = s.nextDouble();
                    System.out.print("Warna            : ");
                    String warna3 = s.next();
                    Rectangle rect = new Rectangle(length, width, warna3);
                    System.out.println("Panjang & Lebar          : " + formatNumber(rect.getLength()) + " & " + formatNumber(rect.getWidth()));
                    System.out.println("Keliling Persegi Panjang : " + rect.getPerimeter());
                    System.out.println("Luas Persegi Panjang     : " + rect.getArea());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("--------Segitiga Siku-Siku----------");
                    System.out.print("Masukkan alas : ");
                    double base = s.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double height = s.nextDouble();
                    System.out.print("Warna           : ");
                    String warna4 = s.next();
                    Triangle tri = new Triangle(base, height, warna4);
                    System.out.println("Alas & Tinggi      : " + formatNumber(tri.getBase()) + " & " + formatNumber(tri.getHeight()));
                    System.out.println("Keliling Segitiga  : " + tri.getPerimeter());
                    System.out.println("Luas Segitiga      : " + tri.getArea());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    s.close();
                    return;
                default:
                    System.out.println("Input tidak valid");
                    System.out.println();
                    break;
            }
        }
    }

    private static String formatNumber(double d) {
        if (d == (long) d) {
            return String.valueOf((long) d);
        } else {
            return String.valueOf(d);
        }
    }
}
