public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;
    private String name;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String description() {
        return "Мощность колдовства " + magicPower + ", дистанция трансгрессирования " + transgressionDistance + ", имя " + name;
    }

    public int sum() {
        return magicPower + transgressionDistance;
    }

    public void comparison(Hogwarts student) {
        if(this.magicPower > student.magicPower) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем "+ student.getName());
        } else {
            System.out.println(student.getName() + " обаладает бОльшей мощностью магии, чем "+ this.getName());
        }

        if(this.transgressionDistance > student.transgressionDistance) {
            System.out.println(this.getName() + " обладает бОльшей дистанцией трансгрессии, чем "+ student.getName());
        } else {
            System.out.println(student.getName() + " обаладает бОльшей дистанцией трансгрессии, чем "+ this.getName());
        }
    }

}
