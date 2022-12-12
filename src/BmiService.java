public class BmiService {
    public int calculate(int tall, int mass) {
        int indexBodyWeight = mass * tall * tall;
        return indexBodyWeight;
    }
}
