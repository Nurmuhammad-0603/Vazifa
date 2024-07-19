package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Systemaga hush kelibsiz!");




      String name = "";
      String age ="";
      String password = "";
      String phone  ="";
        try {
            try {
                System.out.println("ismingizi kiriting:");
                 name = scanner.next();

            }catch (IsmNotoriException e){
                System.out.println("Ism kiritmadingiz!");
            }

            try {
                System.out.println("Yoshingizni kiriting:");
                 age = scanner.next();
            }catch (YoshKichikException e){
                System.out.println("Yoshingiz kichkina!");
            }
            try {
                System.out.println("Passwordni kiriting:");
                 password = scanner.next();
            }catch (PasswordUzunligiNotoriException e){
                System.out.println("Password uzunligida xato");
            }
            try {
                System.out.println("nomeringizni kiriting:");
                 phone = scanner.next();
            }catch (PhoneNotoriException e){
                System.out.println("Nomerni kodi yozilmagan!");
            }

        }catch (InputMismatchException e){
            System.out.println("Hato!");
        }

        User obj = new User(name,age,password,phone);

        System.out.println(obj);
    }
}