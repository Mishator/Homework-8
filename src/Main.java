public class Main {
    public static void main(String[] args) {
        task1();
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
}