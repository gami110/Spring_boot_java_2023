package ru.kazakov.MySecondTestAppSpringBoot2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    /***
     * Уникальный идентификатор сообщения
     */
    private String uid;
    /***
     * Уникальный идентификатор операции
     */
    private String operationUid;
    /***
     * Уникальный Имя системы отправителя
     */
    private String systemTime;
    /***
     * смс-код
     */
    private Codes code;
    /***
     * Размер бонуса
     */
    private Double annualBonus;
    /***
     * Код ошибки
     */
    private ErrorCodes errorCode;
    /***
     * Сообщение ошибки
     */
    private ErrorMessages errorMessage;
}
