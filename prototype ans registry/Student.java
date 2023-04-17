public class Student implements Clone<Student>{
    private String name;
    private int age;

    // Common attributes
    private String batch;
    private int avg;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBatch() {
        return this.batch;
    }

    public int getAvg() {
        return this.avg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public Student() {}

    public Student(Student originalStudent) {
        this.name = originalStudent.name;
        this.age = originalStudent.age;
        this.batch = originalStudent.batch;
        this.avg = originalStudent.avg;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
