package com.cg.asset.service;

import com.cg.asset.bean.UserAuthenBean;
import com.cg.asset.dao.AuthenticateUserDao;

public class AuthenticateUserService implements IAuthenticateUserService {
    AuthenticateUserDao user1=new AuthenticateUserDao();


	public int authenticateUser(String user, String password, int option) {
		// TODO Auto-generated method stub
		return user1.authenticateUser(user,password,option);
	}

	/*@Override
	public int addAsset(int assetId) {
		return user1.addAsset(assetId);
	}
*/
}
