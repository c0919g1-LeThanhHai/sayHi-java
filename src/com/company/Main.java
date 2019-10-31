package com.company;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String name;

    void input() {
        System.out.println("Nhập tên của bạn: ");
        this.name = scanner.nextLine();
    }

    void display() {
        System.out.printf("Xin chào %s", this.name);
    }

    public static void main(String[] args) {
        // write your code here
        Main m = new Main();
        m.input();
        m.display();
    }
}
