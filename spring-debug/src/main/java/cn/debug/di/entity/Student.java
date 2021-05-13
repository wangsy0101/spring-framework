package cn.debug.di.entity;

import java.util.*;


public class Student {

    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private List<Address> addressList;
    private Map<String, String> cards;
    private Set<String> game;
    private String wife;
    private Properties info;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public Set<String> getGame() {
        return game;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }


    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\n");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append("\n");
        sb.append(",\"address\":")
                .append(address);
        sb.append("\n");
        sb.append(",\"books\":")
                .append(Arrays.toString(books));
        sb.append("\n");
        sb.append(",\"hobbys\":")
                .append(hobbys);
        sb.append("\n");
        sb.append(",\"addressList\":")
                .append(addressList);
        sb.append("\n");
        sb.append(",\"cards\":")
                .append(cards);
        sb.append("\n");
        sb.append(",\"game\":")
                .append(game);
        sb.append("\n");
        sb.append(",\"wife\":\"")
                .append(wife).append('\"');
        sb.append("\n");
        sb.append(",\"info\":")
                .append(info);
        sb.append("\n");
        sb.append('}');
        return sb.toString();
    }
}
