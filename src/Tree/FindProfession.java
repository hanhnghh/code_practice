package Tree;

public class FindProfession {
    public static String findProfession(int level, int pos) {
        return findJob(level-1, pos-1);

    }

    public static String findJob(int level, int pos){
        if(pos == 0)
            return "Engineer";
        else if(pos == 1)
            return "Doctor";

        if(pos % 2 == 0){
            //System.out.println("chan: " + findProfession(level - 1, pos/2));
            return (findJob(level - 1, pos/2));
        } else {
            //System.out.println("le: " + findProfession(level - 1, pos/2));
            if(findJob(level-1, pos/2).equals("Engineer")){
                return "Doctor";
            } else {
                return "Engineer";
            }
        }
    }
}
