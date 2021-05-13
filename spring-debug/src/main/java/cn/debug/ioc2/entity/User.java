package cn.debug.ioc2.entity;


public class User {


    private String name;


//    public User (String name){
//        System.out.println("user的无参构造方法被调用了");
//    }

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println("name: " + name);
    }
}
