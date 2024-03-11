package ra.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {
        String string = "Nguyên văn A"; // khởi tạo trực tiêp
        System.out.println(System.identityHashCode(string));
        ; // chưa thay doi chuỗi
        String old = string;
        string += " class L001";
        System.out.println(old);
        // in địa chỉ tham chiếu của old
        System.out.println(System.identityHashCode(old));
        ;

        System.out.println(string);
        // in ra sau khi thay đổi
        System.out.println(System.identityHashCode(string));
        ;
        String stringCopy = "Nguyên văn A";
        System.out.println(System.identityHashCode(stringCopy));
        String s1 = new String("Ra");
        String s2 = new String("Ra");
        String s3 = new String("Ra");
        String s4 = new String("Ra");
        String s5 = "Ra";
        // s1==s2 // sai
        // s1.equals(s5) // đúng
        System.out.println("rikkei".compareTo("rcademy"));

        // String Builder và Buffer
        StringBuilder stringBuilder = new StringBuilder("Nguyễn Văn A ");
        System.out.println(stringBuilder);
        System.out.println(System.identityHashCode(stringBuilder));
        // chèn vào cuối
        stringBuilder.append(20);
        System.out.println(System.identityHashCode(stringBuilder));

        System.out.println(stringBuilder);
        // chèn vị trí bất kì
        stringBuilder.insert(0, "Họ tên : ");
        System.out.println(stringBuilder);

        // xóa
        stringBuilder.delete(3, 5);
        System.out.println(stringBuilder);
        // đảo ngược
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        // nối các số từ 1 đến 10 lại và ngay cách bởi khoảng trắng
        StringBuilder stringNumber = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            stringNumber.append(" ").append(i);
        }
        System.out.println(stringNumber);


        // bắt đầu bằng 84 , có 9 kí tư số phía sau
        String regexPhone = "((^(\\+84|84|0|0084){1})(3|5|7|8|9))+([0-9]{8})$";

        // validate dữ liệu đầu vào
        String input1 = "+84948978675";
        String input2 = "7367646527";

        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher1 = pattern.matcher(input1);
        Matcher matcher2 = pattern.matcher(input2);
        System.out.println("Check 1 = " + matcher1.matches());
        System.out.println("Check 2 = " + matcher2.matches());

//        boolean check = Pattern.compile(regexPhone).matcher(input1).matches();
//        boolean check = Pattern.matches(regexPhone,input1);
        boolean check = input1.matches(regexPhone);

        // hiển thị với màu sắc trong màn console (sử dụng icon Window + .)
        System.out.println("\u001B[31mRed text");
        System.out.println("\u001B[32mGreen text ༼ つ ◕_◕ ༽つ");
        System.out.println("\u001B[33mYellow text");
        System.out.println("\u001B[34mBlue text");
        System.out.println("\u001B[35mPurple text");
        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️༼ つ ◕_◕ ༽つ");
        // bài tập
        // nhập vào chuỗi email đến khi nhập đúng định dạng ,
        // mỗi lân nhập sai thì in ra dòng lỗi đỏ và yêu cầu nhập lại
        // còn nhập đúng thì hiển thị email vừa nhập và dừng chuơng trinh
        String email;
        final String regexEmail = "[a-z0-9!#$%&\'*+/=?^_\'{|}~-]+(?:.[a-z0-9!#$%&\'*+/=?^_\'{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        while(true){
            // nhâp vao chuoi
            email = new Scanner(System.in).nextLine();
            if (email.matches(regexEmail)){
                break;
            }
            System.out.println("\u001B[31mEmail không đúng định dạng , hay nhập lại!\u001B[37m");
        }
        System.out.println("Email : "+email);
    }
}
