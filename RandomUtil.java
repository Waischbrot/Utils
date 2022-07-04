public class RandomUtil {

    public static double getRandomDouble(double min, double max) {

        Random random = new Random();
        return random.nextDouble() * (max - min) + min;

    }
}  
