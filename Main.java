package src.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter experience");
        double experince = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter work place");
        String workPlace = scanner.nextLine();
        Employee employee = new Employee(id, name, address, age, experince, workPlace);
        System.out.println(employee);
    }
}
