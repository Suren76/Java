package other.exam5;

public class User {
    protected int weight;
    protected String addr;
    protected String birthday;

    public User(int weight, String addr, String birthday) {
        this.weight = weight;
        this.addr = addr;
        this.birthday = birthday;
    }

    public boolean equals(User compareObj) {
        return (weight == compareObj.weight) && (addr.equals(compareObj.addr)) && (birthday.equals(compareObj.birthday));
    }
}
