package application.model;

import java.util.Set;

public class Group {
    private String groupName;
    private Set<Member> groupOfMembers;
    private Set<Message> groupMessages;

    public Group(String groupName, Set<Member> groupOfMembers, Set<Message> groupMessages) {
        this.groupName = groupName;
        this.groupOfMembers = groupOfMembers;
        this.groupMessages = groupMessages;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<Member> getGroupOfMembers() {
        return groupOfMembers;
    }

    public void setGroupOfMembers(Set<Member> groupOfMembers) {
        this.groupOfMembers = groupOfMembers;
    }

    public Set<Message> getGroupMessages() {
        return groupMessages;
    }

    public void setGroupMessages(Set<Message> groupMessages) {
        this.groupMessages = groupMessages;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", groupOfMembers=" + groupOfMembers +
                ", groupMessages=" + groupMessages +
                '}';
    }
}
