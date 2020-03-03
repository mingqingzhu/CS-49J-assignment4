public class Exercise_2 {
    private String word;

    public Exercise_2(String word) {
        this.word = word;
    }

    public void printRev() {
        System.out.print("The reversed word is: ");
        for(int i = word.length(); i > 0; i--) {
            System.out.print(word.charAt(i-1));
        }
        System.out.println("\n");
    }
}
