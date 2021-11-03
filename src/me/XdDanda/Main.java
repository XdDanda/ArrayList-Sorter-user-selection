package me.XdDanda;

import me.XdDanda.Messages.Again;
import me.XdDanda.Messages.Info;
import me.XdDanda.Messages.Type;
import me.XdDanda.Messages.Welcome;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        String input;
        String input2;
        String input3;
        int num;
        int stage = 0;
        int stage2 = 0;

        int box;
        int lenght;
        int index;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();

        Welcome.print();

        while (true) {

            while (true) {

                Info.print();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                input = reader.readLine();

                try {
                    num = Integer.parseInt(input);
                    list.add(num);
                    break;
                } catch (Exception exception) {
                    System.out.println("Please dont type letters");
                }
            }

            while (true) {
                Again.print();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                input2 = reader.readLine();
                input2.toUpperCase();

                if (input2.equalsIgnoreCase("YES")) {
                    stage = 1;
                    break;
                } else if (input2.equalsIgnoreCase("NO")) {
                    stage = 2;
                    break;
                } else {
                    System.out.println(" ");
                    System.out.println("Please try it again");
                    System.out.println("Maybe you typed something wrong :/");
                    System.out.println(" ");
                }
            }

            if (stage == 2) {
                break;
            }
        }


        lenght = list.size();
        System.out.println(" ");
        System.out.println("Your list: " + list);
        System.out.println(" ");

        while (true) {
            Type.print();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input3 = reader.readLine();

            if (input3.equalsIgnoreCase("<")) {
                stage2 = 1;
                break;
            } else if (input3.equalsIgnoreCase(">")) {
                stage2 = 2;
                break;
            } else {
                System.out.println(" ");
                System.out.println("Try it again :/");
                System.out.println(" ");
            }
        }

        if (stage2 == 1) {
            for (int j = lenght; j != 0; j--) {
                lenght = list.size();

                box = list.get(0);
                index = 0;
                for (int i = 1; i != lenght; i++){

                    if (list.get(i) < box) {
                        box = list.get(i);
                        index = i;
                    }
                }
                list.remove(index);
                sorted.add(box);
            }
        } else if (stage2 == 2){
            for (int j = lenght; j != 0; j--) {
                lenght = list.size();

                box = list.get(0);
                index = 0;
                for (int i = 1; i != lenght; i++){

                    if (list.get(i) > box) {
                        box = list.get(i);
                        index = i;
                    }
                }
                list.remove(index);
                sorted.add(box);
            }
        }
        System.out.println(" ");
        System.out.println("Your list sorted: " + sorted);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }
}
