package studentDetails;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class student {
	

	public String name;
	public int id;
	public String course;
	
	public student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public student(String name, int id, String course) {

		this.name = name;
		this.id = id;
		this.course = course;
	}
	
	

	
}
