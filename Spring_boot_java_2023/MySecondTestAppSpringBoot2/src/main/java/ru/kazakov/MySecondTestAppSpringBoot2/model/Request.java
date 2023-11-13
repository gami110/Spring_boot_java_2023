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

    /***
     * Уникальный идентификатор сообщения
     */
    @NotBlank(message = "Поле uid не заполнено")
    @Size(min = 1, max=32, message = "Поле uid содержит некорректное количество вне диапазона от 1 до 32")
    private String uid;
    /***
     * Уникальный идентификатор операции
     */
    @NotBlank(message = "Поле operationalUid не заполнено")
    @Size(min = 1, max = 32, message = "Поле operationalUid содержит некорректное количество вне диапазона от 1 до 32")
    private String operationUid;
    /***
     * Уникальный Имя системы отправителя
     */
    private Systems systemName;
    /***
     * Время создания сообщения
     */
    @NotBlank(message = "Поле systemTime не заполнено")
    private String systemTime;
    /***
     * Наименование ресурса
     */
    private String source;
    /***
     * Наименование позиции(должности)
     */
    private Positions positions;
    /***
     * Размер заработной платы
     */
    private Double salary;
    /***
     * Бонуса
     */
    private Double bonus;
    /***
     * Число рабочих дней
     */
    private Integer workDays;
    /***
     * Уникальный идентификатор коммуникации
     */
    @Max(value = 100000, message = "Превышено максимальное значение поля communicationId равное 100000")
    @Min(value = 1, message = "Значение поля communicationId меньше минимального равного 1")
    private int communicationId;
    /***
     * Уникальный идентификатор шаблона
     */
    private int templateId;
    /***
     * Код продукта
     */
    private int productCode;
    /***
     * смс-код
     */
    private int smsCode;
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", templateId='" + templateId +
                ", productCode='" + productCode +
                ", smsCode='" + smsCode +
                '}';
    }
}
