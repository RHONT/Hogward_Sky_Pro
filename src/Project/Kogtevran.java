package Project;
//smart, wise, witty and full of creativity.

public class Kogtevran extends Hogward {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;


    public Kogtevran(String name, int magicPower, int teleport) {
        super(name, magicPower, teleport);
        this.smart = (int) (Math.random() * 100) + 1;
        this.wise = (int) (Math.random() * 100) + 1;
        this.witty = (int) (Math.random() * 100) + 1;
        this.creativity = (int) (Math.random() * 100) + 1;
        setSumPointFaculty(smart + wise + witty + creativity);
    }

    public String compareInnerStudent(Kogtevran student_1, Kogtevran student_2) {

        if (student_1.getSumPointFaculty() > student_2.getSumPointFaculty()) {
            return student_1.getName() + " лучший когтевранец, чем " + student_2.getName();
        }

        if (student_1.getSumPointFaculty() < student_2.getSumPointFaculty()) {
            return student_2.getName() + " лучший когтевранец, чем " + student_1.getName();
        }

        return student_1.getName() + " равен по заслугам с " + student_2.getName();
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран [ " +
                "Имя = " + getName() +
                " Сила магии = " + getMagicPower() +
                " Телепортация = " + getTeleport() +
                " Ум = " + smart +
                " Мудрость = " + wise +
                " Остроумие = " + witty +
                " Творчество = " + creativity +
                " Баллы по факультету = " + getSumPointFaculty() +
                ']';
    }


}
