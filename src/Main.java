public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 58;
        int tall = 183;
        int index = service.calculate(tall, mass);
    System.out.println(index);
    }
}