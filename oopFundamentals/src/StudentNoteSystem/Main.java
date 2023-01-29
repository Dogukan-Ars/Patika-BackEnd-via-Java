package StudentNoteSystem;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Eric", "Hist", "111");
		Teacher t2 = new Teacher("Charles", "Phys", "222");
		Teacher t3 = new Teacher("Brooke", "Math", "333");
		
		Course history = new Course("History", "101", "Hist");
		history.addTeacher(t1);
		
		Course physic = new Course("Physic", "201", "Phys");
		physic.addTeacher(t2);
		Course math = new Course("Mathematic", "301", "Math");
		math.addTeacher(t3);
		
		Student s1 = new Student("Adam", "123", "3", history, physic, math);
		s1.addBulkExamNote(47, 29, 50);
		s1.addBulkVerbalNote(80, 90, 80);
		s1.isPass();
		
		Student s2 = new Student("Betty", "234", "5", history, physic, math);
		s2.addBulkExamNote(87, 92, 53);
		s2.addBulkVerbalNote(90, 80, 80);
		s2.isPass();
	}

}
