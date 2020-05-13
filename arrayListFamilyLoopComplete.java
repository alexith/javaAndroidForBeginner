import java.util.*;

public class arrayListFamilyLoopComplete {
    public static void main(String[] args) {
        List familyMemberList = new ArrayList();

        familyMemberList.add("Mummy");
        familyMemberList.add("papa");
        familyMemberList.add("me");
        familyMemberList.add("didi");s

        for(int i = 0; i < 4; i++) {
            System.out.println(familyMemberList.get(i));
        }
    }
}
