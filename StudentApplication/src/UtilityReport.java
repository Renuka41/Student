import java.util.*;

public class UtilityReport {
	private Map<String,Double> m;
	public UtilityReport(List<Student> list)
	
	{
		m=new HashMap<>();
		for(Student s:list)
		{
			m.put(s.getName(), s.getPer());
		}
		
	}
	public void showReport()
	{
		
		System.out.println(m);
	}
}
