public class StuData {
	private int kor,eng,mat;
	private String name,id;

	public StuData(String id,String name, int kor, int eng, int mat){
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTotal() {
		return (kor+eng+mat);
	}
	public float getAvg() {
		float avg =kor+eng+mat/3.f;
		String str = String.format("%.2avg",avg);
		return avg;
	}
}
