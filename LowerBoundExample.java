import java.util.*;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        // You can add Integer or its subclass (like int literal)
        list.add(10);
        list.add(20);
        System.out.println("List after adding numbers: " + list);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(30);
        addNumbers(numberList); // Works because Number is a superclass of Integer

        List<Object> objectList = new ArrayList<>();
        objectList.add("40");
        addNumbers(objectList); // Also works because Object is a superclass of Integer
    }
}
