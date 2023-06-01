package Project;

public class Griffindor extends Hogward {
    private int nobility;
    private int honor;
    private int courage;


    public Griffindor(String name, int magicPower, int teleport) {
        super(name, magicPower, teleport);
        this.nobility = (int) (Math.random() * 100) + 1;
        this.honor = (int) (Math.random() * 100) + 1;
        this.courage = (int) (Math.random() * 100) + 1;
        setSumPointFaculty(nobility + honor + courage);

    }

    public String compareInnerStudent(Griffindor student_2) {

        if (getSumPointFaculty() > student_2.getSumPointFaculty()) {
            return getName() + " лучший гриффиндорец, чем " + student_2.getName();
        }

        if (getSumPointFaculty() < student_2.getSumPointFaculty()) {
            return student_2.getName() + " лучший гриффиндорец, чем " + getName();
        }

        return getName() + " равен по заслугам с " + student_2.getName();
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }


    @Override
    public String toString() {
        return "Гриффиндор [ " +
                "Имя = " + getName() +
                " Сила магии = " + getMagicPower() +
                " Телепортация = " + getTeleport() +
                " Благородство = " + nobility +
                " Честь = " + honor +
                " Храбрость = " + courage +
                " Баллы по факультету = " + getSumPointFaculty() +
                ']';
    }

}
