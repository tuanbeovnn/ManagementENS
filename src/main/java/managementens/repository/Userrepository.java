package managementens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import managementens.entity.UserEntity;


public interface Userrepository extends JpaRepository<UserEntity, Long>{
	
	void deleteById(long id);
	UserEntity findById(long id);
	
}
