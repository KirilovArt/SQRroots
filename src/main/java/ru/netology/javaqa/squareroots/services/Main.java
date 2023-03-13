import ru.netology.javaqa.squareroots.services.SqrService;

public class Main {

    public static void main(String[] args) {
        int lowervalue = -100;
        int uppervalue = 100;
        SqrService service = new SqrService();
        System.out.println("Колличество чисел: " + service.calcSqr(lowervalue, uppervalue));
    }
}