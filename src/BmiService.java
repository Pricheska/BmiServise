public class BmiService {
    public double calculate(double tall, int mass) {
        double indexBodyWeight = mass / (tall * tall);
        return indexBodyWeight;
    }
}
