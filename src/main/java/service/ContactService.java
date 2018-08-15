package service;
import dao.ContactDao;
import view.*;

public class ContactService {
     ContactDao contactDao=new ContactDao();

    public void insertContact(CantactDto cantactDto){

        ContactEntity contactEntity=new ContactEntity();
        contactEntity.setFirstname(cantactDto.getFirstname());
        contactEntity.setLastname(cantactDto.getLastname());
        contactEntity.setNumberList(cantactDto.getNumberList());

        contactDao.insertContact(contactEntity);
    }

}
