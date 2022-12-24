public class Beeline {
    public static void main(String[] args) {
        int addBalance = 1100; //пополнение
        int balance = 100; //минимальный баланс
        int bonus = 1; //количество бонусов
        int addBonus;

        if (addBalance >= 1001) {
            addBonus = addBalance / 100 * bonus;

        } else {
            addBonus = 0;

        }

        System.out.println("Бонус: " + (balance + addBalance + addBonus));
    }
}
