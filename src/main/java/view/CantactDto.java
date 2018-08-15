package view;


import java.util.ArrayList;
import java.util.List;

public class CantactDto {
    private String firstname;
    private String lastname;
    private List<NumberDto> numberList;

    public CantactDto(String firstname, String lastname, List<NumberDto> numberDtos) {
        this.firstname = this.firstname;
        this.lastname = this.lastname;
        this.numberList = numberList;
    }

    public CantactDto() {}

    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public List<NumberDto> getNumberList() {return numberList;}

    public void setNumberList(List<NumberDto> numberList) {
        this.numberList = numberList;
    }

}
