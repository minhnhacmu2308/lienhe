package com.example.lienhespring.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "lienhe")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LienHe {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hoten")
    public String hoTen;

    @Column(name = "email")
    public String email;

    @Column(name = "phonenumber")
    public String phoneNumber;

    @Column(name = "noidung")
    public String noiDung;
}
