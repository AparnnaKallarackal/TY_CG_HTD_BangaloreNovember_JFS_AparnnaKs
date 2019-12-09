package set;

import java.util.HashSet;


public class HashSetDemo1 {
public static void main(String[] args) {
	
	HashSet<Student>hs=new HashSet<Student>();
	hs.add(new Student(100, "aparnna"));
	hs.add(new Student(200, "dhiyya"));
	hs.add(new Student(300, "sneha"));
	hs.add(new Student(400, "deepu"));
	hs.add(new Student(100, "aparnna"));
	
	 for (Student ob:hs)
	 {
		 System.out.println(ob.studId+" name is "+ob.studName);
	}
	
}
}
