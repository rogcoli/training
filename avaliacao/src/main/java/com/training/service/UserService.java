package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.UserDAO;
import com.training.entity.Appraisee;
import com.training.entity.Appraiser;
import com.training.entity.User;
import com.training.transform.UserTransform;
import com.training.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDao;

	public User insertOrUpdate(UserVO userVo) {

		User user;

		if (userVo.getId() != null) {
			user = updateUser(userVo);
		} else {
			user = createNewUser(userVo);
		}

		return userDao.save(user);
	}

	public User updateUser(UserVO userVo) {
		
		User userToSave = null;
		
		User userFromDb = userDao.findOne(userVo.getId());
		
		if (!userFromDb.getUserType().equals(userVo.getSelectedUserType())) {
			
			if (userVo.getSelectedUserType().equals(new Appraisee().getUserType())) {
				
				userToSave =  new Appraisee(userVo.getId(), userVo.getName(), userVo.getEmail());
			
			} else {
				userToSave =  new Appraiser(userVo.getId(), userVo.getName(), userVo.getEmail());
			}
			
			userDao.delete(userFromDb);
			userDao.flush();
			
		} else {
			
			userToSave = new UserTransform(userFromDb).transform(userVo);
		}
		return userToSave;
	}

	private User createNewUser(UserVO userVo) {
		User user;
		if (userVo.getSelectedUserType().equals(new Appraisee().getUserType())) {
			user = new Appraisee(userVo.getName(), userVo.getEmail());

		} else {

			user = new Appraiser(userVo.getName(), userVo.getEmail());
		}
		return user;
	}

	public User retrieve(Long id) {
		return userDao.findOne(id);
	}

	public List<User> list() {
		return userDao.findAll();
	}

	public void delete(Long id) {
		userDao.delete(id);
	}

}
