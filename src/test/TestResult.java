package test;

import java.util.Scanner;
import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to hash: ");

        System.out.println("MD5 Hashed text: " + Exercise.HashToMD5(scanner.nextLine()));
    }
}
