public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98.0;
        double heightInM = 1.87;
        double bmi = service.calculate(weightInKg, heightInM);
        int bmiInt = (int) bmi;
        System.out.println(bmiInt);
    }
}