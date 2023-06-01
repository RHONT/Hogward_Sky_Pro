package Project;

public class Slizerin extends Hogward {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;


    public Slizerin(String name, int magicPower, int teleport) {
        super(name, magicPower, teleport);
        this.determination = (int) (Math.random() * 100) + 1;
        this.ambition = (int) (Math.random() * 100) + 1;
        this.resourcefulness = (int) (Math.random() * 100) + 1;
        this.lustPower = (int) (Math.random() * 100) + 1;
        setSumPointFaculty(determination + ambition + resourcefulness + lustPower + cunning);
    }

    public String compareInnerStudent(Slizerin student_1, Slizerin student_2) {

        if (student_1.getSumPointFaculty() > student_2.getSumPointFaculty()) {
            return student_1.getName() + " лучший слизеринец, чем " + student_2.getName();
        }

        if (student_1.getSumPointFaculty() < student_2.getSumPointFaculty()) {
            return student_2.getName() + " лучший слизеринец, чем " + student_1.getName();
        }

        return student_1.getName() + " равен по заслугам с " + student_2.getName();
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    @Override
    public String toString() {
        return "Слизерин [ " +
                "Имя = " + getName() +
                " Сила магии = " + getMagicPower() +
                " Телепортация = " + getTeleport() +
                " Хитрость = " + cunning +
                " Решительность = " + determination +
                " Амбициозность = " + ambition +
                " Находчивость = " + resourcefulness +
                " Жажда Власти = " + lustPower +
                ']';
    }
}
