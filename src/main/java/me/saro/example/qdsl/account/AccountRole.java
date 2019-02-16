package me.saro.example.qdsl.account;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.saro.example.qdsl.account.AccountRole.Key;

@Entity(name = "account_role")
@Table(name = "account_role")
@IdClass(Key.class)
@Data
public class AccountRole {

    @Id
    @Column(name = "no", nullable = false)
    long no;

    @Id
    @Column(name = "role", nullable = false, length = 64, unique = true)
    String role;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Key implements Serializable {
        private static final long serialVersionUID = 1L;
        long no;
        String role;
    }
}
