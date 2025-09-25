public class Run {
    public static void main(String[] args) {

    }


    public static void moveCursor(int row, int col) {
        System.out.print(String.format("\u001B[%d;%df", row, col));
    }
}


