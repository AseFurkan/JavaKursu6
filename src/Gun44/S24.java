package Gun44;

public class S24 {
    public static void main(String[] args) {

        String[] strs = new String[2];
//        strs[0]="";
//        strs[1]="";

        int idx = 0;

        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }

        // NULL değere bir şey eklenemz NULLPointer exception
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            //strs[idx]=strs[idx].concat(" element " + idx);
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.print(strs[idx]);
        }
    }
}
