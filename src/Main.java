public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 58;
        double tall = 1.83;
        double index = service.calculate(tall, mass);
        
        System.out.println(Math.round(index));
    }
}