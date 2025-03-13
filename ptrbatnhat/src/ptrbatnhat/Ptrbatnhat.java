
package ptrbatnhat;

import java.util.Scanner;

public class Ptrbatnhat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a và b
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        // Kiểm tra giá trị của a
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm x của phương trình ax + b = 0
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }

        scanner.close();
    }
}    
    

