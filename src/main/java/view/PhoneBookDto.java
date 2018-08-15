package view;

import java.util.List;

public class PhoneBookDto {
    private String phonebookName;
    private List<CantactDto> contactList;

    public PhoneBookDto(String phonebookName, List<CantactDto> contactList) {
        this.phonebookName = phonebookName;
        this.contactList = contactList;
    }

    public PhoneBookDto() {}

    public String getPhonebookName() {
        return phonebookName;
    }

    public void setPhonebookName(String phonebookName) {
        this.phonebookName = phonebookName;
    }

    public List<CantactDto> getcontactList() {
        return contactList;
    }

    public void setcontactList(List<CantactDto> contactList) {
        this.contactList = contactList;
    }







}
