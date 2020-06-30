package managementens.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import managementens.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
	PostEntity findByCode(String code);
}
