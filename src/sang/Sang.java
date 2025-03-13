/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sang;

import java.util.Scanner;

/**
 *
 * @author Pham Thai Sang
 */
public class Sang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        
        // Tìm số nhỏ nhất
        int min = Math.min(a, b);
        System.out.println("Số nhỏ nhất: " + min);
        
        // In hai số theo thứ tự tăng dần
        if (a < b) {
            System.out.println("Thứ tự tăng dần: " + a + ", " + b);
        } else {
            System.out.println("Thứ tự tăng dần: " + b + ", " + a);
        }
        
        scanner.close();
    }
    }