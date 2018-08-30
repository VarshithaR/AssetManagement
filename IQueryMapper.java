package com.cg.asset.dao;

public interface IQueryMapper {
 public final static String LOGINQUERY="SELECT userid,userpassword,usertype from User_masters where userid=?  and userpassword=? and usertype=?";
 public final static String INSERTQUERY="INSERT into Asset values(genAssetID.nextval,?,?,?,?)";
 public final static String MODIFYQUERY="UPDATE Asset set assetname=?,assetdesc=?,quantity=?,status=? where assetid=?";
	
	
}


/*assetid number primary key,assetname varchar2(25),assetdesc varchar2(25),quantity number,status varchar2(15));*/
