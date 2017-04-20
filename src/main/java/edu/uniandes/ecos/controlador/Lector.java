package edu.uniandes.ecos.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.uniandes.ecos.modelo.Logica;
import edu.uniandes.ecos.modelo.Persistencia;

/**
 * Clase para leer datos de entrada desde un archivo
 * @author Melga
 *
 */
public class Lector {
	private Persistencia datos;
	private String ruta;
	private BufferedReader br;
	
	/**
	 * Constructor
	 * @param datos
	 */
	public Lector(Persistencia datos){
		this.datos = datos;
	}
	
	/**
	 * Metodo para leer datos desde un archivo
	 * @param ruta, String que indica la ruta en el sistema donde se encunetra el archivo
	 * @throws FileNotFoundException
	 */
	public void leerArchivo(String ruta) throws FileNotFoundException{
		this.ruta = ruta;
		br = new BufferedReader(new FileReader(this.ruta));

		try {
		    String line = br.readLine();
		    while (line != null) {
		    	String [] linea = line.split(" ");
		    	this.datos.setP(Double.parseDouble(linea[0]));
		    	this.datos.setDof(Double.parseDouble(linea[1]));		
		        line = br.readLine();
		    }
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error, asegurese que el formato del archivo sea adecuado.");
			e.printStackTrace();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
