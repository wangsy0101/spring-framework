package cn.debug.proxy.demo02;

/**
 *
 * 静态代理
 */
public class UserServiceProxy implements UserService {



    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }


    public void log(String message){
        System.out.println("调用了 " + message+ " 方法");
    }
}
