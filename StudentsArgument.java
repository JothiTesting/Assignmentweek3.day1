package Week3.day1;

public class StudentsArgument {


		
		public void getStudentInfo() {
			System.out.println("Student Details");

		}
		
		public void getStudentInfo(int studId) {
			System.out.println("Student Id: " +studId);
		}
		
		public void getStudentInfo(int studId, String name,String str) {
			System.out.println("Student Id: "+studId +", Student Name: "+name + "Email"+ str);
		}
	
		
		public static void main(String[] args) {
			StudentsArgument student = new  StudentsArgument(); 
			student .getStudentInfo();
			student .getStudentInfo(255);
			student.getStudentInfo(255,"Joy","jothipriys@gmail.com");
			
			


		}	
}
