package com.example.latihansidebar.recycler;

public class itemsMe {

    String nama;
    String desc;
    String img;

    public itemsMe(String nama, String desc, String img) {
        this.nama = nama;
        this.desc = desc;
        this.img = img;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
