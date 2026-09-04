public class Student {
    protected String name;
    protected int id;
    protected int marks;
    public Student(String name, int id, int marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getMarks(){
        return marks;
    }
}
