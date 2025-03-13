
package timsolonnhat;

import java.util.Scanner;

public class Timsolonnhat {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử trong mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng
        int[] arr = new int[n];

        // Nhập các phần tử cho mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Tìm số lớn nhất trong mảng
        int max = arr[0];  // Giả sử số đầu tiên là lớn nhất
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Cập nhật max nếu tìm thấy phần tử lớn hơn
            }
        }

        System.out.println("Số lớn nhất trong mảng là: " + max);

        scanner.close();
    }
    }
    

