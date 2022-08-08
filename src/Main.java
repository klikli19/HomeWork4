public class Main {
    public static void main (String [] args) {
        System.out.println("Задание 1");
        int a = 0;
        while (a < 10){
        a++;
        System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b-- ) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("Задание 2");
        for (int friday = 7; friday < 31;  friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }




    }
}
