package sky.pro.java.course1;

public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА 1

        System.out.println("Задача 1");

        int x = 1;

        while (x <= 10) {
            System.out.print(x + " ");
            x ++;
        }

        System.out.println(" ");

        for (x = 10; x > 0; x --) {
            System.out.print(x + " ");
        }

        System.out.println(" ");

        //ЗАДАЧА 2
        System.out.println("Задача 2");

        int reportDay = 7;

        while (reportDay <= 31) {
            System.out.println("Сегодня пятница, " + reportDay + "-е число. Необходимо подготовить отчет.");
            reportDay = reportDay + 7;
            }

        System.out.println(" ");

        //ЗАДАЧА 3
        System.out.println("Задача 3");

        int currentYear = 2021;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;

        for (x = pastYear; x <= futureYear; x ++) {
            if (x % 79 == 0) {
                System.out.println(x);
            }
        }


        }

    }