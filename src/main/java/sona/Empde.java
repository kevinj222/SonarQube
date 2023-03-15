package sona;

public class Empde
{
	String empname;
	int age;
	int year;
	double salary;
	public Empde(String empname, int age, int year, float salary) {
		super();
		this.empname = empname;
		this.age = age;
		this.year = year;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	@Override
	public String toString() {
		return "empname=" + empname + ", age=" + age + ", year=" + year + ", salary=" + salary ;
	}
}
	