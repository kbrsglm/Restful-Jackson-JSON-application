package com.mimaraslan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="kullanici")
public class Kullanici {
	@XmlElement(name="id")
  int kullanicId;
	@XmlElement(name="adi")
   String kullaniciAdi;
	@XmlElement(name="soyadi")
   String kullaniciSoyadi;
	public int getKullanicId() {
		return kullanicId;
	}
	public void setKullanicId(int kullanicId) {
		this.kullanicId = kullanicId;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getKullaniciSoyadi() {
		return kullaniciSoyadi;
	}
	public void setKullaniciSoyadi(String kullaniciSoyadi) {
		this.kullaniciSoyadi = kullaniciSoyadi;
	}
}
