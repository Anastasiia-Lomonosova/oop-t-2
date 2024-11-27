public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weightKg = 95;
        double highMetres = 1.98;
        int bmi = service.calculate(weightKg, highMetres);
        System.out.println(bmi);
    }
}
