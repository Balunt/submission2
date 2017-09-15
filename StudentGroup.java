import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
private student index[] student;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	return student[];
	}

	@Override
	public void setStudents(Student[] students) {
		return set student[];
	}

	@Override
	public Student getStudent(int index) {
		return getStudent();
	}

	@Override
	public void setStudent(Student student, int index) {
		system.out.println("student data");
	}

	@Override
	public void addFirst(Student student) {
		add(Student[] student);
	}

	@Override
	public void addLast(Student student) {
		add(Student[] lastStudent);
	}

	@Override
	public void add(Student student, int index) {
		add(Student[] student);
		add(int index[]);
		return 0;
	}

	@Override
	public void remove(int index) {
		remove(int index[]);
 		return 0;
	}

	@Override
	public void remove(Student student) {
		remove(Student[] student);
		return null;
	}

	@Override
	public void removeFromIndex(int index) {
		remove(int index[];
		return 0;
	}

	@Override
	public void removeFromElement(Student student) {
		student[]=student[]--;
	}

	@Override
	public void removeToIndex(int index) {
		delete student[i];
	}

	@Override
	public void removeToElement(Student student) {
		delete(student[i]);
	}

	@Override
	public void bubbleSort() {
		student[] == student[] + 1;
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		
		return null;
	}
}
