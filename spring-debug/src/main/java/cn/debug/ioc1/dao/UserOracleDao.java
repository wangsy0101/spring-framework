package cn.debug.ioc1.dao;


public class UserOracleDao implements UserDao {

    public void getUser(){
        System.out.println("Oracle获取用户对象");
    }
}
