package com.app.ecom.dto;

import com.app.ecom.enums.UserRole;
import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private UserRole role = UserRole.CUSTOMER;
    private AddressDto address;
}
