package task6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) {

        try {

            Menu menu = new Menu();
            menu.menu();

        } catch (NumberFormatException e) {
            System.out.println("Incorrect input!");
        }catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
        }catch (IOException e) {
            System.out.println("Input error!");
        }
    }
}
