import java.util.*;

public class Student {
	private int rollno;
	private String name;
	private double per;
	private Set<String> skillset;
	public Student() {
		skillset=new LinkedHashSet<>();
		
		
	}
	public Student(int roolno, String name, double per, Set<String> skillset) {
		super();
		this.rollno = roolno;
		this.name = name;
		this.per = per;
		this.skillset = skillset;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no...");
		sc.nextInt();
		System.out.println("enter name...");
		sc.next();
		System.out.println("enter percentage...");
		sc.nextDouble();
		System.out.println("enter three skillset");
		skillset.add(sc.next());
		skillset.add(sc.next());
		skillset.add(sc.next());
		
	}
	public void display() {
		System.out.println(rollno+"  "+name+"  "+per+"  ");
		for(String s:skillset)
		{
			System.out.println(s+"   ");
		}
		System.out.println();
	}

}
