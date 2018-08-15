package view;

import service.PhoneBookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookUI {
    Scanner input = new Scanner(System.in);
    PhoneBookDto pbDto = new PhoneBookDto();
    PhoneBookService pbService =new PhoneBookService();
    ContactUI contactUI=new ContactUI();

    public void insertPhoneBook(){

        System.out.print("please Enter name of your phonebook:");
        String phoneBookName=input.next();

        List<CantactDto> contactList = contactUI.insertContact();
        pbDto.setPhonebookName(phoneBookName);
        pbDto.setcontactList(contactList);
        pbService.insertPhoneBook(pbDto);

    }

}
