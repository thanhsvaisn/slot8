import java.util.Scanner;
public abstract class PerSon {
        private String Name;
        private String Gender;
        private String Birthday;
        private String Address;
        public PerSon(){
            Name = "Quang";
            Gender = "Nam";
            Birthday = "19/12/2000";
            Address = "Ha Noi";
        }
        public PerSon(String Name ,String Gender,String Birthday,String Address){
            this.Name = Name;
            this.Gender = Gender;
            this.Birthday = Birthday;
            this.Address = Address;
        }

    public void setName(String name) {
            Name = name;
        }
        public String getName() {
            return Name;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public String getGender() {
            return Gender;
        }

        public void setBirthOfDate(String birthday) {
            Birthday = birthday;
        }

        public String getBirthOfDate() {
            return Birthday;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getAddress() {
            return Address;
        }
        public void InputInfo(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Name");
            this.Name = scanner.nextLine();
            System.out.println("Enter Your Gender");
            this.Gender = scanner.nextLine();
            System.out.println("Enter Your Birthday");
            this.Birthday = scanner.nextLine();
            System.out.println("Enter Your Address");
            this.Address = scanner.nextLine();

        }
        public void DisplayInfo(){
            System.out.println("Your Name : " + Name);
            System.out.println("Your Gender : " + Gender);
            System.out.println("Your Birthday : " + Birthday);
            System.out.println("Your Address : " + Address);
        }
}
