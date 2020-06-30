package managementens.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
	@Column(name = "firstname")
    private String firstName;
	
	@Column(name = "fullname")
    private String fullName;
	
	@Column(name = "phonenumber")
    private String phoneNumber;
	
	@Column(name = "address")
    private int address;
	
	@ManyToOne
    @JoinColumn(name = "post_id")
    private PostEntity post;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public PostEntity getPost() {
		return post;
	}
	public void setPost(PostEntity post) {
		this.post = post;
	}
	
	
	

}
