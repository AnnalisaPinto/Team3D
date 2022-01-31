package user.service.follower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import user.service.user.User;
import user.service.user.UserRestRepository;

@RestController
public class FollowerRestController {

	@Autowired
	UserRestRepository userRepository;

	@Autowired
	FollowerRestRepository repository;

	@GetMapping("/createFollower/{user}/{follower}")
	public void createFollower(@PathVariable("user") int idUser, @PathVariable("follower") int idFollower) {

		User user = userRepository.findById(idUser);
		User follower = userRepository.findById(idFollower);

		repository.save(new Follower(user, follower));
	}

	@GetMapping(value = "/follower/{user}")
	public Iterable<Integer> searchFollower(@PathVariable("user") int id) {

		Iterable<Integer> users = repository.allFollower(id);
		return users;

	}

	@GetMapping(value = "/countFollower/{user}")
	public int countFollower(@PathVariable("user") int id) {

		int users = repository.countByUserId(id);
		return users;

	}

	@GetMapping(value = "/removeFollower/{follower}/{followed}")
	public void removeFollower(@PathVariable("follower") int idFollower , @PathVariable("followed") int idFollowed) {

		User follower = userRepository.findById(idFollower);
		User followed = userRepository.findById(idFollowed);

		int id = repository.findIdByFollowerUser(follower, followed);
		Follower toDelete = repository.findById(id);
		repository.delete(toDelete);

	}

}