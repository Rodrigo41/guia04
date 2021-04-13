package Problema01;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class Camino {

	private ArrayList<Coordenada> coor;
	
	public void agregar(Coordenada x) {
	coor.add(x);
	}
	public void agregar(double lat, double ing) {
		Coordenada a= new Coordenada(lat,ing);
		coor.add(a);
	}
	public void agregar(int mtsLt, int mtsLn) {
		var earth = 6378.137;  
		double m = (1 / ((2 * Math.PI / 360) * earth)) / 1000;  
		double lat = (mtsLt * m);
		
		double n = (1 / ((2 * Math.PI / 360) * earth)) / 1000;
		double ing = (mtsLn * n) / Math.cos(Math.PI / 180);
		Coordenada a= new Coordenada(lat,ing);
		coor.add(a);
	}
	
	/*public ArrayList<Coordenada> buscar(Coordenada no, Coordenada se){
		ArrayList<Coordenada> bus= new ArrayList<>();
		for(int x=0; x<coor.size();x++) {
			
		}
		
		return bus;
	}*/
}
