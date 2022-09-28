import java.util.Scanner;

public class InPersonStudents extends Students {
    private double midterm;
    private double finals;
    private double assignments;

    // Using Parent Constructor to create in person student profile
    public InPersonStudents(int Id, String Name, String Type){
        super(Id, Name, Type);
    }

    // Accessor
    public String getName(){
        return name;
    }

    // Mutator
    public void setName(String name){
        this.name = name;
    }

    // Computes the student's score via the superclass' method score()
    public void score(){
        double weightedScore;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the midterm score: ");
        midterm = scan.nextDouble();
        System.out.print("Next, please enter the finals score: ");
        finals = scan.nextDouble();
        System.out.print("Last but not least, please enter the assignments score: ");
        assignments = scan.nextDouble();

        weightedScore = (midterm * .30) + (finals * .30) + (assignments * .40);

        // Results
        System.out.println("Midterm - " + midterm);
        System.out.println("Finals - " + finals);
        System.out.println("Assignments - " + assignments);
        System.out.println("The weighted score for " + name + ": " + weightedScore);
        System.out.println("--------------------------------------------------------");
    }
}
