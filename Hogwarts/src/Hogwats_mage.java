import java.util.Random;

public class Hogwats_mage {
    private String role;
    private String name;
    private int age;
    private int COS; // cours of study
    private int magic_power;
    private int hp;
    private String WM; // wand material

    Hogwats_mage(){
        String[] roles = {"Student", "Teacher"};
        role = roles[new Random().nextInt(roles.length-1)];
        String[] names = {};
    }

    void print(){
        System.out.println(new Hogwats_mage());
    }
}
