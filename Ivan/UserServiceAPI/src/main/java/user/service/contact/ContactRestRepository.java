package user.service.contact;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import user.service.user.User;

@RepositoryRestResource(collectionResourceRel="contact", path="contact")
public interface ContactRestRepository extends CrudRepository<Contact, Integer>{
		
	List<Contact> findAll();
	Contact findById(int id);
	@Query(value = "Select id from contact where asker_user_id = (?1) and asked_user_id = (?2)", nativeQuery = true)
	int findIdByAskerAsked(User asker, User asked);
	List<Contact> findAllByAskerId(int id);
	

}