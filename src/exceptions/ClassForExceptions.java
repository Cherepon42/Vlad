package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ClassForExceptions {

    public static void main(String[] args) {
        method_1();
        method_2();
        method_3();
        method_4();
        additionalTask();
    }

    public static void method_1() {
        try {
            FileReader file = new FileReader("/home/vlad/example1");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void method_2() {
        try {
            FileReader file = new FileReader("/home/vlad/example2");
            FileReader fileReader = new FileReader("123", Charset.defaultCharset());
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public static void method_3() {
        try {
            FileReader file = new FileReader("/home/vlad/example3");
        } catch (IOException | RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void method_4() {
        FileReader file = null;
        try {
            file = new FileReader("/home/vlad/example4");
        } catch (IOException | RuntimeException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException | NullPointerException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    public static void additionalTask() {
        try {
            throw new RuntimeException("Additional task.");
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            System.exit(1);
        } finally {
            System.out.println("Finally block");
        }
    }
}
