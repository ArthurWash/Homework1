abstract public class Students {
    protected int id;
    protected String name;
    protected String type;

    // Constructor: Sets up a Student's profile
    public Students(int Id, String Name, String Type){
        this.id = Id;
        this.name = Name;
        this.type = Type;
    }

    // Returns a string with a Student's information
    public String toString(){
        String result = "Name: " + name + "\n";

        result += "ID: " + id + "\n";
        result += "Type: " + type;

        return result;
    }

    // Score method
    public abstract void score();

}
