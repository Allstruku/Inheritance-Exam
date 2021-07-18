package inheritanceExam;
// Using inheritance, one class can use the methods and fields within another class. Child class uses from Parent class
// to do so, use extends keyword (public class childclassname extends parentclassname)
// however, parent class cannot use methods and fields from child class
public class inheritanceChild extends inheritanceParent{
	public String run2(String main) {
		return main + "Child method run-확장";
	}
	public static void main(String[] args) {
		inheritanceChild i1 = new inheritanceChild();
		i1.run();
		System.out.println(i1.run2("I am making the "));
	}
}
