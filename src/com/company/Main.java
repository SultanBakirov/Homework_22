package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Alphabet.txt");
        writer.write("A a\nB b\nC c\nD d\nE e\nF f\nG g\nH h\nI i\nJ j\nK k\nL l\nM m\nN n\nO o\nP p\nQ q\nR r\nS s\nT t\nU u\n" +
                "V v\nW w\nX x\nY y\nZ z\n0\n1\n2\n3\n4\n5\n6\n7\n8\n9");
        writer.close();

        try (FileReader reader = new FileReader("Alphabet.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                for (int i = 1; i <= 36; i++) {
                    System.out.println(i + ": " + scanner.nextLine());
                }
            }
        } catch (IOException s) {
            System.out.println(s.getMessage());
        }
    }
}
