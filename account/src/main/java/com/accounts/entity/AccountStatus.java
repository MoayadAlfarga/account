package com.accounts.entity;

import com.accounts.enums.AccountStatusEnums;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_status")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountStatus extends Audiate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status")
    private AccountStatusEnums status;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}




