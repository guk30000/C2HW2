public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public String description() {
        return super.description() + "Благородство " + nobility + ", честь " + honor + ", храбрость " + bravery;
    }

    public int sum() {
        return nobility + honor + bravery;
    }

    public void comparison(Gryffindor student) {
        if(this.sum() > student.sum()) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем "+ student.getName());
        } else {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем "+ this.getName());
        }
    }
}
