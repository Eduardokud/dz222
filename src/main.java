public class main {
    public static void main(String[] args) {
        int c = 200; //балланс клиента
        int p = 700;//сумма пополнения
        int b;//начисленные бонусы
        if (p >= 1000) {
            b = p / 100;
        }
        else {
            b = 0;
        }
int i = c + p + b;
        System.out.println("бонус равен " + b + " рублям, " + "итоговая сумма на счету клиента " + i + " рублей");
    }

}
