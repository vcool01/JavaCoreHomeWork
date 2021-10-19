package HomeWork01;

public class Course {

    private int lengthRun;
    private int lengthSwim;
    private double lengthJump;

    public Course() {
        this.lengthRun = RandomValue.RandomValueInt(600);
        this.lengthSwim = RandomValue.RandomValueInt(50);
        this.lengthJump = RandomValue.RandomValueDouble(5);
    }

    @Override
    public String toString() {
        return "Course: {" +
                "run: " + lengthRun +
                ", swim: " + lengthSwim +
                ", jump: " + lengthJump +
                '}';
    }

    public int getLengthRun() {
        return lengthRun;
    }

    public int getLengthSwim() {
        return lengthSwim;
    }

    public double getLengthJump() {
        return lengthJump;
    }

    public boolean doIt( Player x){
        return (this.lengthRun <= x.getMaxLengthRun()
                && this.lengthSwim <= x.getMaxSwim()
                && this.lengthJump <= x.getMaxJump()
        );
    }


}
