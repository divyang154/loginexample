package mainapp.sportyshoesapp.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {



	@RequestMapping("/")
	public String getLogin() {
		return " Hello  login";
	}


}