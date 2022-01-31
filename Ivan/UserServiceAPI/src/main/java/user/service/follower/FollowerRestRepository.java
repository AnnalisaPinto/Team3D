package user.service.follower;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import user.service.user.User;


@RepositoryRestResource(collectionResourceRel="follower", path="follower")
public interface FollowerRestRepository extends CrudRepository<Follower, Integer>{
	
	Follower findById(int id);
	int countByUserId(int id);
	@Query(value ="SELECT follower.follower_id FROM `follower` WHERE follower.user_id = (?1)", nativeQuery = true)
	List<Integer> allFollower(int id);
	List<Follower> findAll(	);
	@Query(value = "Select * from follower where follower_id = (?1) and user_id = (?2)", nativeQuery = true)
	int findIdByFollowerUser(User follower, User user);
	
}