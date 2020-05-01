
public class Main {

    public static void main(String[] args) {
        int beerNum = 1;
        String word = "botles";

        while(beerNum>0) {
            if (beerNum == 1) {
                System.out.println("only one");

            }
            System.out.println(beerNum + " " + word + " off on the wall");

            beerNum = beerNum - 1;
        }
            if (beerNum > 1){
                System.out.println(beerNum + " " + word +" off on the wall");
            }else {
                System.out.println("we are out of " + word);
            }
    }
}

