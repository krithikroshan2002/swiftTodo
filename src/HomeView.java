import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class HomeView {
    private final Scanner scanner = new Scanner(System.in);
    private final AddService service = new AddService();
    private static final HomeView selfObject = new HomeView();

    public void next() {
        System.out.println("Enter a option\n1.add value\n2.pop value");
        final int userOption = scanner.nextInt();

        if (userOption == 1) {
            service.pushFunction(selfObject, 4,45 ,56,45674,3,34,44,3);
        } else if (userOption == 2) {
            service.popFunction(selfObject);
        } else  {
            System.out.println("Enter a valid number");
            System.out.printf("Sum = %d", service.getValue());
            next();
        }
    }
    public static void main(String[] args) {
        selfObject.next();
    }
}