package com.ProductProo.entities;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by amino on 20/11/2017
 */

@Entity
public class Product_product {

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ean13;
    private Date create_date;
    private String default_code;
    private String name_template;
    private int create_uid;
    private Date message_last_post;
    @NotNull
    private int product_tmpl_id;
    private Byte image_variant;
    private int write_uid;
    private Date write_date;
    private boolean active;

    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public Product_product(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getDefault_code() {
        return default_code;
    }

    public void setDefault_code(String default_code) {
        this.default_code = default_code;
    }

    public String getName_template() {
        return name_template;
    }

    public void setName_template(String name_template) {
        this.name_template = name_template;
    }

    public int getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(int create_uid) {
        this.create_uid = create_uid;
    }

    public Date getMessage_last_post() {
        return message_last_post;
    }

    public void setMessage_last_post(Date message_last_post) {
        this.message_last_post = message_last_post;
    }

    public int getProduct_tmpl_id() {
        return product_tmpl_id;
    }

    public void setProduct_tmpl_id(int product_tmpl_id) {
        this.product_tmpl_id = product_tmpl_id;
    }

    public Byte getImage_variant() {
        return image_variant;
    }

    public void setImage_variant(Byte image_variant) {
        this.image_variant = image_variant;
    }

    public int getWrite_uid() {
        return write_uid;
    }

    public void setWrite_uid(int write_uid) {
        this.write_uid = write_uid;
    }

    public Date getWrite_date() {
        return write_date;
    }

    public void setWrite_date(Date write_date) {
        this.write_date = write_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Product_product{" +
                "id=" + id +
                ", ean13='" + ean13 + '\'' +
                ", create_date=" + create_date +
                ", default_code='" + default_code + '\'' +
                ", name_template='" + name_template + '\'' +
                ", create_uid=" + create_uid +
                ", message_last_post=" + message_last_post +
                ", product_tmpl_id=" + product_tmpl_id +
                ", image_variant=" + image_variant +
                ", write_uid=" + write_uid +
                ", write_date=" + write_date +
                ", active=" + active +
                '}';
    }

    //--END METHODES
}