public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        students = new Student[cap];
    }

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    public void print() {
        for(Student s:students)
        {s.print();}
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students=students;
    }

    public int getAvg() {
        
        return avg;
    }

    public void calculateAvg() {
        avg=0;
        int count=0;
        for(Student s:students)
        {avg+=s.getGrade();
        count++;
        }
        avg=avg/count;
        
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day=day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}
