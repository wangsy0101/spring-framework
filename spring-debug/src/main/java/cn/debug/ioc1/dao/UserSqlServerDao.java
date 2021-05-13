package cn.debug.ioc1.dao;


public class UserSqlServerDao implements UserDao {

    public void getUser(){
        System.out.println("SqlServer获取用户对象");
    }
}
