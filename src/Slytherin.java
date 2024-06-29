public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lust) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust = lust;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLust() {
        return lust;
    }

    public String description() {
        return super.description() + "Хитрость " + cunning + ", решительность " + determination + ", амбициозность " + ambition + ", находчивость " + resourcefulness + ", жажда власти " + lust;
    }

    public int sum() {
        return cunning + determination + ambition + resourcefulness + lust;
    }

    public void comparison(Slytherin student) {
        if(this.sum() > student.sum()) {
            System.out.println(this.getName() + " лучший Слизеринец, чем "+ student.getName());
        } else {
            System.out.println(student.getName() + " лучший Слизеринец, чем "+ this.getName());
        }
    }
}
