/*
16/08/2019
Siti Nur Alifah
10116181
IF4*/
package com.mvp.pattern.uas.akb.myapp;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class User extends RealmObject {
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @PrimaryKey
    private String nim;




    @Required
    private String nama;

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Required
    private String telepon;

    @Required
    private String alamat;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSosmed() {
        return sosmed;
    }

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }

    @Required
    private String email;
    @Required
    private String sosmed;

    public String getUnder() {
        return under;
    }

    public void setUnder(String under) {
        this.under = under;
    }

    @Required
    private String under;
}
