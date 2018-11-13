package midtermexam;

public class Box5 {
	float length;
	float width;
	int height;
	public Box5(float length, float width, int height) {
		 this.length=length;
		 this.width=width;
		 this.height=height;
}
	public boolean validate(){
		boolean validate= length<=23&&width<=14&&height<=13;
		return validate;
	}
}
