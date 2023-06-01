package Project;

public class Puffendu extends Hogward {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffendu(String name, int magicPower, int teleport) {
        super(name, magicPower, teleport);
        this.hardworking = (int) (Math.random() * 100) + 1;
        this.loyal = (int) (Math.random() * 100) + 1;
        this.honest = (int) (Math.random() * 100) + 1;
        setSumPointFaculty(hardworking + loyal + honest);

    }

    public String compareInnerStudent(Puffendu student_1, Puffendu student_2) {

        if (student_1.getSumPointFaculty() > student_2.getSumPointFaculty()) {
            return student_1.getName() + " лучший Пуфендуец, чем " + student_2.getName();
        }

        if (student_1.getSumPointFaculty() < student_2.getSumPointFaculty()) {
            return student_2.getName() + " лучший Пуфендуец, чем " + student_1.getName();
        }

        return student_1.getName() + " равен по заслугам с " + student_2.getName();
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Пуффендуй [ " +
                "Имя = " + getName() +
                " Сила магии = " + getMagicPower() +
                " Телепортация = " + getTeleport() +
                " Трудолюбие = " + hardworking +
                " Верность = " + loyal +
                " Честность = " + honest +
                " Баллы по факультету = " + getSumPointFaculty() +
                ']';
    }

}
