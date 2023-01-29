package StudentNoteSystem;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;	
	int vNote;
	int note;
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
	}
	
	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		}else {
			System.out.println("Teacher and Branch names don't match!!");
		}
		
	}
	
	void printTeacher() {
		this.teacher.print();
	}
}
