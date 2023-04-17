public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return this.iq;
    }
}
