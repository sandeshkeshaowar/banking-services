package org.ms.account.service.model.dto;

import lombok.Data;
import org.ms.account.service.model.AccountStatus;

@Data
public class AccountStatusUpdate {
    AccountStatus accountStatus;
}
