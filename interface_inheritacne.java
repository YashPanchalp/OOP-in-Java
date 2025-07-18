interface Animal {
    void canEat();

    interface Cow {

        void giveMilk();

    }
}

class Main implements Animal.Cow {
    public void giveMilk() {
        System.out.println("Cow giveing milk");
    }
}

public class interface_inheritacne {

    public static void main(String[] args) {
        Main m = new Main();

        m.giveMilk();
        {
            int a = 10;
            System.out.println(a);
        }
    }

}