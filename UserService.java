package com.cg.asset.service;

import com.cg.asset.dao.IUserDAO;
import com.cg.asset.dao.UserDAO;

public class UserService implements IUserService {
    IUserDAO user1=new UserDAO();
	@Override
	public int raiseAsset(int assetId,int quantity) {
	
		return user1.raiseAsset(assetId, quantity);
	}

	@Override
	public int checkAsset() {
		// TODO Auto-generated method stub
		return 0;
	}

}
