public class Main {
    public static void main(String[] args) {


        Gryffindor potter = new Gryffindor("Гарри Поттер", 50, 50, 32, 25, 67);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 76, 70, 54, 52, 85);
        Gryffindor ron = new Gryffindor("Рон Уизли", 23, 20, 55, 43, 13);

        Slytherin drako = new Slytherin("Драко Малфой", 25, 53, 43, 52, 53, 76, 31);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 53, 21, 43, 65, 32, 31, 42);
        Slytherin gregory = new Slytherin("Грегори Гойл", 56, 32, 13, 54, 43, 43, 54);

        Hufflepuff zahar = new Hufflepuff("Захария Смит", 76, 42, 43, 54, 65);
        Hufflepuff sedrick = new Hufflepuff("Седрик Диггори", 52, 42, 53, 43, 12);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 54, 63, 42, 13, 54);

        Ravenclaw jou = new Ravenclaw("Чжоу Чанг", 43, 87, 32, 43, 54, 32);
        Ravenclaw padme = new Ravenclaw("Падма Патил", 41, 65, 53, 71, 54, 23);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 45, 76, 54, 78, 31, 56);

        Hogwarts albus = new Hogwarts("Альбус Дамблдор", 100, 100);
        Hogwarts severus = new Hogwarts("Северус Снейп", 89, 95);

        drako.comparison(graham);
        potter.comparison(ron);
        zahar.comparison(justin);
        jou.comparison(marcus);

        albus.comparison(gregory);
        sedrick.comparison(padme);
        severus.comparison(germiona);
    }
}