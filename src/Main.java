import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(tempAndAge(25, 20));
        System.out.println(tempAndAge(20, 25));
        System.out.println(tempAndAge(35, 33));
        System.out.println(tempAndAge(41, 39));
        System.out.println(tempAndAge(12, 19));
        System.out.println(tempAndAge(generateRandomAge(), 22));
        System.out.println(generateRandomAge());
    }

    public static String tempAndAge(int ageOfMan, int temperature) {
        if (20 <= ageOfMan && ageOfMan <= 45 && -20 <= temperature && temperature <= 30) {
            return "Можно идти гулять";
        } else if (20 >= ageOfMan && 0 <= temperature && temperature <= 28) {
            return "Можно идти гулять";

        } else if (45 <= ageOfMan && -10 <= temperature && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int randomAge = random.nextInt(101);
        return randomAge;
    }
}
