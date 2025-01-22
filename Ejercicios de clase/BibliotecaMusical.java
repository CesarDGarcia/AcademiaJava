package biblioMusical;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaMusical { 
	
		public static void agregarCancion(List<String> canciones, List<String> autores,
				String titulo, String autor) {
	        canciones.add(titulo);
	        autores.add(autor);   
	        
	    }
		
		public static void Buscar(List<String> canciones, List<String> autores, String palabraClave) {
				boolean b = false;
				for (int i=0; i < canciones.size(); i++) {
					 if (canciones.get(i).toLowerCase().contains(palabraClave.toLowerCase())) {
			                System.out.println("Canción: " + canciones.get(i) + " - Autor: " + autores.get(i));
			                b = true;
				}
			
		
				}
				if (!b) {
		            System.out.println("No se encontraron canciones que coincidan con '" + palabraClave + "'.");
				}
		
		}

		public static void main(String[] args) {
			List<String> canciones = new ArrayList<String>();
			List<String> autores = new ArrayList<String>();
			
			
			agregarCancion(canciones, autores, "In the end", "Linkin Park");
			agregarCancion(canciones, autores, "New Divide", "Linkin Park");
			agregarCancion(canciones, autores, "Bleed it out", "Linkin Park");
			agregarCancion(canciones, autores, "Circus Nigth", "Ushio Reira");
			agregarCancion(canciones, autores, "Miso soup and butter", "Ushio Reira");
			
			System.out.println("Cancion " + canciones + "Autor "  + autores);
			
			System.out.println("Buscando canciones que contienen 'miso':");
	        Buscar(canciones, autores, "miso");
		}

	}


