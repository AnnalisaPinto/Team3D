package user.service.contact;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import user.service.user.User;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer>{
	
	
	Contact findById(int id);
	@Query(value = "Select id from contact where asker_user_id = (?1) and asked_user_id = (?2)", nativeQuery = true)
	int findIdByAskerAsked(User asker, User asked);
	
	
}