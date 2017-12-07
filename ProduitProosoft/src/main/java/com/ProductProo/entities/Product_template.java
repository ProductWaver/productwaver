package com.ProductProo.entities;

import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by amino on 26/11/2017
 */

@Entity
public class Product_template {

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double warranty;
    private Long uos_id;
    private double list_price;
    private double weight;
    private Long color;
    private byte image;
    private Long write_uid;
    private String mes_type;
    private Long uom_id;
    private String description_purchase;
    private Date create_date;
    private double uos_coeff;
    private Long create_uid;
    @Column(nullable = true)
    private boolean sale_oke;
    private Long categ_id;
    private Long product_manager;
    private Date message_last_post;
    private Long company_id;
    private String state;
    private Long uom_po_id;
    private String description_sale;
    private String description;
    private double weight_net;
    private double volume;
    private Date write_date;
    private boolean active;
    private boolean rental;
    private byte image_medium;
    private String name;
    private String type;
    private byte image_small;
    private boolean track_all;
    private boolean track_outgoing;
    private String loc_rack;
    private String loc_case;
    private boolean track_incoming;
    private String loc_row;
    private double sale_delay;
    private boolean track_production;
    private  double produce_delay;
    @Column(nullable = true)
    private boolean purchase_oke;
    private String lock_rack;
    private String lock_row;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public Product_template(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public String getLoc_rack() {
        return loc_rack;
    }

    public void setLoc_rack(String loc_rack) {
        this.loc_rack = loc_rack;
    }

    public String getLoc_row() {
        return loc_row;
    }

    public void setLoc_row(String loc_row) {
        this.loc_row = loc_row;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWarranty() {
        return warranty;
    }

    public void setWarranty(double warranty) {
        this.warranty = warranty;
    }

    public Long getUos_id() {
        return uos_id;
    }

    public void setUos_id(Long uos_id) {
        this.uos_id = uos_id;
    }

    public double getList_price() {
        return list_price;
    }

    public void setList_price(double list_price) {
        this.list_price = list_price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Long getColor() {
        return color;
    }

    public void setColor(Long color) {
        this.color = color;
    }

    public byte getImage() {
        return image;
    }

    public void setImage(byte image) {
        this.image = image;
    }

    public Long getWrite_uid() {
        return write_uid;
    }

    public void setWrite_uid(Long write_uid) {
        this.write_uid = write_uid;
    }

    public String getMes_type() {
        return mes_type;
    }

    public void setMes_type(String mes_type) {
        this.mes_type = mes_type;
    }

    public Long getUom_id() {
        return uom_id;
    }

    public void setUom_id(Long uom_id) {
        this.uom_id = uom_id;
    }

    public String getDescription_purchase() {
        return description_purchase;
    }

    public void setDescription_purchase(String description_purchase) {
        this.description_purchase = description_purchase;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public double getUos_coeff() {
        return uos_coeff;
    }

    public void setUos_coeff(double uos_coeff) {
        this.uos_coeff = uos_coeff;
    }

    public Long getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(Long create_uid) {
        this.create_uid = create_uid;
    }

    public boolean isSale_oke() {
        return sale_oke;
    }

    public void setSale_oke(boolean sale_oke) {
        this.sale_oke = sale_oke;
    }

    public Long getCateg_id() {
        return categ_id;
    }

    public void setCateg_id(Long categ_id) {
        this.categ_id = categ_id;
    }

    public Long getProduct_manager() {
        return product_manager;
    }

    public void setProduct_manager(Long product_manager) {
        this.product_manager = product_manager;
    }

    public Date getMessage_last_post() {
        return message_last_post;
    }

    public void setMessage_last_post(Date message_last_post) {
        this.message_last_post = message_last_post;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getUom_po_id() {
        return uom_po_id;
    }

    public void setUom_po_id(Long uom_po_id) {
        this.uom_po_id = uom_po_id;
    }

    public String getDescription_sale() {
        return description_sale;
    }

    public void setDescription_sale(String description_sale) {
        this.description_sale = description_sale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight_net() {
        return weight_net;
    }

    public void setWeight_net(double weight_net) {
        this.weight_net = weight_net;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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

    public boolean isRental() {
        return rental;
    }

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    public byte getImage_medium() {
        return image_medium;
    }

    public void setImage_medium(byte image_medium) {
        this.image_medium = image_medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getImage_small() {
        return image_small;
    }

    public void setImage_small(byte image_small) {
        this.image_small = image_small;
    }

    public boolean isTrack_all() {
        return track_all;
    }

    public void setTrack_all(boolean track_all) {
        this.track_all = track_all;
    }

    public boolean isTrack_outgoing() {
        return track_outgoing;
    }

    public void setTrack_outgoing(boolean track_outgoing) {
        this.track_outgoing = track_outgoing;
    }

    public String getLock_rack() {
        return lock_rack;
    }

    public void setLock_rack(String lock_rack) {
        this.lock_rack = lock_rack;
    }

    public String getLoc_case() {
        return loc_case;
    }

    public void setLoc_case(String loc_case) {
        this.loc_case = loc_case;
    }

    public boolean isTrack_incoming() {
        return track_incoming;
    }

    public void setTrack_incoming(boolean track_incoming) {
        this.track_incoming = track_incoming;
    }

    public String getLock_row() {
        return lock_row;
    }

    public void setLock_row(String lock_row) {
        this.lock_row = lock_row;
    }

    public double getSale_delay() {
        return sale_delay;
    }

    public void setSale_delay(double sale_delay) {
        this.sale_delay = sale_delay;
    }

    public boolean isTrack_production() {
        return track_production;
    }

    public void setTrack_production(boolean track_production) {
        this.track_production = track_production;
    }

    public double getProduce_delay() {
        return produce_delay;
    }

    public void setProduce_delay(double produce_delay) {
        this.produce_delay = produce_delay;
    }

    public boolean isPurchase_oke() {
        return purchase_oke;
    }

    public void setPurchase_oke(boolean purchase_oke) {
        this.purchase_oke = purchase_oke;
    }

    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Product_template{" +
                "id=" + id +
                ", warranty=" + warranty +
                ", uos_id=" + uos_id +
                ", list_price=" + list_price +
                ", weight=" + weight +
                ", color=" + color +
                ", image=" + image +
                ", write_uid=" + write_uid +
                ", mes_type='" + mes_type + '\'' +
                ", uom_id=" + uom_id +
                ", description_purchase='" + description_purchase + '\'' +
                ", create_date=" + create_date +
                ", uos_coeff=" + uos_coeff +
                ", create_uid=" + create_uid +
                ", sale_oke=" + sale_oke +
                ", categ_id=" + categ_id +
                ", product_manager=" + product_manager +
                ", message_last_post=" + message_last_post +
                ", company_id=" + company_id +
                ", state='" + state + '\'' +
                ", uom_po_id=" + uom_po_id +
                ", description_sale='" + description_sale + '\'' +
                ", description='" + description + '\'' +
                ", weight_net=" + weight_net +
                ", volume=" + volume +
                ", write_date=" + write_date +
                ", active=" + active +
                ", rental=" + rental +
                ", image_medium=" + image_medium +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", image_small=" + image_small +
                ", track_all=" + track_all +
                ", track_outgoing=" + track_outgoing +
                ", lock_rack='" + lock_rack + '\'' +
                ", loc_case='" + loc_case + '\'' +
                ", track_incoming=" + track_incoming +
                ", lock_row='" + lock_row + '\'' +
                ", sale_delay=" + sale_delay +
                ", track_production=" + track_production +
                ", produce_delay=" + produce_delay +
                ", purchase_oke=" + purchase_oke +
                '}';
    }

    //--END METHODES
}
