package main.java.com.example.anagram;

import java.util.Scanner;

public class AnagramApplication {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        AnagramCreator ac = new AnagramCreator();
        ac.createAnagram(result);
        long end = System.currentTimeMillis();
        long elapsed = end - start;
        System.out.println();
        System.out.println("Время выполнения составлят: " + elapsed);
    }
}