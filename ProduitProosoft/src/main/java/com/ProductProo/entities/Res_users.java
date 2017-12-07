package com.ProductProo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by amino on 22/11/2017
 */

@Entity
public class Res_users implements UserDetails{

    //--ATTRIBUTS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean active;
    private String login;
    private String password;
    private Long company_id;
    private Long partner_id;
    private Long create_uid;
    private Date create_date;
    private Date login_date;
    private Long  write_uid;
    private Date write_date;
    private String signature;
    private Long action_id;
    private String password_crypt;
    private Long alias_id;
    private boolean display_groups_suggestions;
    private Long default_section_id;
    private boolean share;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "user_authority",
            joinColumns = @JoinColumn(name = "id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "idAut", referencedColumnName = "idAut"))
    private List<Authority> authorities;
    //--END ATTRIBUTS

    //--CONSTRUCTOR
    public Res_users(){}
    //--END CONSTRUCTOR

    //--GETTERS SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public Long getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(Long partner_id) {
        this.partner_id = partner_id;
    }

    public Long getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(Long create_uid) {
        this.create_uid = create_uid;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLogin_date() {
        return login_date;
    }

    public void setLogin_date(Date login_date) {
        this.login_date = login_date;
    }

    public Long getWrite_uid() {
        return write_uid;
    }

    public void setWrite_uid(Long write_uid) {
        this.write_uid = write_uid;
    }

    public Date getWrite_date() {
        return write_date;
    }

    public void setWrite_date(Date write_date) {
        this.write_date = write_date;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    public Long getAction_id() {
        return action_id;
    }
    public void setAction_id(Long action_id) {
        this.action_id = action_id;
    }

    public String getPassword_crypt() {
        return password_crypt;
    }

    public void setPassword_crypt(String password_crypt) {
        this.password_crypt = password_crypt;
    }

    public Long getAlias_id() {
        return alias_id;
    }

    public void setAlias_id(Long alias_id) {
        this.alias_id = alias_id;
    }

    public boolean isDisplay_groups_suggestions() {
        return display_groups_suggestions;
    }

    public void setDisplay_groups_suggestions(boolean display_groups_suggestions) {this.display_groups_suggestions = display_groups_suggestions;}

    public Long getDefault_section_id() {
        return default_section_id;
    }

    public void setDefault_section_id(Long default_section_id) {
        this.default_section_id = default_section_id;
    }

    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    //--END GETTERS SETTERS

    //--METHODES

    @Override
    public String toString() {
        return "Res_users{" +
                "id=" + id +
                ", active=" + active +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", company_id=" + company_id +
                ", partner_id=" + partner_id +
                ", create_uid=" + create_uid +
                ", create_date=" + create_date +
                ", login_date=" + login_date +
                ", write_uid=" + write_uid +
                ", write_date=" + write_date +
                ", signature='" + signature + '\'' +
                ", action_id=" + action_id +
                ", password_crypt='" + password_crypt + '\'' +
                ", alias_id=" + alias_id +
                ", display_groups_suggestions=" + display_groups_suggestions +
                ", default_section_id=" + default_section_id +
                ", share=" + share +
                '}';
    }
    //--END METHODES

}
