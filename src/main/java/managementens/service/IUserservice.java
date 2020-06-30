package managementens.service;

import java.util.List;

import managementens.dto.Userdto;
import managementens.entity.UserEntity;



public interface IUserservice {
	Userdto save(Userdto userdto);
	List<Userdto> findAll();
	void delete(long id);
	UserEntity getUserById(Long id);

}
