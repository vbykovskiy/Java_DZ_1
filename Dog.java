package Task1;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog() {
       // super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }
    @Override
    public void toGo() {
        System.out.println("Dog go");
    }

    @Override
    public void toSwim() {
        System.out.println("Dog swim");
    }
}
