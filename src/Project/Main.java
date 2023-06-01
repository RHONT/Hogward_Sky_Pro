package Project;

public class Main {
    public static void main(String[] args) {
        Griffindor st1 = new Griffindor("Гарри Поттер", 60, 45);
        Griffindor st2 = new Griffindor("Гермиона Грейнджер", 45, 80);
        Griffindor st3 = new Griffindor("Рон Уизли", 35, 25);

        Slizerin st4 = new Slizerin("Драко Малфой", 70, 25);
        Slizerin st5 = new Slizerin("Грэхэм Монтегю", 60, 30);
        Slizerin st6 = new Slizerin("Грегори Гойл", 65, 10);

        Kogtevran st7 = new Kogtevran("Чжоу Чанг", 40, 20);
        Kogtevran st8 = new Kogtevran("Падма Патил", 80, 10);
        Kogtevran st9 = new Kogtevran("Маркус Белби", 60, 60);

        Puffendu st10 = new Puffendu(" Захария Смит", 44, 32);
        Puffendu st11 = new Puffendu("Седрик Диггори", 40, 30);
        Puffendu st12 = new Puffendu("Джастин Финч-Флетчли", 58, 96);


        System.out.println("Сравнить по факультету");
        System.out.println(st1.compareInnerStudent(st2));
        System.out.println();
        System.out.println("Сравнить по разных студентов");
        System.out.println(st1.compareDifferentStudent(st2));
        System.out.println();
        System.out.println("To String ");
        System.out.println(st1);
        System.out.println(st4);
        System.out.println(st7);
        System.out.println(st10);

    }
}
