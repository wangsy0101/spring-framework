package cn.debug.ioc1.dao;


public class UserMysqlDao implements UserDao {

    public void getUser(){
        System.out.println("Mysql获取用户对象");
    }
}
