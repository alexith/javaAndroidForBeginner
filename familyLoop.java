public class familyLoop {
    public static void main(String[] args) {
        String[] familyList = {"mummy", "papa", "me", "didi"};

        for(int i = 0; i < familyList.length; i++){
            System.out.println(familyList[i]);
        }

        //Another way but less customization option given below in case

        for(String name : familyList){
            System.out.println(name);
        }
    }
}
