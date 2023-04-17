
public class Client {
    public static void main(String[] args) {
        Student s = Student.createBuilder()
                .setName("Prasanna")
                .setAge(23)
                .setPsp(9.32)
                .setInstructorName("Naman")
                .build();

        System.out.println(s.getName() + " " + s.getAge() + " " + s.getPsp() + " " + s.getInstructorName());
    }
}
