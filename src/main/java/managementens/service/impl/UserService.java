package managementens.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import managementens.converter.UserConverter;
import managementens.dto.Userdto;
import managementens.entity.PostEntity;
import managementens.entity.UserEntity;
import managementens.repository.PostRepository;
import managementens.repository.Userrepository;
import managementens.service.IUserservice;

@Service
public class UserService implements IUserservice {
	
	@Autowired
	private Userrepository userrepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserConverter userConverter;
	
	@Override
	public Userdto save(Userdto userdto) {
		UserEntity userEntity = new UserEntity();
		if(userdto.getId()!=null) {
			UserEntity oldUserEntity = userrepository.findOne(userdto.getId());
			userEntity = userConverter.toEntity(userdto,oldUserEntity);
		}else {
			userEntity = userConverter.toEntity(userdto);
		}
		
		PostEntity postEntity = postRepository.findByCode(userdto.getPostCode());
		userEntity.setPost(postEntity);
		userEntity = userrepository.save(userEntity);
		return userConverter.toDto(userEntity);
	}
	
	@Override
	public List<Userdto> findAll() {
		List<Userdto> results = new ArrayList<>();
		List<UserEntity> entities = userrepository.findAll();
		for( UserEntity item : entities) {
			Userdto userdto = userConverter.toDto(item);
			results.add(userdto);
		}
		return results;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		userrepository.delete(id);
		
	}

	@Override
	public UserEntity getUserById(Long id) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userrepository.findById(id);
		return userEntity;
	}

}
