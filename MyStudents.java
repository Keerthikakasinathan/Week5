import java.util.*;
class Student implements Comparator<Student>{
	String studname;
	int stdid;
	double atd;
	int mark;
	Student(String studname,int stdid,double atd,int mark)
	{
		this.studname=studname;
		this.stdid=stdid;
		this.atd=atd;
		this.mark=mark;
	}
	Student(){}
	public int compare(Student s1,Student s2)
	{
		return s1.studname.compareTo(s2.studname);
	}
	public String toString()
	{
		return "Student name : "+studname+"\n"+"Student id : "+stdid+"\n"+"Student attendance percentage : "+atd+"\n"+"Student mark : "+mark;
	}
}
class MyStudents{
	public static void main(String...args){
		LinkedList<Student> l=new LinkedList<Student>();
	    Student s1=new Student("Abi",235,68.8,74);
	    Student s2=new Student("Preethi",679,45.3,76);
	    Student s3=new Student("Bala",567,87.7,80);
	   
	    l.add(s1);
	    l.add(s2);
	    l.add(s3);
	    
	    Collections.sort(l,new Student());
	    for(Student sort:l)
	    {
		   System.out.println(sort);
	    }
	}
}