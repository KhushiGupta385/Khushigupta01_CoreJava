class CourseStudent {
    // Private variables (Encapsulation)
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    // Getter to calculate final payable fee
    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100);
    }
}

public class OnlineCourse_EnrollmentSystem {
    public static void main(String[] args) {
        // Creating object
        CourseStudent student = new CourseStudent();

        // Assigning values using setters
        student.setStudentName("Khushi gupta");
        student.setCourseName("Java Programming");
        student.setCourseFee(10000);
        student.setDiscountPercent(20);

        // Displaying details using getters
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Course Name  : " + student.getCourseName());
        System.out.println("Final Fee    : " + student.getFinalFee());
    }
}