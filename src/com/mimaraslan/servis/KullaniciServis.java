package com.mimaraslan.servis;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.mimaraslan.Kullanici;
//http://localhost:8080/_004_RestFulJecksonJSON/kullanici/bilgi/1/Cumali/Kizil
@Path(value="/kullanici")
public class KullaniciServis {
	@GET
	@Path(value="/bilgi/{id}/{adi}/{soyadi}")
   public Response getKullaniciBilgisi(@PathParam("id") int id,
		   @PathParam("adi") String adi,
		   @PathParam("soyadi") String soyadi) {
	   Kullanici kullanicinesnesi=new Kullanici();
	   kullanicinesnesi.setKullanicId(id);
	   kullanicinesnesi.setKullaniciAdi(adi);
	   kullanicinesnesi.setKullaniciSoyadi(soyadi);
		return  Response.status(200).entity(kullanicinesnesi).build();
	   

	   
   }
}

