import java.util.*;
public class UtilityList {
	 private List<Student> list;
	 public List<Student> getList(){
		 return list;
	 }
public UtilityList()
{
	list=new ArrayList<>();
	
}
	public void createList() {
		Student s=new Student();
		s.accept();
		list.add(s);
		
	}
	public void printList() {
		for(Student s:list) {
			s.display();
		}
	}
	

}
