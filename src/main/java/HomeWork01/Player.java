package HomeWork01;

public class Player {
    protected  String name;
    private int maxLengthRun;
    private  int maxSwim;
    private double maxJump;

    public Player(String name){
        this.name = name;
        this.maxLengthRun = RandomValue.RandomValueInt(1000);
        this.maxSwim = RandomValue.RandomValueInt(100);
        this.maxJump = RandomValue.RandomValueDouble(10);
    }

    @Override
    public String toString() {
        return "Member " + name + ": {" +
                "run: " + maxLengthRun +
                ", swim: " + maxSwim +
                ", jump: " + maxJump +
                '}';
    }

    public int getMaxLengthRun() {
        return maxLengthRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public String getName() {
        return name;
    }

    public double getMaxJump() {
        return maxJump;
    }
}
