package midtermexam;

public class Box3 {
	float length;
	float width;
	int height;
	public Box3(float length, float width, int height) {
		 this.length=length;
		 this.width=width;
		 this.height=height;
	 }
	public boolean validate(){
		boolean validate= length<=39.5&&width<=27.5&&height<=23;
		return validate;
	}
}
