/**
 * This class is generated by jOOQ
 */
package moe.src.leyline.infrastructure.persistence.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product implements Serializable {

    private static final long serialVersionUID = 2018549294;

    private Integer id;
    private String  name;
    private Double  price;

    public Product() {}

    public Product(Product value) {
        this.id = value.id;
        this.name = value.name;
        this.price = value.price;
    }

    public Product(
        Integer id,
        String  name,
        Double  price
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public Product setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return this.price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(price);

        sb.append(")");
        return sb.toString();
    }
}