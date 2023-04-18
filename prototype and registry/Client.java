public class Client {
    public static void main(String[] args) {
        // Create an object with some common attrs and some not common
        // Get the object with common attrs from registry
        Student student_apr22 = new Student();
        student_apr22.setBatch("Apr 2022");
        student_apr22.setAvg(35);  // This will be queried to DB in real world

        Registry registry = Registry.getInstance();
        registry.register("Apr_22", student_apr22);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("Mar 2022");
        intelligentStudent.setAvg(90);

        registry.register("Mar_22", intelligentStudent);

        // Create copies of Apr 22 batch students

        Student s1 = registry.get("Apr_22").clone();
        s1.setName("Prasanna");
        s1.setAge(21);

        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getBatch() + " " + s1.getAvg());

        Student s2 = registry.get("Mar_22");
        s2.setName("Pushkar");
        s2.setAge(19);
        IntelligentStudent intelligents2 = (IntelligentStudent) s2;
        intelligents2.setIq(201);

        System.out.println(intelligents2.getName() + " "
                + intelligents2.getAge() + " "
                + intelligents2.getBatch() + " "
                + intelligents2.getAvg() + " "
                + intelligents2.getIq()
        );
    }
}
