import com.sun.source.util.TaskEvent;

import java.util.ArrayList;
import java.util.Scanner;

// Joleyne Hernandez 02/03/24 CSCI 1660
public class Main {
    public static ArrayList<Tasks> myTask = new ArrayList<>();



    public static void newTask(Scanner input) {
        System.out.println("What's the name of the task");
        String taskName = input.nextLine();

        System.out.println("What's the task description?");
        String getDescription = input.nextLine();

        System.out.println("What's the priority value for this task?");
        int taskPrior = input.nextInt();
        input.nextLine();

        Tasks theNewTasks = new Tasks(taskName, getDescription, taskPrior);
        myTask.add(theNewTasks);

    }

    public static void reMove(Scanner input) {
        System.out.println(myTask);
        System.out.println("What Task would you like to remove? 0 - "+myTask.size());
        int taskToList = input.nextInt();
        input.nextLine();
        myTask.remove(taskToList);
        System.out.println("Your List "+myTask);
    }

    public static void upDate(Scanner input) {
        System.out.println("What Task would you like to update? 0 - "+myTask.size());
        int num = input.nextInt();
        System.out.println("Please updated the task to your liking");
        input.nextLine();
    }
    public static void list(){
        System.out.println(myTask);

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int choice = choices(input);
        while (choice != 0) {
            switch (choice) {
                case 1:
                    newTask(input);
                    choice = choices(input);
                    break;

                case 2:
                    reMove(input);
                    choice = choices(input);

                    break;
                case 3:
                    upDate(input);
                    choice = choices(input);
                    break;

                case 4:
                    list();
                    choice = choices(input);
                    break;

                default:
                    System.out.println("Please enter an actual option");
                    choice = choices(input);
                    break;
            }
        }
    }
    public static int choices(Scanner input) {
        System.out.println("(1) Add a Task");
        System.out.println("(2) Remove a Task");
        System.out.println("(3) Update a Task");
        System.out.println("(4) List all Tasks");
        System.out.println("(0) Exit");
        System.out.println("Your List "+myTask);
        System.out.println("What option would you like to choose?");


        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
}