package cn.debug.ioc2.entity;


public class UserT {

    private String name;


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
