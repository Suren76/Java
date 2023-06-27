package other.exam5;

import com.sun.jdi.IntegerValue;
import org.jetbrains.annotations.NotNull;

import java.util.*;


class UserToCompare extends User implements Comparable<UserToCompare>{
    static int count = 0;
    int currentNumber = getCount();
    public UserToCompare(int weight, String addr, String birthday) {
        super(weight, addr, birthday);
        count++;
    }

    @Override
    public int compareTo(UserToCompare userToCompare) {
        return Integer.compare(this.weight, userToCompare.weight)==0 ? this.compareBirthday(userToCompare): Integer.compare(this.weight, userToCompare.weight);
//        return this.compareBirthday(userToCompare);
    }

    private int compareBirthday(UserToCompare o){
        if (this.birthday("year")[0] == o.birthday("month")[0]){
            if (this.birthday("month")[0] == o.birthday("month")[0]){
                if (this.birthday("day")[0] == o.birthday("day")[0]){
                    return 0;
                }
                else {
                    return this.birthday("day")[0] < o.birthday("day")[0] ? 1: -1;
                }
            }
            else {
                return this.birthday("month")[0] < o.birthday("month")[0] ? 1: -1;
            }
        }
        else {
            return this.birthday("year")[0] < o.birthday("year")[0] ? 1: -1;
        }
    }

    private int[] birthday(String type){
        int[] splitBirthday = {Integer.parseInt(birthday.split("\\.")[0]), Integer.parseInt(birthday.split("\\.")[1]), Integer.parseInt(birthday.split("\\.")[2])};

        if (type.equals("day")){
            return new int[] {splitBirthday[0]};
        }
        if (type.equals("mouth")){
            return new int[] {splitBirthday[1]};
        }
        if (type.equals("year")){
            return new int[] {splitBirthday[2]};
        }

        return splitBirthday;
    }

    private int[] birthday(){
        return birthday("");
    }

    @Override
    public String toString() {
        return "{"+Integer.toString(weight) +","+ addr +","+ birthday + "}";
    }

    public int getCount() {
        return count;
    }
}

class MyMap extends TreeMap{

}

public class exercise5 {
    public static void main(String[] args) {
        Set<UserToCompare> list = new TreeSet<>();
        list.add(new UserToCompare(15,"","06.06.2005"));
        list.add(new UserToCompare(10,"a","06.06.2001"));
        list.add(new UserToCompare(1,"a","06.05.2005"));
        list.add(new UserToCompare(1,"a","06.05.2004"));
        list.add(new UserToCompare(1,"a","06.05.2009"));


        Map<UserToCompare,Integer> map = new TreeMap<>();
        for (UserToCompare item: list) {
            map.put(item, item.currentNumber);
        }

        System.out.println(map);
    }
}
