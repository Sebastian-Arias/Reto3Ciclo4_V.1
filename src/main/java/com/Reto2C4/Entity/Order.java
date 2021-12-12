package com.Reto2C4.Entity;


import java.util.Date;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Home
 */
@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
        
public class Order {
    
    public static String PENDING = "Pendiente";
    public static String APROVED = "Aprobada";
    public static String REJECTED = "Rechazada";
    
    @Id
    private Integer id;
    private Date registerDay;
    private String status;
    private User salesMan;
    
    private Map<Integer, Laptop> products;
    private Map<Integer, Integer> quantities;

}
