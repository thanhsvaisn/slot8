import java.util.Scanner;

public class Student extends PerSon {
    private String MaSV;
    private double point;
    private String Email;
    public Student() {
    }

    public Student(String Name, String Gender, String Birthday, String Address, String maSV, double point, String Email) {
        super(Name, Gender, Birthday, Address);
        this.MaSV = maSV;
        this.point = point;
        this.Email = Email;
    }
    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public void InputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.InputInfo();
        System.out.println("Nhập mã sinh viên: ");
        this.MaSV = scanner.nextLine();
        System.out.println("Nhập điểm thi: ");
        this.point = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau nextDouble()
        System.out.println("Nhập Email: ");
        this.Email = scanner.nextLine();
    }

    @Override public void DisplayInfo(){
        System.out.println("Your Student Code : " + MaSV);
        System.out.println("Your Point : " + point);
        System.out.println("Your Email : " + Email);
    }
    public void CheckPoint(){
    if(point > 8){

        System.out.println("Bạn nhận được học bổng");
    }
    else
        System.out.println("Bạn không nhận được học bổng");
    }
}
