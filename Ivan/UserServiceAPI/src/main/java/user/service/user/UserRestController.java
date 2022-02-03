package user.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	//Aggiunte il 31/01/22
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping("/verificaLogin")
    public User postBody(@RequestBody String parametriInsieme) {
	 	String[] splittata = parametriInsieme.split("&");
	 	String nickname = splittata[0].substring(splittata[0].indexOf("=") + 1);
	 	String password = splittata[1].substring(splittata[1].indexOf("=") + 1);
	
	 	User u = null;
	 	u = repository.verifyLogin(nickname, password);
       
	 	return u;
    }

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "user/id/one")
	public User getUser(@RequestParam(value = "id_utente", required = true) int id) {
		User u = repository.findById(id);
		return u;
	}



}