package ar.edu.ub.parquesnacionales.Model;

import ar.edu.ub.parquesnacionales.Model.Encuesta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EncuestaAdd{
	 static List<Encuesta> lista = new ArrayList<>();
	 
	 static {
		 lista.add(new Encuesta(1,true,true,3));
		 lista.add(new Encuesta(2,true,false,6));
		 lista.add(new Encuesta(3,false,true,1));
	 }
	 
	 public List<Encuesta> GetAllEncuestas(){
		 return lista;
	 }

	

	
	
}
