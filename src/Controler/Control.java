package Controler;

import Model.Member;
import View.View;

import java.util.Scanner;



public class Control {

    public static void start() {


        Scanner inputMember = new Scanner(System.in);

        Exit:
        for (; ; )
        {
            View.mainView();
            int check = inputMember.nextInt();

            switch (check)
            {
                case 1:
                    division();
                    break;
                case 2:
                    multiply();
                    break;
                case 3:
                    addition();
                    break;
                case 4:
                    subtraction();
                    break;
                case 5:
                   remainder();
                    break;
                case 6:
                    break Exit;

                default:
                    View.error();
            }

        }

    }

    public static void addition(){
        Member member = new Member();
        Scanner scanner = new Scanner(System.in);

        View.additionProcess();
        View.firstOperation();
        int number01 =   member.setNumberOne(scanner.nextInt());

        View.secondOperation();
        int number02 =   member.setNumberTwe(scanner.nextInt());

        String additionProcess = "\t The result of addition is  " + (number01 + number02)  +"\n";
        System.out.println(additionProcess);

    }

    public static void division(){
        Member member = new Member();
        Scanner scanner = new Scanner(System.in);

        View.additionProcess();
        View.firstOperation();
        int number01 =   member.setNumberOne(scanner.nextInt());

        View.secondOperation();
        int number02 =   member.setNumberTwe(scanner.nextInt());

        String mathematicalProcess =  "\tThe result of division is " +number01 / number02 +"\n";
        System.out.println(mathematicalProcess);

    }

    public static void multiply(){
        Member member = new Member();
        Scanner scanner = new Scanner(System.in);

        View.additionProcess();
        View.firstOperation();
        int number01 =   member.setNumberOne(scanner.nextInt());

        View.secondOperation();
        int number02 =   member.setNumberTwe(scanner.nextInt());

        String mathematicalProcess = "\tThe result of multiplication is  "+number01 * number02 +"\n";
        System.out.println(mathematicalProcess);

    }

    public static void remainder(){
        Member member = new Member();
        Scanner scanner = new Scanner(System.in);

        View.additionProcess();
        View.firstOperation();
        int number01 =   member.setNumberOne(scanner.nextInt());

        View.secondOperation();
        int number02 =   member.setNumberTwe(scanner.nextInt());

        String remainderProcess = "\t The result of remainder is  " + (number01 % number02) +"\n";
        System.out.println(remainderProcess);

    }

    public static void subtraction(){
        Member member = new Member();
        Scanner scanner = new Scanner(System.in);

        View.additionProcess();
        View.firstOperation();
        int number01 =   member.setNumberOne(scanner.nextInt());

        View.secondOperation();
        int number02 =   member.setNumberTwe(scanner.nextInt());

        String subtractionProcess = "\t The result of subtraction is  " + (number01 - number02) + "\n";
        System.out.println(subtractionProcess);

    }

}
