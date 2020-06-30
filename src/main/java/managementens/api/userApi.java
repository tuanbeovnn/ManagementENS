package managementens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import managementens.dto.Userdto;
import managementens.entity.UserEntity;
import managementens.service.IUserservice;
import managementens.service.impl.UserService;



@CrossOrigin
@RestController
public class userApi {
	
	@Autowired
	private IUserservice userservice;
	
	@Autowired
	private UserService service;
	
	@PostMapping(value="/users")
	public Userdto createProduct(@RequestBody Userdto model) {
		return userservice.save(model);
	}

	@PutMapping(value="/users/{id}")
	public Userdto updateuser(@RequestBody Userdto model, @PathVariable("id") long id) {
		model.setId(id);
		return userservice.save(model);
	}
	@DeleteMapping(value="/users/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		service.delete(id);
		
	}
	
	@GetMapping(value = "/users")
	public List<Userdto> showListProduct() {
		 
		return userservice.findAll() ;
	}
	@GetMapping(value = "/users/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable("id") Long id) {
		UserEntity userEntity = userservice.getUserById(id);
		return new ResponseEntity<UserEntity>(userEntity,HttpStatus.OK ) ;
	}
}
