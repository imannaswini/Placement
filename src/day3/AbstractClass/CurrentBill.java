package day3.AbstractClass;
import java.util.Scanner;

class CurrentBillBase {
    public double amount(double watts, double hours) {
        return 0.0;
    }
}

class Fan extends CurrentBillBase {
    @Override
    public double amount(double watts, double hours) {
        return (watts * hours) / 1000 * 1.2;
    }
}

class Light extends CurrentBillBase {
    @Override
    public double amount(double watts, double hours) {
        return (watts * hours) / 1000 * 1.5;
    }
}

class TV extends CurrentBillBase {
    @Override
    public double amount(double watts, double hours) {
        return (watts * hours) / 1000 * 1.8;
    }
}

public class CurrentBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fanW = sc.nextDouble();
        double fanH = sc.nextDouble();

        double lightW = sc.nextDouble();
        double lightH = sc.nextDouble();

        double tvW = sc.nextDouble();
        double tvH = sc.nextDouble();

        Fan fan = new Fan();
        Light light = new Light();
        TV tv = new TV();

        double total = fan.amount(fanW, fanH)
                       + light.amount(lightW, lightH)
                       + tv.amount(tvW, tvH);

        System.out.printf("%.2f", total);
    }
}