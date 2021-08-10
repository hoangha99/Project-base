package com.example.Oauth2.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id", nullable = false)
    private Long roleId ;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "role",targetEntity = UserRole.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<UserRole> userRoles;
}
