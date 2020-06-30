package managementens.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "post")
public class PostEntity extends BaseEntity {
	@Column
	private String namePost;
	@Column
	private String code;

	@OneToMany(mappedBy = "post")
	private List<UserEntity> users = new ArrayList<>();
	
	public String getNamePost() {
		return namePost;
	}

	public void setNamePost(String namePost) {
		this.namePost = namePost;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
