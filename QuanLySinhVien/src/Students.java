public class Students {
    // Các thuộc tính của sinh viên
    private String studentId;
    private String fullName;
    private String dateOfBirth;
    private double gpa;

    // Hàm khởi tạo (Constructor)
    public Students(String studentId, String fullName, int age) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    // Phương thức hiển thị thông tin
    public void displayStudentInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Ngày sinh: " + dateOfBirth); 
        System.out.println("Điểm GPA: " + gpa);
    }
}