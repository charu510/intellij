package Student;

public interface Teacher {
    void study();
    static void teach(){
        System.out.println("Teach");
    };
    void guide();
}
