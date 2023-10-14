package Week_1;

	public class Student {
		public String name ;
		public int birthYear=2003;
		public Student(String o, int b) {
			name = o;
			birthYear = b;
			}
		public int getAge() {
			return 2023-birthYear;
		}
		public void setBirthYear (int by) {
			if(birthYear > 1990) {
			birthYear = by;
			}
		}
		public void getName() {
			System.out.println("Tên học sinh: "+this.name);
		}
		public void setName(String s) {
			if(s.contains(".")	|| s.startsWith("a")){
				return;
		}
			this.name = s;
			System.out.println(this.name);
		}
		public static void main(String[] args) {
			Student std1 = new Student("Vũ Minh Hoàng",2003);
			std1.getName();
		}
}

