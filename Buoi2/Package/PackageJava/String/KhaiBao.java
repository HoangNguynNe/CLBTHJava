package Package.PackageJava.String;


public class KhaiBao { // Nhớ thay tên class

    public static void main(String[] args) {
        String a = new String(); // Khai báo String
        var b = new String("CLBTH"); // Khai báo string nhưng đã gán sẵn
        // String b = "CLBTH";
        char c[] ={ 'C', 'L', 'B', 'T', 'H' }; //Khai báo char với từng ký tự
	String d = new String(c); // Khai báo string = char c
	String e = new String(c,0,2); // Lấy 2 ký tự của char c bắt đầu từ ký tự số 0 lấy 2 ký tự 0,1
        
        // Các lệnh in ra phù hợp
        System.out.print(a + "\n" + b + "\n");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        System.out.print("\n");
        System.out.print(d + "\n" + e + "\n");
        
    }
}

