import java.util.Scanner;

public class HomeView {
    private final Scanner scanner = new Scanner(System.in);
    private final AddService service = new AddService();
    private static final HomeView selfObject = new HomeView();

    public void next() {
        System.out.println("Enter a option\n1.add value\n2.pop value");
        final int userOption = scanner.nextInt();

        if (userOption == 1) {
            System.out.println("Enter a number to add");
            final int value = scanner.nextInt();
            service.pushFunction(value, selfObject);
        } else if (userOption == 2) {
            service.popFunction(selfObject);
        } else  {
            System.out.println("Enter a valid number");
            System.out.printf("Sum = %d", service.getValue());
        }
    }
    public static void main(String[] args) {
        selfObject.next();
    }
}