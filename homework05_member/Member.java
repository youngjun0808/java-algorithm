package homework05_member;

public class Member {
	private String id, pw, name, ssn, blood;
	private String height, weight;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("회원정보\n"
				+ "아이디 : %s \n"
				+ "비번: %s \n"
				+ "이름 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 : %s \n"
				+ "", id, pw, name, ssn, blood);
	}

}
