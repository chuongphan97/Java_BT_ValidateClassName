import java.util.Scanner;

public class ClassNameExampleTest {
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(classNameExample.validate(input));
    }
}
