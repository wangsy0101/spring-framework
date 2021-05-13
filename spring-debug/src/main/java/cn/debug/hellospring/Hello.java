package cn.debug.hellospring;


public class Hello {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"str\":\"")
                .append(str).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
