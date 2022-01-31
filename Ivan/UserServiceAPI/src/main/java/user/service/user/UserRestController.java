package user.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@Autowired
	UserRestRepository repository;

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "user/nickname/{nickname}")
	public long NicknameCount(@PathVariable("nickname") String nickname) {
		long count = repository.countByNickname(nickname);
		return count;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "user/all")
	public Iterable<User> allUser() {
		Iterable<User> users = repository.findAll();
		return users;
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "user/nickname/all")
	public Iterable<String> allNickname() {
		Iterable<String> nicknames = repository.findAllNickname();
		return nicknames;
	}
	
	
	/**
	 * //@{svg/{id}(id=${svg.id})}
	 * 
	 * @GetMapping(value = "svg/category/{category}") public Iterable<Svg>
	 *                   categoryFilter(@PathVariable("category") String category) {
	 * 
	 *                   Iterable<Svg> svglist =
	 *                   repository.findByCategory(category);
	 * 
	 *                   return svglist; }
	 * 
	 * @GetMapping(value = "svg/id/{id}") public Svg idFilter(@PathVariable("id")
	 *                   int id) {
	 * 
	 *                   Svg svg = repository.findById(id);
	 * 
	 *                   return svg; }
	 * 
	 * @GetMapping(value = "svg/name/{name}") public Svg
	 *                   nameFilter(@PathVariable("name") String name) {
	 * 
	 *                   Svg svg = repository.findByName(name);
	 * 
	 *                   return svg; }
	 */

}