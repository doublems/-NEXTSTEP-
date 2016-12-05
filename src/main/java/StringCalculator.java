/**
 * Created by jerry on 2016-12-05.
 */
public class StringCalculator {
    public static int add(String s) {
        int result = 0;
        String[] numbers = split(s);
        if (numbers != null) {
            for (String ss : numbers) {
                if(!ss.equals("")){
                result += Integer.parseInt(ss);}
            }
        }

        return result;
    }

    private static String[] split(String s) {
        String[] numbers = null;
        if (s.contains(",")) {
            numbers = s.split(",");
        } else if (s.contains(":")) {
            numbers = s.split(":");
        } else if (s.startsWith("//")) {
            String divider = s.substring(2, s.lastIndexOf("\\n")).toString();
            s = s.replace("//","");
            s = s.replace("\\n","");
            numbers = s.split(divider);
        } else {
            numbers = new String[1];
            numbers[0] = s;
        }
        return numbers;
    }
}
