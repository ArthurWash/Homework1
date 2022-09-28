public class JavaProgramming {
    public static void main(String[] args){
        
        // In Person Student
        Students student1Info = new InPersonStudents(2872, "John", "Inperson");
        System.out.println("Name: " + student1Info.name);
        System.out.println("ID: " + student1Info.id);
        System.out.println("Type: " + student1Info.type);
        student1Info.score();

        // Remote Student
        Students student2Info = new RemoteStudents(3245, "Jane", "Remote");
        System.out.println("Name: " + student2Info.name);
        System.out.println("ID: " + student2Info.id);
        System.out.println("Type: " + student2Info.type);
        student2Info.score();
    }
}
