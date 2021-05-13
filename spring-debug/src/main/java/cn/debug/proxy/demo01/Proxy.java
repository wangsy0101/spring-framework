package cn.debug.proxy.demo01;

/**
 *
 * 静态代理
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }


    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }


    public void seeHouse(){
        System.out.println("看房子~");
    }

    public void hetong(){
        System.out.println("签合同~");
    }

    public void fare(){
        System.out.println("收中介费~");
    }


}
