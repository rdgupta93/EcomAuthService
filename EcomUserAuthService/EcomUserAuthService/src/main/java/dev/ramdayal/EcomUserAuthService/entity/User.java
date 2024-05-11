package dev.ramdayal.EcomUserAuthService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ECOM_USER")
public class User extends BaseModel{
    private String name;
    private String emailId;
    private String password;// Wont store actual password
    @ManyToMany
    private List<Role> roles;
}
