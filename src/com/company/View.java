package com.company;
import javafx.application.Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private Scanner scan;

    public View(){
        scan = new Scanner(System.in);
    }

    public int getWorkMode(){
        try{
            System.out.print("Виберіть режим роботи:\n1-Переглянути інформацію про кредит" +
                    "\n2-зареєструвати новий кредит\n0-Вийти\nВаш вибір: ");
            return scan.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.print("\n--------------------------------------------\n" +
                    "Допускаються тільки числові дані!");
            return 0;
        }
    }

    public void sendReply(String msg){
        System.out.print(msg);
    }

    public void sendReply(Credit credit){
        //TODO:implement credit info output
    }

    public int getCreditNumber(){

        System.out.print("Введіть номер договору: ");

        try{
            return scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.print("\n--------------------------------------------\n" +
                    "Допускаються тільки числові дані!");
            return 0;
        }


    }

    public void exit(){
        System.out.print("\n--------------------------------------------\n" +
                "Роботу завершено!");

        System.exit(0);
    }

    public Customer getCustomer(){
        return new Customer(null, null, 0,null);
    }
}
