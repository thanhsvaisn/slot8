import java.util.ArrayList;
import java.util.Scanner;
public class GiaoVien extends PerSon{
    private ArrayList<String> ClassList;
    private double salary;
    private int SoMonGiangDay;

    private ArrayList<String> CacMonGiangDay;

    public GiaoVien() {
        ClassList = new ArrayList<>();
        CacMonGiangDay = new ArrayList<>();
    }
    public GiaoVien(String name, String gender, String dateOfBirth, String address) {
        super(name, gender, dateOfBirth, address);
        ClassList = new ArrayList<>();
        CacMonGiangDay = new ArrayList<>();
    }
    @Override
    public void InputInfo() {
        super.InputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mức lương: ");
        salary = scanner.nextDouble();
        System.out.print("Nhập số môn giảng dạy: ");
        SoMonGiangDay = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line
        for (int i = 0; i < SoMonGiangDay; i++) {
            System.out.print("Nhập môn giảng dạy thứ " + (i + 1) + ": ");
            String mon = scanner.nextLine();
            CacMonGiangDay.add(mon);
        }
    }
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Mức lương: " + salary);
        System.out.println("Số môn giảng dạy: " + SoMonGiangDay);
        System.out.println("Danh sách các môn giảng dạy:");
        for (String mon : CacMonGiangDay) {
            System.out.println("- " + mon);
        }
    }

}
