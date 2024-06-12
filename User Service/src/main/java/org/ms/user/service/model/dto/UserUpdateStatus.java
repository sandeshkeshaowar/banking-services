package org.ms.user.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ms.user.service.model.Status;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserUpdateStatus {

    private Status status;
}
