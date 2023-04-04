public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int payment = 1_200;

        int bonus = payment > 1000 ? payment / 100 : 0;

        int totalBalance;
        totalBalance = currentBalance + payment + bonus;
        System.out.println("Количество бонусных рублей " + bonus);
        System.out.println("Итоговый счет " + totalBalance);
    }
}
