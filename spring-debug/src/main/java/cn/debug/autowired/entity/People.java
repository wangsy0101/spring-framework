package cn.debug.autowired.entity;

import javax.annotation.Resource;


public class People {

    private String name;


    // 1、@Autowired + @Qualifier("dog1") = @Resource(name = "dog1")
    // 2、@Autowired 和 @Resource 都可以通过 name 和 type 两种方式自动注入
    // 3、@Autowired 是spring的注解，@Resource 是java 的注解



//    @Autowired
//    @Qualifier("dog1")

    @Resource(name = "dog1")
    private Dog dog;

//    @Autowired
//    @Qualifier("cat1")

    @Resource(name = "cat1")
    private Cat cat;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"dog\":")
                .append(dog);
        sb.append(",\"cat\":")
                .append(cat);
        sb.append('}');
        return sb.toString();
    }
}
