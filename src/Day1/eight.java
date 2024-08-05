package Day1;

class eight {

    int studentID;
    int age;
    String name;
    int grade;

    public eight(int studentID, int age, String name, int grade) {
        this.studentID = studentID;
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("StudentID: "+studentID);
        System.out.println("Grade: "+grade);
        System.out.println("Age: "+age);
        System.out.println("------------------------------\n");
    }
    public static void main(String[] args) {
        eight obj = new eight(1,20,"Adi",90);
        eight obj1 = new eight(2,21,"Adi1",80);
        eight obj2 = new eight(3,22,"Adi2",70);
        eight obj3 = new eight(4,23,"Adi3",60);
        obj.display();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

