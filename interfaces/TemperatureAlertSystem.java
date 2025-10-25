import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = t -> t > 35.0;
        double temp = 38.5;
        if (isHighTemp.test(temp))
            System.out.println("Alert! High temperature: " + temp);
        else
            System.out.println("Temperature is normal: " + temp);
    }
}
