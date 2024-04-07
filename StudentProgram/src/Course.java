public class Course {
	private String nameOfCourse;
	private Student[] students;
	private int courses;

	public Course(String nameOfCourse){
		this.nameOfCourse = nameOfCourse;
		students = new Student[0];
		courses++;
	}
	public int getCourses() {
		return courses;
	}
	public void addStudentToTheCourse(Student student){
		boolean studentExists = false;
		for (int i = 0; i < students.length; i++) {
			if (this.students[i].getId().equals(student.getId())){
				studentExists = true;
				break;
			}
		}
		if (student.getAge() <= 19 || student.numberOfGrades() < 2){
			studentExists = true;
		}

		if (!studentExists) {
		Student[] temp = new Student[students.length +1];
		for (int i = 0; i < students.length; i++) {
			temp[i] = students[i];
		}
			temp[temp.length - 1] = student;
			this.students = temp;
		}
	}
	public Student[] gradeIsHigherThanAverage(Student[] students){
		int countGradeIsHigherThenAvg = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].avgGrades() > classAverage()){
				countGradeIsHigherThenAvg++;
			}
		}
		Student[] temp = new Student[countGradeIsHigherThenAvg];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].avgGrades() > classAverage()){
				temp[index] = students[i];
				index++;
			}
		}
		return temp;
	}
	public int classAverage(){
		int classAvg = 0;
		int sumForAvg = 0;
		for (int i = 0; i < students.length ; i++) {
			sumForAvg += students[i].avgGrades();
		}
		classAvg = (sumForAvg/numberOfStudent());

		return classAvg;
	}

	public int gradePointAverageGradePointAverageClass(){
		int lengthClassAvg = 0;
		int sumForAvgClass = 0;
		int gradeAvgGradAvgClass = 0;
		for (int i = 0; i < getCourses(); i++) {
			sumForAvgClass += classAverage();
				lengthClassAvg++;
			}
		gradeAvgGradAvgClass = (sumForAvgClass/lengthClassAvg);
		return gradeAvgGradAvgClass;
	}
	public int numberOfStudent(){
		return students.length;
	}


	public String toString(){
		return getClass().getSimpleName() + "---> " + this.nameOfCourse;
	}


}

