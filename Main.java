import java.util.*;

public class Main {

    public static void operations() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> medicines = new ArrayList<String>();
        medicines.add("Paracetemol");
        medicines.add("Betadine");
        medicines.add("Pantacid");
        System.out.println("1. List the available medicines");
        System.out.println("2. Check medicine availability");
        System.out.println("3. Add medicine");
        System.out.println("4. Remove medicine");
        System.out.println("\n\nCtrl+C to exit");
        System.out.print("ENTER YOUR CHOICE : ");
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                int size = medicines.size();
                System.out.print("\033[H\033[2J");
                System.out.println("The Available medicines are:");
                for (int i = 0; i < size; i++) {
                    System.out.println(medicines.get(i));
                }
                System.out.println("\n\n");
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.println("Enter the medicine name");
                String med = sc.next();
                if (medicines.contains(med)) {
                    System.out.println(med + " is Available");
                } else {
                    System.out.println(med + " is unavailable");
                }
                System.out.println("\n\n");
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                System.out.println("Enter the medicine name:");
                String med1 = sc.next();
                if (medicines.contains(med1)) {
                    System.out.println("Medicine is already available");
                } else {
                    medicines.add(med1);
                }
                int size1 = medicines.size();
                System.out.println("The  medicines are:");
                for (int i = 0; i < size1; i++) {
                    System.out.println(medicines.get(i));
                }
                System.out.println("\n\n");
                break;
            case 4:
                System.out.print("\033[H\033[2J");
                System.out.println("Enter the name of the medicine to be removed:");
                String med2 = sc.next();
                if (medicines.contains(med2)) {
                    medicines.remove(med2);
                } else {
                    System.out.println("Medicine is not available");
                }
                int size2 = medicines.size();
                System.out.println("The  medicines are:");
                for (int i = 0; i < size2; i++) {
                    System.out.println(medicines.get(i));
                }
                System.out.println("\n\n");
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.println("Invalid choice");
                System.out.println("\n\n");
        }
    }

    public static void main(String[] args) {
        while (true) {
            operations();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
