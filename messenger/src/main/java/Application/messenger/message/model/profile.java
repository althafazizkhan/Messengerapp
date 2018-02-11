package Application.messenger.message.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class profile {
	

	private long id;
	private String profileName;
	private String firstName;
	private Date created;
	
	public profile() {
		
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public profile(long id, String profileName, String firstName, String lastName) {
		
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String lastName;
	

}
