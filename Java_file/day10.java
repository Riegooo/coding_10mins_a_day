package coding_10min_a_day.Java_file;

public class day10 {
    public static void main(String[] args) {

        String myinput = "Java,JavaScript,C#";
        String delimeter = ",";

        String[] prog_languages = myinput.split(delimeter);

        for (String prog_language : prog_languages){
            System.out.println(prog_language);
        }
        
    }
}
