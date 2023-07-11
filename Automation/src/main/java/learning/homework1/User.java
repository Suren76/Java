package learning.homework1;


public class User implements Comparable<User>{
    private String email;
    private String name;
    private String gender;
    private String birthday;
    private String address;
    private String uname;
    private String pwd;
    private String phoneNumber;

    public User(String email, String name, String gender, String birthday, String address, String uname, String pwd, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.uname = uname;
        this.pwd = pwd;
        this.phoneNumber = phoneNumber;
    }

    public User(User user) {

        this.email = user.email;
        this.name = user.name;
        this.gender = user.gender;
        this.birthday = user.birthday;
        this.address = user.address;
        this.uname = user.uname;
        this.pwd = user.pwd;
        this.phoneNumber = user.phoneNumber;

//        new User(user.email,user.name,user.gender,user.birthday,user.address,user.uname,user.pwd,user.phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        return this.equals((User) obj);
    }

    public boolean equals(User user) {
        if (this == user) return true;
        return uname.equals(user.uname);
    }

    @Override
    public int compareTo(User o) {
        return uname.compareTo(o.uname);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.equals(this.email)?this.email:email ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.equals(this.name)?this.name:name ;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.equals(this.gender)?this.gender:gender ;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday.equals(this.birthday)?this.birthday:birthday ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.equals(this.address)?this.address:address ;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname.equals(this.uname)?this.uname:uname ;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd.equals(this.pwd)?this.pwd:pwd ;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.equals(this.phoneNumber)?this.phoneNumber:phoneNumber ;
    }

}
