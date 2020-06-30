package managementens.converter;

import org.springframework.stereotype.Component;

import managementens.dto.Userdto;
import managementens.entity.UserEntity;

@Component
public class UserConverter {
	public UserEntity toEntity(Userdto dto) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(dto.getFirstName());
		userEntity.setFullName(dto.getFullName());
		userEntity.setAddress(dto.getAddress());
		return userEntity;
	}

	
	public Userdto toDto(UserEntity entity) {
		Userdto userdto = new Userdto();
		if(entity.getId() !=null) {
			userdto.setId(entity.getId());
		}
		userdto.setFirstName(entity.getFirstName());
		userdto.setFullName(entity.getFullName());
		userdto.setAddress(entity.getAddress());
		return userdto;
	}
	
	public UserEntity toEntity(Userdto dto, UserEntity entity) {
		entity.setFirstName(dto.getFirstName());
		entity.setFullName(dto.getFullName());
		entity.setAddress(dto.getAddress());
		return entity;
	}
}
