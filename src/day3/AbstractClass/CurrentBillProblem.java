package day3.AbstractClass;
import java.util.*;

class currentBill {
    public double amount() {
        return 0.0;
    }
}

class Fan extends currentBill {
    public double watts;
    public double hours;

    Fan(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours) / 1000.0;
    }
}

class Light extends currentBill {
    public double watts;
    public double hours;

    Light(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours) / 1000.0;
    }
}

class TV extends currentBill {
    public double watts;
    public double hours;

    TV(double watts, double hours) {
        this.watts = watts;
        this.hours = hours;
    }

    @Override
    public double amount() {
        return (watts * hours) / 1000.0;
    }
}

public class CurrentBillProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fw = sc.nextDouble();
        double fh = sc.nextDouble();

        double lw = sc.nextDouble();
        double lh = sc.nextDouble();

        double tw = sc.nextDouble();
        double th = sc.nextDouble();

        double x = sc.nextDouble();

        Fan fan = new Fan(fw, fh);
        Light light = new Light(lw, lh);
        TV tv = new TV(tw, th);

        double totalUnits = fan.amount() + light.amount() + tv.amount();
        double bill = totalUnits * x;

        System.out.printf("%.2f", bill);
        sc.close();
    }
}
