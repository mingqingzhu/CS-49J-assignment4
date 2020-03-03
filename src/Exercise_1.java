import java.util.Random;

public class Exercise_1 {
    private int randomNum;


    public void displayNum() {
        Random generator = new Random(1000);
        for(int i = 0; i < 50; i++) {
            randomNum = generator.nextInt(100);
            System.out.print(randomNum + " ");
        }
        System.out.println("\n");
    }
}
