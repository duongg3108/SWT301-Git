public class Students {
    // Các thuộc tính của sinh viên
    private String studentId;
    private String fullName;
    private int age;

    // Hàm khởi tạo (Constructor)
    public Students(String studentId, String fullName, int age) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
    }

    // Phương thức hiển thị thông tin
    public void displayStudentInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }
}