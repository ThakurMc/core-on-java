public class pattern2 {
    public static void main(String[] args) {
        int r=7;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < r; j++) {
                    if (i == 0 || j == 0 || i == r - 1 || j == r - 1)
                        System.out.print("*"+" ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
    }
}
