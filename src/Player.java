public class Player extends Employee {

    private int power;
    private String nationality;

    public Player(String name, int power, int salary,String position, String nationality) {
       super(name,salary,position);
       this.nationality=nationality;
        this.power = power;

    }


    public int getPower() {
        return power;
    }
}
