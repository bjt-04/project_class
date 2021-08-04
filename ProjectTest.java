public class ProjectTest {

    public static void main(String[] args) {


        Project project1 = new Project("First Project", "This is my first project!");
        // System.out.println(project1);
        // System.out.println(project1.elevatorPitch());
        project1.setName("Project Undercover Boss");
        project1.setDescription("No one will know it's me");
        System.out.println(project1.elevatorPitch());
        System.out.println(project1.getName());
    }
}