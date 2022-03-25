public class BmiService {
    public double calculateIndexMas(int weight, double height) {
        // weight - масса тела в кг
        // height - рост в метрах
        double index = (double) weight / (height * height);
        return index;
    }
}

