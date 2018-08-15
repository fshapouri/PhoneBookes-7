package view;

import service.ContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactUI {

    Scanner input= new Scanner(System.in);
    CantactDto contactDto=new CantactDto();
    ContactService contactService=new ContactService();
    NumberUI numberUI=new NumberUI();

    public List<CantactDto> insertContact(){

        List<CantactDto> contactList = new ArrayList<CantactDto>();
        System.out.print("How many contact do you want add to list?");
        int count= input.nextInt();

        for (int i=1; i<=count ; i++){
            System.out.println("cotact" +i+ ":");
            System.out.print("Enter FirstName please:");
            String firstname=input.next();
            System.out.print("Enter LastName please:");
            String lastname= input.next();

            contactDto.setFirstname(firstname);
            contactDto.setLastname(lastname);
            contactDto.setNumberList(numberUI.insertNumber());
            contactService.insertContact(contactDto);

            contactList.add(new CantactDto(firstname,lastname,numberUI.insertNumber()));
        }
         return contactList;
    }
}
