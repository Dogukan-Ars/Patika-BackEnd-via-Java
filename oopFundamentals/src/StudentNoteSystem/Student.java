package StudentNoteSystem;

public class Student {
	String name;
	String sNo;
	String classes;
	Course c1;
	Course c2;
	Course c3;
	double average;
	boolean isPass;
	
	Student(String name, String sNo, String classes, Course c1, Course c2, Course c3){
		this.name = name;
		this.sNo = sNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0.0;
		this.isPass = false;
	}
	
	void addBulkExamNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;	
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}		
	}
	
	void addBulkVerbalNote(int vNote1, int vNote2, int vNote3) {
		if (vNote1 >= 0 && vNote1 <= 100) {
			this.c1.vNote = vNote1;	
		}
		if (vNote2 >= 0 && vNote2 <= 100) {
			this.c2.vNote = vNote2;
		}
		if (vNote3 >= 0 && vNote3 <= 100) {
			this.c3.vNote = vNote3;
		}
	}
	
	void isPass() {
		System.out.println("========================");
		this.average = ((0.8 * (this.c1.note + this.c2.note + this.c3.note)) + (0.2 * (this.c1.vNote + this.c2.vNote + this.c3.vNote))) / 3.0;
		if (this.average > 55) {
			System.out.println("You passed the course succesfully");
			this.isPass = true;
		}else {
			System.out.println("You FAILED!!!");
			this.isPass = false;
		}
		printNote();
	}
	
	void printNote() {
		System.out.println(c1.name + " Exam Note\t: " + c1.note + " Verbal Note\\t: " + c1.vNote);
		System.out.println(c2.name + " Exam Note\t: " + c2.note + " Verbal Note\\t: " + c2.vNote);
		System.out.println(c3.name + " Exam Note\t: " + c3.note + " Verbal Note\\t: " + c3.vNote);
		System.out.println("Your average grade : " + this.average);
	}
}
