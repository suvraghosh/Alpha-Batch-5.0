public class searchString {
    public static void main(String[] args) {
        String name = "suvra";
        char target = 'a';
        boolean ans = linearSearchInString(name, target);
        System.out.println(ans);
    }
    static boolean linearSearchInString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
