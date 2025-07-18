public class Prectical2C {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Welcome to");

        sb.append(" Buffer");
        System.out.println("After append: " + sb);

        sb.insert(10, " Str");
        System.out.println("After insert: " + sb);

        sb.replace(10, 14, " String");
        System.out.println("After replace: " + sb);

        sb.delete(8, 11);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Length: " + sb.length());

        sb.setLength(5);
        System.out.println("After setting length: " + sb);
    }
}
