package user.service.url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import user.service.user.User;
import user.service.user.UserRestRepository;

@RestController
public class UrlRestController {

	@Autowired
	UrlRestRepository repository;

	@Autowired
	UserRestRepository userRepository;

	@GetMapping("/createUrl/{user}/{url}")
	public void createUrl(@PathVariable("user") int idUser, @PathVariable("url") String url) {
		
		String type = "";
		
		if (url.contains("playlist")) {
			type = "music";
		}	else {
			type = "image";
		}

		User user = userRepository.findById(idUser);

		repository.save(new Url(user,url,type));
	}
	
	@GetMapping(value = "/urls/{user}/{type}")
	public Iterable<Url> searchUrls(@PathVariable("user") int id, @PathVariable("type") String type) {

		User user = userRepository.findById(id);
		Iterable<Url> urls = repository.findByUserIdType(user,type);
		return urls;

	}
	
	@GetMapping(value = "/removeUrl/{url}")
	public void removeUrls(@PathVariable("url") String url) {

		Url urls = repository.findByUrl(url);
		repository.delete(urls);

	}
	
	
	
}
