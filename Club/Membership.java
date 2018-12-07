package Club;

import java.util.Scanner;

/**
 * Created by Johnny on 07/12/2018
 * Defines a class to store details of the membership list
 */
public class Membership {
    Scanner keyboard = new Scanner(System.in);

    private String clubName;
    private int noOfMembers;
    private Member[] memberList;

    public Membership() {
    }

    public Membership(String theClubName, int theNoOfMembers) {
        int id;
        String name;

        clubName = theClubName;
        noOfMembers = theNoOfMembers;
        memberList = new Member[noOfMembers];

        //Output heading
        System.out.println("\n" + clubName);
        for (int count = 0; count < clubName.length(); count++) {
            System.out.print("=");
        }
        System.out.println();

        for (int count = 0; count < noOfMembers; count++) {
            System.out.print("Enter member id: ");
            id = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter member name: ");
            name = keyboard.nextLine();
            memberList[count] = new Member(id, name);
        }
    }

    public String toString() {
        String listOfMembers;
        listOfMembers = ("\n" + clubName.toUpperCase() + "\nmember ID\tName\n");
        for (int count = 0; count < noOfMembers; count++) {
            listOfMembers += memberList[count].toString();
        }
        return listOfMembers;
    }
}
