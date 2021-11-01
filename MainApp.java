package basic.dev;
/**
 * 
 * @author Asus
 *
 */
public class MainApp {

	public static void main(String[] args) {
		String firstName = "Trương vĩnh";
		String lastName = "Huy";
		String ID = "2160162";
		String CMND = "192078901";
		String Class = "21CDTH41";
		String School = "HueIC";
		String Locate = "Phú diên phú vang thừa thiên huế";
		String SDT = "0704534811";
		String hang = "Mercedes-Benz";
		String Color = "Trang";
		int Buy = 999999999;
		int hesoluong = 123;
		int diemtrungbinh = 8;
		int old = 18;
		float markMath = 9f;
		boolean passed = true;
		
		
		//* thông tin một sinh viên
		System.out.println("Thông tin một sinh viên:");
		System.out.println(firstName + " "+ lastName);
		system.out.println("tuổi: " + old);
		System.out.println("Mark Math: "+ markMath);
		System.out.println("Mã sinh viên: "+ ID);
		System.out.println("Chứng minh nhân dân: "+ CMND);
		System.out.println("Lớp: "+ Class);
		System.out.println("Trường: " + School);
		System.out.println("Điểm trung bình: "+ diemtrungbinh);
		
		
                //*thông tin công nhân
	        System.out.println("");
		System.out.println("Thông Tin Công Nhân:");
		System.out.println("Tên: "+ lastName);
		System.out.println("Địa Chỉ: "+ Locate);
		System.out.println("Số Điện Thoại: "+ SDT);
		System.out.println("Hệ số Lượng: "+ hesoluong);
		
		
		//* thông tin một chiếc xe car
		System.out.println("Tên: "+ lastName);
		System.out.println("Hãng: "+ hang );
		System.out.println("Giá: "+ Buy+"$");
		System.out.println("Màu: "+ Color);		
	}

}
