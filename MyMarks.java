
public class MyMarks {
	int english = 97;
	int physics = 95;
	int chemistry = 93;
	int maths = 98;
	int biology = 92;
	float totalMarks = english + physics + chemistry + maths + biology;
	float percentage = (float)(totalMarks/500)*100;
	int a = (int)totalMarks-100;
	int b = physics*4;
	float cutoff = (physics/2) + (chemistry/2) + maths;
	public static void main(String args[]) {
		MyMarks obj = new MyMarks();
		System.out.println(obj.totalMarks);
		System.out.println(obj.percentage);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.cutoff);
		}
}
