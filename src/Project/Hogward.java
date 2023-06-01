package Project;

public abstract class Hogward {
    private final String name;
    private int magicPower;
    private int teleport;
    private int sumPointFaculty;

    public Hogward(String name, int magicPower, int teleport) {
        this.name = name;
        this.magicPower = magicPower;
        this.teleport = teleport;
    }

    public String compareDifferentStudent(Hogward o) {
        if (magicPower + teleport > o.getMagicPower() + o.getTeleport()) {
            return this.name + " обладает большей мощностью магии, чем " + o.getName();
        }

        if (magicPower + teleport < o.getMagicPower() + o.getTeleport()) {
            return o.getName() + " обладает большей мощностью магии, чем " + this.name;
        }

        return o.getName() + " равен по силе " + this.name;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        this.teleport = teleport;
    }

    public int getSumPointFaculty() {
        return sumPointFaculty;
    }

    public void setSumPointFaculty(int sumPointFaculty) {
        this.sumPointFaculty = sumPointFaculty;
    }

    @Override
    public String toString() {
        return "Hogward{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", teleport=" + teleport +
                ", sumPointFaculty=" + sumPointFaculty +
                '}';
    }
}
