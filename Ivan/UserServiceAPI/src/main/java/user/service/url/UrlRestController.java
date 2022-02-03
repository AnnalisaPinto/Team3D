package user.service.url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import user.service.user.User;
import user.service.user.UserRestRepository;

@RestController
public class UrlRestController {

	@Autowired
	UrlRestRepository repository;

	@Autowired
	UserRestRepository userRepository;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/createUrl")
	public void createUrl(@RequestParam("user") int idUser, @RequestParam("url") String url) {
		
		String type = "";
		
		if (url.contains("Playlist")) {
			type = "music";
		}	else {
			type = "image";
		}
		
		User user = userRepository.findById(idUser);
		
		repository.save(new Url(user,url,type));
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/urls/{user}/{type}")
	public Iterable<Url> searchUrls(@PathVariable("user") int id, @PathVariable("type") String type) {

		User user = userRepository.findById(id);
		Iterable<Url> urls = repository.findByUserIdType(user,type);
		return urls;

	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/removeUrl")
	public void removeUrls(@RequestParam("url") String url) {

		Url toDelete = repository.findByUrl(url);
		repository.deleteById(toDelete.getId());

	}
	
	
	
}
