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

        for (int start = 79; start <= yearStop; start = start + 79) {
        }
        for (int comet = yearNow - 200; comet <= yearStop; comet++ ) {
            if ( comet % 79 == 0)
            System.out.println(comet);
        }
    }
}


