public class ConverToUppercase {
    public static String toUpperCase(String str){
        // StringBuilder helps to frequently changes in a string without extra time complexity
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            // check if the space is there then the next word should be in uppercase but also keep in mind that we're not at the end of the string
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        // convert it into string 
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i'm suvra";
        System.out.println(toUpperCase(str));
    }
}
