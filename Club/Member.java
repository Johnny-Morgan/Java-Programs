package Club;

/**
 * Created by Johnny on 07/12/2018
 * Program to define an individual Member Class
 */
public class Member {
    private int memberNumber;
    private String memberName;

    public Member() {
    }

    public Member(int memberNumber, String memberName) {
        this.memberNumber = memberNumber;
        this.memberName = memberName;
    }

    public String toString() {
        return (memberNumber + "\t\t" + memberName + "\n");
    }
}
