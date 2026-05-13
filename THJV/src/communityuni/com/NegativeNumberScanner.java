package communityuni.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NegativeNumberScanner {

    public static void NegativeNumberInStrings(String str) {
        String regex = "-\\d+";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        
        System.out.print("Các số nguyên âm tìm thấy: ");
        boolean found = false;
        
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }
        
        if (!found) {
            System.out.print("Không tìm thấy số âm nào.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "abc-5xyz-12k9l--p";
        
        System.out.println("Chuỗi đầu vào: " + input);
        NegativeNumberInStrings(input);
    }
}