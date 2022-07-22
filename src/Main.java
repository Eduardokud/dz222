public class Main {
    public static void main(String[] args) {
        int ballans = 200; //балланс клиента
        int popolnenie = 700;//сумма пополнения
        int bonus;//начисленные бонусы
        if (popolnenie >= 1000) {
            bonus = popolnenie / 100;
        } else {
            bonus = 0;
        }
        int i = ballans + popolnenie + bonus;
        System.out.println("бонус равен " + bonus + " рублям, " + "итоговая сумма на счету клиента " + i + " рублей");
    }

}
