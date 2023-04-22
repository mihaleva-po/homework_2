


public class Main {
    public static void main(String[] args) {
        int sum = 0; // Суммарное количество яблок
        int kolvoAppleIlya = 5; // Количество яблок у Ильи
        sum += kolvoAppleIlya;
        sum = askKatya(sum);
        sum = askAnton(sum);
        sum = askDima(sum);
        System.out.println("Суммарное количество яблок равняется " + sum);

    }

    static int askKatya(int sum)
    {
        int kolvoAppleKatya = 3;
        sum += kolvoAppleKatya;
        return sum;
    }

    static int askAnton(int sum)
    {
        int kolvoAppleAnton = 7;
        sum += kolvoAppleAnton;
        return sum;
    }

    static int askDima(int sum)
    {
        int kolvoAppleDima = 1;
        sum += kolvoAppleDima;
        return sum;
    }

}