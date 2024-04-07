public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private int[] grades;

	public Student(String id, String firstName, String lastName, int age){
		if (id.length() == 9){
			this.id = id;
		}else {
			System.out.println("wrong id.");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		grades = new int[0];
	}

	public void addGrade(int grade){
		int[] temp = new int[this.grades.length +1];
		for (int i = 0; i < this.grades.length; i++) {
			temp[i] = grades[i];
		}
		temp[temp.length -1] = grade;
		grades = temp;
	}

	public int avgGrades(){
		int sum = 0;
		int countForAvg = numberOfGrades();
		for (int i = 0; i < grades.length ; i++) {
			sum += grades[i];
		}
		int avg = (sum/countForAvg);
		return avg;
	}

	public int numberOfGrades() {
		return grades.length;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
	public String toString(){
		return "ID: " + id + " Full name: " + firstName +" " + lastName + " age: " + age;
	}

}
