package user.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
import user.service.avatar.Avatar;
import user.service.avatar.AvatarRepository;
*/

@Controller
public class UserController {

	@Autowired
	UserRestRepository repository;

	
	@GetMapping("user/registration")
	public String registration(Model model) {
	
		/*
		Iterable<Avatar> avatars = avatarRepository.findAll();
		model.addAttribute("avatars", avatars);
		*/
		
		return "registrationForm";
	}
	
	
	@GetMapping("/confirm")
	public String confirmRegistration (
			@RequestParam(value = "nickname", required = true) String nickname,
	        @RequestParam(value = "password", required = true) String password,
	        @RequestParam(value = "email", required = true) String email,
	        @RequestParam(value = "avatar", required = true) Integer avatar, Model model) { 
		
		repository.save(new User(nickname,password,email, avatar));
		
		return "confirmRegistration";
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