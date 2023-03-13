import ru.netology.javaqa.squareroots.services.SqrService;

public class Main {

    public static void main(String[] args){
        int x = -100;
        int y = 100;
        SqrService service = new SqrService();
        System.out.println("Колличество чисел: " + service.calcSqr(x,y) );
    }
}