package com.example.latihansidebar.recycler;

public class itemsMe {

    String nama;
    String desc;
    int img;

    public itemsMe(String nama, String desc, int img) {
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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
