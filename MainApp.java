package basic.dev;
/**
 * 
 * @author Asus
 *
 */
public class MainApp {

	public static void main(String[] args) {
		String firstName = "Truong Vinh";
		String lastName = "huy";
		String ID = "2160162";
		String CMND = "192078901";
		String Class = "21CDTH41";
		String School = "Cao dang cong nghiep hue";
		String Locate = "Phu dien phu vang thua thien hue";
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
		System.out.println("thong tin mot sinh vien:");
		System.out.println(firstName + " "+ lastName);
		System.out.println("Mark Math: "+ markMath);
		System.out.println("Ma sinh vien: "+ ID);
		System.out.println("Chung minh nhan dan: "+ CMND);
		System.out.println("lop: "+ Class);
		System.out.println("truong: " + School);
		System.out.println("diem trung binh: "+ diemtrungbinh);
		
		
        //*thông tin công nhân
	    System.out.println("");
		System.out.println("thong tin cong nhan:");
		System.out.println("Ten: "+ lastName);
		System.out.println("dia chi: "+ Locate);
		System.out.println("so dien thoai: "+ SDT);
		System.out.println("he so luong: "+ hesoluong);
		
		
		//* thông tin một chiếc xe car
		System.out.println("Ten: "+ lastName);
		System.out.println("hang: "+ hang );
		System.out.println("gia: "+ Buy+"$");
		System.out.println("mau: "+ Color);		
	}

}
