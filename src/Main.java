public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int savingsFunds = 15000;
        int sum = 0;
        int month = 1;
        while (sum < 2_459_000) {
            sum += savingsFunds;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print (i + " " );
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int increasPopulation = 12_000_000;
        int mortality = increasPopulation / 1000 * 8;
        int birthRate = increasPopulation / 1000 * 17;
        for (int i = 1; i <= 10; i++) {
            increasPopulation = increasPopulation - mortality + birthRate;
            System.out.println("Год " + i + " численность населения составляет " + increasPopulation + " человек.");
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double initialAmount = 15000;
        int month = 1;
        while (initialAmount < 12_000_000) {
            initialAmount += initialAmount * 0.07;
            System.out.println(month + " Месяц " + " накоплений получено " + initialAmount);
            month++;
        }
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double initialAmount = 15000;
        int month = 1;
        for ( ; initialAmount < 12_000_000; month++) {
            initialAmount += initialAmount * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплений получено " + initialAmount);
            }
        }
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        double initialAmount = 15000;
        int month = 1;
        for (int i = 108; month <= 108; i++) {
            initialAmount += initialAmount * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплений получено " + initialAmount);
            }
            month++;
        }
        System.out.println();
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 4;
        do {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчёт.");
            friday +=  7;}
        while (friday <= 31);
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int startYear = 2023 - 200;
        int endYear = 2023 + 100;
        int cometYear = 0;
        while (cometYear < endYear) {
            if (cometYear > startYear) {
                System.out.println(cometYear);
            }
            cometYear += 79;
        }

    }
}