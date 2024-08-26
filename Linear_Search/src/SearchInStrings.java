public class SearchInStrings {
    public static void main(String[] args) {
        String name = "ChetanSriaknt";
        char target = 'e';

        boolean isFound = findchar(name, target);

        System.out.println("Target letter:" + target + " is the target available:" + isFound);
    }

    private static boolean findchar(String name, char target) {
        if(name.length() == 0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
