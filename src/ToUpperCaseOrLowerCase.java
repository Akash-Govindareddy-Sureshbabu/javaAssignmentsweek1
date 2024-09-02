import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
public class ToUpperCaseOrLowerCase {
    public static void main(String[] args) {


        ArrayList<String> strings= new ArrayList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("ghi");


        List<String> upperCaseStrings = strings.stream()
                .map(e->e.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Uppercase Strings: " + upperCaseStrings);
    }

}
//interface
//abstract class
//concrete class
//constructors
