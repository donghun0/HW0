import java.util.*;

class Student {
	private int stuID;
	private String phoneNo;
	
	public Student(int stuID, String phoneNo) {
		this.stuID = stuID;
		this.phoneNo = phoneNo;
	}
	
	public int getStuID() {
		return this.stuID;
	}
	
	public String getPhoneNo() {
		return this.phoneNo;
	}
}

public class HashMapStuEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생이름과 Student 객체를 pair로 저장하는 HashMap Collection 생성
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
		// 3명의 학생 저장
		studentMap.put("서서울", new Student(1, "010-1111-1111"));
		studentMap.put("김과학", new Student(2, "010-2222-2222"));
		studentMap.put("이기슬", new Student(3, "010-3333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름?");
			String name = scanner.nextLine();		// 사용자로부터 이름 입력
			if(name.equalsIgnoreCase("exit")) break;
			Student stu = studentMap.get(name);
			if (stu == null) {
				System.out.println("name " + "not found");
			} else {
				System.out.println("id: " + stu.getStuID() + ", phone: " + stu.getPhoneNo());
			}
		}
		
		scanner.close();
	}
}
