public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public String description() {
        return super.description() + "Трудолюбивость " + diligence + ", верность " + loyalty + ", честность " + honesty;
    }

    public int sum() {
        return diligence + loyalty + honesty;
    }

    public void comparison(Hufflepuff student) {
        if(this.sum() > student.sum()) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем "+ student.getName());
        } else {
            System.out.println(student.getName() + " лучший Пуффендуец, чем "+ this.getName());
        }
    }
}
