package com.training.transform;

import com.training.entity.Appraisee;
import com.training.entity.Appraiser;
import com.training.entity.User;
import com.training.vo.UserVO;

public class UserTransform {

	private User user;

	public UserTransform(User user) {
		this.user = user;
	}

	public UserVO transform() {

		UserVO userVo = new UserVO();

		if (user != null) {

			userVo.setId(user.getId());
			userVo.setName(user.getName());
			userVo.setEmail(user.getEmail());

			if (user instanceof Appraisee) {
				userVo.setSelectedUserType(((Appraisee) user).getUserType());
			} else {
				userVo.setSelectedUserType(((Appraiser) user).getUserType());
			}

		}
		return userVo;
	}
	
	public User transform(UserVO userVo) {

		if (userVo != null) {
			
//			if (!user.getUserType().equals(userVo.getSelectedUserType())) {
//				user = new Appraisee();
//			}
			
			user.setId(userVo.getId());
			user.setName(userVo.getName());
			user.setEmail(userVo.getEmail());
		}
		
		return user;
	}

}
