package ru.kazakov.MySecondTestAppSpringBoot2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @NotBlank(message = "Uid is required")
    @Size(max=32, message = "Uid cannot exceed 32 characters")
    private String uid;

    @NotBlank(message = "OperationUid is required")
    @Size(max = 32, message = "OperationUid cannot exceed 32 characters")
    private String operationUid;

    private String systemName;

    //@NotBlank(message = "SystemTime is required")
    private String systemTime;

    private String source;

    @Min(value = 1, message = "CommunicationId must be at least 1")
    @Max(value = 100000, message = "CommunicationId cannot exceed 100000")
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;
}
