public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculateIndexMas(47, 1.62);
        System.out.println("Ваш индекс массы тела: " + index);
    }
}