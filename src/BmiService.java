public class BmiService {

    public int calculate(double weightKg, double highMetres) {
        double result;
        result = (weightKg / highMetres / highMetres);


        return (int) result;

    }
}

