// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Nhập thông tin sinh viên:");
        student.InputInfo();
        System.out.println("\nThông tin sinh viên:");
        student.DisplayInfo();

        // Tạo và sử dụng đối tượng GiaoVien
        GiaoVien teacher = new GiaoVien();
        System.out.println("\nNhập thông tin giáo viên:");
        teacher.InputInfo();
        System.out.println("\nThông tin giáo viên:");
        teacher.DisplayInfo();
    }
    }
