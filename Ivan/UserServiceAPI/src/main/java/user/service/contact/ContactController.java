package user.service.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import user.service.user.UserRestRepository;

@Controller
public class ContactController {

	@Autowired
	UserRestRepository userRepository;

	@Autowired
	ContactRepository repository;
	
	@GetMapping("/tester")
	public String test() {
		
		return "autoCreateContact";
		
	}

	/*
	 * 
	@GetMapping("/createContact/{asker}/{asked}")
	public void createContact(@PathVariable("asker") int idAsker, @PathVariable("asked") int idAsked) {

		User asker = userRepository.findById(idAsker);
		User asked = userRepository.findById(idAsked);

		repository.save(new Contact(asker, asked, 0));
	}

	@GetMapping("/acceptContact/{asked}/{asker}")
	public void acceptContact(@PathVariable("asked") int idAsked, @PathVariable("asker") int idAsker) {

		User asked = userRepository.findById(idAsked);
		User asker = userRepository.findById(idAsker);

		repository.save(new Contact(asked, asker, 1));
		
		int id = repository.findIdByAskerAsked(asker, asked);
		
		Contact toUpdate = repository.findById(id);
		toUpdate.setStatus(1);
		repository.save(toUpdate);
		
	}
	
	 */
}