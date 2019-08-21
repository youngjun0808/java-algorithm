package study05;

public class Member {
	private String name, id, password, birth, blood;
	private double height, weight;
	private int kor;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.password = pw;
	}
	public String getPw() {
		return this.password;
	}
	
	public void setSsn(String ssn) {
		this.birth = ssn;
	}
	public String getSsn() {
		return this.birth;
	}
	
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("회원정보: \n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "주민번호 : %"
				+ "혈액형 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f \n",
				name, id, password, birth, blood, height, weight);
	}
}
