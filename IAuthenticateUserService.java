package com.cg.asset.service;

import com.cg.asset.bean.UserAuthenBean;

public interface IAuthenticateUserService {
	
	//public int authenticateUser(UserAuthen user);

	public int authenticateUser(String user, String password, int option);
    //public int addAsset(int assetId);
}
