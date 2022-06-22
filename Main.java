public class Main {
    public static void main(String[] args) {

        int account = 1100;
        int cash = 1000;
        int bonus;
        int priceBonus = 100;

        if (cash>1000) {

            bonus = cash/priceBonus;

            System.out.println("На счету: " + (account + cash + bonus) + " руб.");

            System.out.println("Начислено бонусных рублей: " + bonus);
        } else {
            System.out.println("На счету: " + (account + cash) + " руб.");
            System.out.println("Начислено бонусных рублей: 0");
        }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
