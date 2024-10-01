import java.util.Scanner;

public class Main {
    public static String[] todos = new String[3];
    public static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        todos[0] = "Mewarnai";
        todos[1] = "Membaca";
        todos[2] = "Bersepeda";
        showTodoList();
    }

    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];
            if (todo != null) {
                System.out.println((i + 1) + "." + todo);
            }
        }
    }

    public static void addTodoList(String todo) {
        //resizeArrayIfFull();
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todo;
                break;
            }
        }
    }

    public static void resizeIfFull() {
        //cek whether todos is full
        Boolean isFull = true;
        // isFull = isArrayFull(isFull

        //if full, resize current array to two times bigger
        if (isFull) {

            //resizeArrayToTwoTimesBigger();
        }
    }
}


public static boolean isArrayFull() {
    for(int)







        return true;
}
public static void resizeArrayToTwoTimesBigger() {
    String[] temp =
}