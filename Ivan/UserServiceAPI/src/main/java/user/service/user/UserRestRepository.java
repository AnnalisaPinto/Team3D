package user.service.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="user", path="user")
public interface UserRestRepository extends CrudRepository<User, Integer>{
		
	User findById(int id);
	User findByNickname(String nickname);
	@Query(value="SELECT nickname FROM user", nativeQuery = true)
	List<String> findAllNickname();
	List<User> findAll();	
	long countByNickname(String nickname);

}