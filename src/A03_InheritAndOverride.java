class Cycle {
    private final String name;

    public Cycle() {
        name = "a cycle";
    }

    String getName() {
        return name;
    }
}

class MotorCycle extends Cycle {
//    @Override
    String getName() {
        return "a motorcycle";
    }

    void sayHello() {
        System.out.println("Hello I am " + getName() + ", I am " + super.getName() + " with an engine.");
        System.out.println("My ancestor is " + super.getName() + " who is a vehicle with pedals.");
    }
}

public class A03_InheritAndOverride {
    public static void main(String[] args) {
        MotorCycle mc = new MotorCycle();
        mc.sayHello();
    }
}
