public class loopingThroughTriangularNumber {
    public static void main(String[] args) {

        int i = 1;
        int triangularNumber = 1;

        while(i<=10) {
            System.out.println(triangularNumber);

            i++;

            triangularNumber = triangularNumber + i;

        }
    }
}
