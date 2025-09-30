import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Manager task = new Manager();
        int option;

        do {
            System.out.println("\n=== MENU OF TASK ===");
            System.out.println("1 - add");
            System.out.println("2 - show tasks");
            System.out.println("3 - done task");
            System.out.println("4 - exit");
            System.out.print("type your option: ");
            option = in.nextByte();
            System.out.println("");

            switch (option){
                case 1:
                    task.addTaskUser();
                    break;
                case 2:
                    task.showTask();
                    break;
                case 3:
                    System.out.print("type ID of task:");
                    int id = in.nextInt();
                    task.doneTask(id);
                    break;
                case 4:
                    System.out.println("finished");
                    break;
                default:
                    System.out.println("invalid option");
            }

        }while (option != 4);


    }
}