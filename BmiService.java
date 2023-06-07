public class BmiService {
    public double calculate(double weightInKg, double heightInM){
        double bmi;
        bmi = weightInKg / heightInM / heightInM;
        return bmi;
    }