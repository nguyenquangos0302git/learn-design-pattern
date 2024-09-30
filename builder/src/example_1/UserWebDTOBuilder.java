package example_1;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder{

    private String fname;
    private String lname;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = ageInYears.getYears() + " years";
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.toString();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(this.fname + " " + this.lname, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
