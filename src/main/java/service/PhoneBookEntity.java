package service;


import view.CantactDto;
import java.util.List;

public class PhoneBookEntity {

    private String phonebookName;
    private List<CantactDto> contactList;

    public PhoneBookEntity() {}

    public List<CantactDto> getContactList() {
        return contactList;}

    public void setContactList(List<CantactDto> contactList) {
        this.contactList = contactList;
    }

    public String getPhonebookName() {
        return phonebookName;
    }

    public void setPhonebookName(String phonebookName) {
        this.phonebookName = phonebookName;
    }

}
