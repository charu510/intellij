package Student;

public class TA implements Teacher,Student {

    @Override
    public void bunk() {
        System.out.println("Bunker");
    }

    @Override
    public void pubg() {
        System.out.println("Playing");
    }

    @Override
    public void study() {
        System.out.println("Studying");
    }



    @Override
    public void guide() {
        System.out.println("PathDecider");
    }
}
