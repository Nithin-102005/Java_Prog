
public class String6 {
    public static void main(String[] args) {
        String s1 = "Java Programming Language";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }
        String s2 = result.toString();
        System.out.println(s2); 
    }
}
