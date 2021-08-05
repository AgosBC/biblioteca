package ar.com.api.biblioteca.entities;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    private String name;
    
    @Column(name = "card_number")
    private BigInteger cardNumber;

    private String address;

    @Column(name = "phone_number")
    private String phone;

    private String email;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
