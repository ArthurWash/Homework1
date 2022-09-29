import java.util.Scanner;

public class RemoteStudents extends Students {
    // Constructor: Using parent constructor to create remote student profile
    public RemoteStudents(int Id, String Name, String Type){
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
        System.out.print("Next, please enter the assignments score: ");
        assignments = scan.nextDouble();
        System.out.print("Last but not least, please enter the discussions score: ");
        discussions = scan.nextDouble();
        scan.close();
        
        weightedScore = (midterm * .30) + (finals * .30) + (assignments * .30) + (discussions * .10);

        // Results
        System.out.println("Midterm - " + midterm);
        System.out.println("Finals - " + finals);
        System.out.println("Assignments - " + assignments);
        System.out.println("Discussion - " + discussions);
        System.out.println("The weighted score for " + name + ": " + weightedScore);
    }
}
