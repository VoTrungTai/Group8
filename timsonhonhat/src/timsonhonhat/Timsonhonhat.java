/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timsonhonhat;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Timsonhonhat {

 
 public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        // Tính UCLN
        int result = ucln(a, b);

        // In ra kết quả
        System.out.println("UCLN của " + a + " và " + b + " là: " + result);

        scanner.close();
    }
    }
    

