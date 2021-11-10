package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }
        for (int a = 5; a < 31; a = a + 7) {
            System.out.println("сегодня пятница " + a + " необходимо подготовить отчет ");
        }

        int cur_date = 2021;
        int period = 79;
        int date = cur_date - 200;
        int afterYear = cur_date + 100;
        for (int z = date; z < cur_date + 100; z++) {
            if (z % period == 0) {
                System.out.println(z);
            }
        }
    }
}