public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int witty;
    private int creativity;

    public Ravenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int intelligence,
                     int wisdom,
                     int witty,
                     int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public String description() {
        return super.description() + "Ум " + intelligence + ", мудрость " + wisdom + ", остроумность " + witty + ", творчество " + creativity;
    }

    public int sum() {
        return intelligence + wisdom + witty + creativity;
    }

    public void comparison(Ravenclaw student) {
        if(this.sum() > student.sum()) {
            System.out.println(this.getName() + " лучший Когтевранец, чем "+ student.getName());
        } else {
            System.out.println(student.getName() + " лучший Когтевранец, чем "+ this.getName());
        }
    }
}
