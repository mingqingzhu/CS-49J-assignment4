public class Exercise_3 {
    private int n;

    public Exercise_3(int n) {
        this.n = n;
    }

    public void printFib() {
        int fold1 = 1;
        int fold2 = 1;
        int fnew = fold1 + fold2;
        if(n < 1) {
            System.out.println("The input is invalid!");
        } else if(n == 1) {
            System.out.println("The first fibonacci is: 1");
        } else if(n == 2) {
            System.out.println("The second fibonacci is: 1");
        } else if(n == 3) {
            System.out.println("The third fibonacci number is: " + fnew);
        } else {
            for (int i = 3; i < n; i++) {
                fold1 = fold2;
                fold2 = fnew;
                fnew = fold1 + fold2;
            }
            System.out.println("The " + n + "th fibonacci number is: " + fnew);
        }
    }
}
