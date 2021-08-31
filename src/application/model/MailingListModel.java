package application.model;

import java.util.*;

public class MailingListModel {

    boolean DEBUG = true;

    Map<String, Member> memberMap; //Mapping email adddress to Member Data Object
    //Map<String, ArrayList<Member>> groupMap2;    // Mapping GroupNames to List of Members???
    Map<String, ArrayList<String>> groupMap;  //Mapping GroupNames to List of MemberEmailAddress

    Map<String, Set<Message>> groupMessageMap;  //Mapping groupNames to a Set of emails

    public MailingListModel() {
        memberMap = new HashMap<>();
        groupMap = new HashMap<>();
        groupMessageMap = new HashMap<>();
        /* could load data from XML files here -- make sure to use try catch */
    }

    public boolean register(String emailAddress, String username, String password, String initialGroup) {
        if (DEBUG) System.out.println("register: email: " + emailAddress + ".....");
        //check email address is not already registered
        if (memberMap.containsKey(emailAddress)) {
            if (DEBUG) System.out.println("register false email already existed");
            return false;
        }
        //create a new member object -- need member constructor parameter details
        //add to memberMap     email address -> member Object
        HashSet groupSets = new HashSet<String>();
        groupSets.add(initialGroup);
        Member member = new Member(emailAddress, username, password, false, groupSets);
        memberMap.put(emailAddress, member);
        if (DEBUG) System.out.println("register return true");
        return true;
    }

   public boolean sendMessage(String sender, String title, String body, String group) {

        //check parameters are valid
        Message message = new Message(sender, title, dateTime, priority, recipient, body );   // new message object
        HashSet<String> groupEmails = (HashSet) groupMessageMap.get(group);   //get the set of emails for that group
        groupEmails.add(message.toString());

        return true;
    }
}
