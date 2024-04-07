public class Program {
	public static void main(String[] args) {
		Course[] courses = {
				new Course("Computer science 1"),
				new Course("Discrete Mathematics"),
				new Course("Calculus"),
				new Course("Linear mathematics"),
				new Course("Object-oriented")
		};
		Student[] students = {
				new Student("206234332", "Yakov", "BH", 28),
				new Student("123212322", "adir", "rr", 22),
				new Student("123234212", "mike", "ee", 29),
				new Student("123323422", "liat", "ww", 32),
				new Student("456674322", "yohai", "Bqq", 23),
				new Student("545312344", "yohav", "dd", 21),
				new Student("543423532", "daniel", "dd", 25),
				new Student("234674532", "ido", "xx", 22),
				new Student("545454567", "amit", "aa", 23),
				new Student("123478433", "itay", "zz", 20),
				new Student("888876556", "shaked", "qq", 23),
		};


		students[0].addGrade(100);
		students[0].addGrade(100);
		students[0].addGrade(100);
		students[0].addGrade(100);
		students[0].addGrade(100);

		students[1].addGrade(62);
		students[1].addGrade(56);

		students[2].addGrade(100);
		students[2].addGrade(99);

		students[3].addGrade(15);
		students[3].addGrade(56);
		students[3].addGrade(67);

		students[4].addGrade(34);
		students[4].addGrade(23);

		students[5].addGrade(89);
		students[5].addGrade(67);

		students[6].addGrade(67);
		students[6].addGrade(56);

		students[7].addGrade(40);
		students[7].addGrade(30);

		students[8].addGrade(100);
		students[8].addGrade(89);

		students[9].addGrade(87);
		students[9].addGrade(45);

		students[10].addGrade(67);
		students[10].addGrade(90);


		courses[0].addStudentToTheCourse(students[0]);
		courses[0].addStudentToTheCourse(students[1]);
		courses[0].addStudentToTheCourse(students[10]);
		courses[0].addStudentToTheCourse(students[3]);
		courses[0].addStudentToTheCourse(students[4]);
		courses[0].addStudentToTheCourse(students[2]);

		courses[1].addStudentToTheCourse(students[0]);
		courses[1].addStudentToTheCourse(students[1]);
		courses[1].addStudentToTheCourse(students[2]);
		courses[1].addStudentToTheCourse(students[3]);


		courses[2].addStudentToTheCourse(students[0]);
		courses[2].addStudentToTheCourse(students[4]);
		courses[2].addStudentToTheCourse(students[5]);

		courses[3].addStudentToTheCourse(students[0]);
		courses[3].addStudentToTheCourse(students[6]);
		courses[3].addStudentToTheCourse(students[7]);

		courses[4].addStudentToTheCourse(students[0]);
		courses[4].addStudentToTheCourse(students[8]);
		courses[4].addStudentToTheCourse(students[9]);


		int highestAvg = theHighestAvgAmongAllCourses(courses);
		System.out.println("The average grade among all courses is: " + highestAvg);
		System.out.println();

		Course course = courseWithTheMostStudents(courses);
		System.out.println("The course with the most students: " + course);
		System.out.println();


		Student[] students1 = courses[0].gradeIsHigherThanAverage(students);
		System.out.println("The student with Grade higher than class avg |" + course.classAverage() + "| is ---> ");
		for (int i = 0; i < students1.length; i++) {
			System.out.println(students1[i]);
		}

		System.out.println(course.gradePointAverageGradePointAverageClass());


	}

	public static int theHighestAvgAmongAllCourses(Course[] courses) {
		int highestAvgAmongAllCourses = 0;
		int currentAvg = 0;
		int currentCourse = 0;
		for (int i = 0; i < courses.length; i++) {
			 currentAvg = courses[i].classAverage();
			if (currentAvg > highestAvgAmongAllCourses) {
				highestAvgAmongAllCourses = currentAvg;
				currentCourse = i;
			}
		}
		System.out.println(courses[currentCourse]);
		return highestAvgAmongAllCourses;
	}
	public static Course courseWithTheMostStudents(Course[] courses){
		int indexWithMostStudent = 0;
		int currentMostStudent = 0;
		int mostStudent = 0;
		for (int i = 0; i < courses.length; i++) {
			currentMostStudent = courses[i].numberOfStudent();
			if (currentMostStudent > mostStudent){
				mostStudent = currentMostStudent;
				indexWithMostStudent = i;
			}
		}
		return courses[indexWithMostStudent];
	}
}
