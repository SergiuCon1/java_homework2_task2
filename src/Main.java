public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int depositAmount = 19999;
        int initialBonusRubles = 0;

        int finalScore = initialAccount + depositAmount;
        int bonusRubles = initialBonusRubles;
        if (depositAmount >= 1000) {
            bonusRubles = depositAmount / 100 + initialBonusRubles;
        } else {
            bonusRubles = initialBonusRubles;
        }
        System.out.println("Итоговый счёт = " + finalScore);
        System.out.println("Количество бонусных рублей = " + bonusRubles);
    }
}
