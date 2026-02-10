package coding_10min_a_day.Java_file;

public class day5 {

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {

        String word = "hello World";
        String capitalizedWord = capitalizeFirstLetter(word);
        System.out.println(capitalizedWord);
    }
}
