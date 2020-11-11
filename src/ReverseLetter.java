public class ReverseLetter {
    public static void main(String[] args) {
        String word = "United States";
        String nWord = "";
        for (int i = word.length()-1; i>=0 ; i--) {
            nWord+=word.charAt(i);

        }
        System.out.println(nWord);
    }
}
