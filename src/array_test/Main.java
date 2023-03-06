package array_test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size,option, choise = -1;
        do {
            System.out.println("nhập độ dài mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Độ dài không được quá 20 phần tử.");
                System.out.println("Vui lòng nhập lại: ");
            }
        } while (size > 20);


        while (choise != 0) {
            System.out.println("Menu");
            System.out.println("1. Tổng phần tử chẵn ");
            System.out.println("2. Tổng phần tử lẻ ");
            System.out.println("3. kiểm tra số nguyên tố trong mảng");
            System.out.println("4. kiểm tra Max trong mảng");
            System.out.println("5. kiểm tra Min trong mảng");
            System.out.println("6. Sắp xếp thứ tự giảm dần");
            System.out.println("7. Tìm phần tử nhập từ bàn phím trong mảng");
            System.out.println("0. Thoát.");
            System.out.println("Vui lòng chọn 1 lựa chọn: ");
            option = input.nextInt();
            switch (option) {
                case 1:

                    // tổng chẵn
                    EvenTotal(size);
                    break;
                case 2:
                    // tổng lẻ
                    OddTotal(size);
                    break;
                case 3:
                    // in ra số nguyên tố trong mảng
                    checkPrime(size);
                    break;
                case 4:
                    // in ra giá trị max
                    MaxArray(size);
                    break;
                case 5:
                    // in ra giá trị min
                    MinArray(size);
                    break;
                case 6:
                    // sắp xếp mảng thứ tự giảm dần
                    DecreaseArray(size);
                    break;
                case 7:
                    // tìm phần tử khi nhập vào trong mảng
                    CheckNumber(size);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Số bạn chọn không có trong bảng vui lòng chọn lại!");
            }
        }
    }

    public static void EvenTotal (int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int total = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                total++;
            }
        }
        System.out.println("số chẵn trong mảng: " + total);
        System.out.println("tổng: " + sum);
    }

    public static void OddTotal(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int total = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                total++;
            }
        }
        System.out.println("số lẻ trong mảng: " + total);
        System.out.println("tổng các giá trị có chỉ số lẻ trong mảng: " + sum);
    }

    public static void checkPrime(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));

        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            check = true;
            if (arr[i] == 2) {
                check = true;
            } else if (arr[i] > 1) {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        check = false;
                    }
                }
            } else {
                check = false;
            }
            if (check) {
                System.out.print("Giá trị: " + arr[i] + "," + "ở vị trí: " + i + "\n");
            }
        }
    }

    public static void MaxArray(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }

    public static void MinArray(int size){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị Nhỏ nhất trong mảng là: " + min);
    }

    public static void DecreaseArray(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sắp xếp theo thứ tự giảm dần là: " + Arrays.toString(arr));
    }
    public static void CheckNumber(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        int count = 0;
        System.out.println("Nhập số cần tìm: ");
        int x = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("số: " +"<"+ x +">"+ " có: " + count + " (phần tử ở trong mảng.)");
    }
}
