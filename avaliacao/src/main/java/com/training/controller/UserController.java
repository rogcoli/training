package com.training.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.entity.User;
import com.training.service.UserService;
import com.training.transform.UserTransform;
import com.training.vo.UserVO;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	private static final String REDIRECT = "redirect:";

	private static final String USER_PATH = "user";

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public String insert(UserVO userVo, Model model) {
		
		userService.insertOrUpdate(userVo);
		return REDIRECT + USER_PATH;
	}



	@RequestMapping(method = RequestMethod.GET)
	public String list(@RequestParam(value = "id", required = false, defaultValue = "") Long id, Model model) {

		List<User> users;

		if (id != null) {
			users = Arrays.asList(userService.retrieve(id));
		} else {
			users = userService.list();
		}

		UserVO userVO = new UserVO();

		model.addAttribute("users", users);
		model.addAttribute("userVo", userVO);

		return USER_PATH;
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public String delete(Long id, Model model) {

		userService.delete(id);

		return REDIRECT + USER_PATH;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String update(@RequestParam(value = "id", required = false, defaultValue = "") Long id, Model model) {

		User user = userService.retrieve(id);

		UserVO userVO = new UserTransform(user).transform();

		model.addAttribute("users", userService.list());
		model.addAttribute("userVo", userVO);

		return USER_PATH;
	}

}
