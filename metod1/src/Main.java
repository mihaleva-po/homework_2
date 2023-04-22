
public class Main {
    public static int sum = 0; // Суммарное количество яблок

    public static void main(String[] args) {
        int kolvoAppleIlya = 5; // Количество яблок у Ильи
        sum += kolvoAppleIlya;
        askKatya();
        askAnton();
        askDima();
        System.out.println("Суммарное количество яблок равняется " + sum);

    }

    static void askKatya()
    {
        int kolvoAppleKatya = 3;
        sum += kolvoAppleKatya;
    }

    static void askAnton()
    {
        int kolvoAppleAnton = 7;
        sum += kolvoAppleAnton;
    }

    static void askDima()
    {
        int kolvoAppleDima = 1;
        sum += kolvoAppleDima;
    }

}