// Use cases of the Builder Design pattern

// There are many attributes of a class
// We have to create immutable objects
// We want to validate objects before creating them



// Overview
// 1. Create private variables and getters in Student class
// 2. Create a static Builder class with same parameters and getters and setters as well
// 3. Create a createBuilder and build method


public class Student {
    private String name;
    private int age;
    private double psp;
    private String instructorName;

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getPsp() {
        return this.psp;
    }
    public String getInstructorName() {
        return this.instructorName;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.instructorName = builder.getInstructorName();
        // Validate the Object Here
    }

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String instructorName;

        public Student build() {
            return new Student(this);
            // Validate the 'this' Object here
        }

        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }
        public double getPsp() {
            return this.psp;
        }
        public String getInstructorName() {
            return this.instructorName;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setInstructorName(String instructorName) {
            this.instructorName =  instructorName;
            return this;
        }
    }
}
