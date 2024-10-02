import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static String[] todos = new String[3];
    public static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addTodoList("Mewarnai");
        addTodoList("Membaca");
        addTodoList("Bersepeda");
        addTodoList("Berkhotbah");
        showTodoList();
        editTodoList(3,"Bekerja");
        removeTodoList(3);
        System.out.println("AFTER DELETE");
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
        resizeIfFull();
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todo;
                break;
            }
        }
    }

    public static void resizeIfFull() {
        //cek whether todos is full
        Boolean isFull;
        isFull = isArrayFull();

        //if full, resize current array to two times bigger
        if (isFull){
            resizeArrayToTwoTimesBigger();
        }
    }

    public static boolean isArrayFull() {
        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                return false;
            }
        }
        return true;
    }

    public static void resizeArrayToTwoTimesBigger() {
        String[] temp = todos;
        todos = new String[todos.length * 2];
        for (int i = 0; i < temp.length; i++) {
            todos[i] = temp[i];
        }
    }

    public static boolean removeTodoList(Integer number) {
        // TOOD: add validation

        for (int i = number - 1; i < todos.length; i++) {
            if (i == (todos.length - 1)) {
                todos[i] = null;
            } else {
                // replace with the element on the right
                todos[i] = todos[i + 1];
            }
        }
        return true;
    }

    public static boolean isSelectedTodoNotValid(Integer number) {
        // cek if the number is zero less then zero
        if (number <= 0) {
            return true;
        }

        // check if the number is greater than the todos size/length
        if (number - 1 > todos.length - 1) {
            return true;
        }

        //check whether the element is alredy null
        if (todos[number - 1] == null) {
            return true;
        }
        return false;
    }

    public static boolean editTodoList(Integer number, String newTodo) {
        if (isSelectedTodoNotValid(number)) {
            return false;
        }
        todos[number - 1] = newTodo;
        return true;
    }
}