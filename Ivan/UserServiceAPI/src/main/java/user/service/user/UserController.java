package user.service.user;

import java.util.LinkedList;

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
		
		LinkedList<AvatarDto> avatars = new LinkedList<>();
		for (int i = 1; i < 17; i++) {
			avatars.add(new AvatarDto(i, "/icons/"+i+".png"));
		}
		model.addAttribute("avatars", avatars);
		return "registrationForm";
	}
	
	
	@GetMapping("/confirm")
	public String confirmRegistration (
			@RequestParam(value = "nickname", required = true) String nickname,
	        @RequestParam(value = "password", required = true) String password,
	        @RequestParam(value = "email", required = true) String email,
	        @RequestParam(value = "avatar", required = true) Integer avatar, Model model) { 
		
		repository.save(new User(nickname,password,email, 0));
		
		return "confirmRegistration";
	}

}