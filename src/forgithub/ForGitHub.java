/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forgithub;

import java.util.Scanner;

public class ForGitHub {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ForGitHub obj = new ForGitHub();
        obj.ZeroOneTriangle();
    }

    private void calculator() {
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter your choice. (1 for Addition, 2 for Substraction, 3 for Multiplication, 4 for Division, 5 for remainder)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                System.out.println("Addition " + (firstNumber + secondNumber));
            case 2 ->
                System.out.println("Substraction " + (firstNumber - secondNumber));
            case 3 ->
                System.out.println("Multiplication " + (firstNumber * secondNumber));
            case 4 ->
                System.out.println("Division " + (firstNumber / secondNumber));
            case 5 ->
                System.out.println("Remainder " + (firstNumber % secondNumber));
            default -> {
                System.out.println("Invalid choice");
            }
        }
    }

    private void sumOfFirstNthNaturalNumbers() {
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }

    private void printAllEvenNumbersTillNth() {
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }
    }

    private void primeChecker() {
        System.out.println("Enter an interger");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }

    private void insertAndPrint2DArray() {
        System.out.println("How many row you want. Please specify in numbers");
        int numberOfRow = sc.nextInt();
        System.out.println("How many column you want. Please specify in numbers");
        int numberOfColumn = sc.nextInt();
        int numbers[][] = new int[numberOfRow][numberOfColumn];
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                System.out.println("Please enter an integer");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your 2D Array: ");
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    private void solidRectangle() {
        int row = 4;
        int column = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void hollowRectangle() {
        int r = 4;
        int c = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private void halfPyramid() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void invertedHalfPyramid() {
        int n = 4;
        for (int i = 4; i > n - 4; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void invertedHalfPyramidRotatedBy180Deg() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private void HalfPyramidWithNumbers() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    private void InvertedHalfPyramidWithNumbers() {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    private void FloydsTriangle() {
        int n = 5;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println("");
        }
    }

    private void ZeroOneTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
    }

}
