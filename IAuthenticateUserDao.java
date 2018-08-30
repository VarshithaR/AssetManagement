package com.cg.asset.dao;

import com.cg.asset.bean.UserAuthenBean;

public interface IAuthenticateUserDao {
	public int authenticateUser(String user,String password,int option);
    //public int addAsset(int assetid);
	

}
