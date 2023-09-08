public class Main {
    public static void main(String[] args) {
        int flagWidth = 15;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < flagWidth; i++) {
                if (i < 5 || i >= 10) {
                    System.out.print("+");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}