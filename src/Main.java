public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("Задание 2");
        for (int friday = 7; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        System.out.println("Задание 3");
        int yearNow = 2022;
        int yearStop = yearNow + 100;
        for (int comet = yearNow - 200; comet <= yearStop; comet++ ) {
            if (comet % 79 == 0)
            System.out.println(comet);
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int c = 1; c <= 30; c++) {
            if (c % 3 == 0 && c % 5 == 0) {
                System.out.println(c + ": ping pong");
            } else if (c % 3 == 0) {
                System.out.println(c + ": ping");
            } else if (c % 5 == 0) {
                System.out.println(c + ": pong");
            } else {
                System.out.println(c);
            }
        }
        System.out.println();

        System.out.println("Задание 5");
        int i = 0;
        int j = 1;
        System.out.print(i + " " + j + " ");
        int f;
        for (int f0 = 2; f0 < 10; f0++) {
            f = i + j;
            i = j;
            j = f;
            System.out.print(f + " ");
        }


        }
    }



