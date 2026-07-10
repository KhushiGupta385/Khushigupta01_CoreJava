
class StudentResult {
    // Private variables (Encapsulation)
    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    // Calculate total marks
    public int getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    // Calculate average
    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    // Calculate grade
    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class SchoolResult_System {
    public static void main(String[] args) {

        // Object creation
        StudentResult student = new StudentResult();

        // Setting values
        student.setStudentName("Khushi");
        student.setMathMarks(85);
        student.setScienceMarks(90);
        student.setEnglishMarks(80);

        // Display result
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Average: " + student.getAverage());
        System.out.println("Grade: " + student.getGrade());
    }
}