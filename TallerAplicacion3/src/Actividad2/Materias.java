package Actividad2;

public class Materias {	
	String Juan="Matemáticas,Ciencias,Idiomas";     	//codigo 100101
	String Pedro="Ciencias,Idiomas"; 		//codigo 100102
	String Diana="Matemáticas,Ciencias";		//codigo 100201
	String Carolina="Matemáticas,Idiomas"; 	//codigo 100202
	String David;                              //codigo 100103
	
	public void consulta(int codigo) {
		if(codigo == 100101) {
			if(Juan == null)
			{
				throw new IllegalArgumentException("El estudiante no tiene materias asignadas");
			}
			else {
				System.out.println("las materias del estudiante son: "+Juan);
			}
		}
		if(codigo == 100102) {
			if(Pedro == null)
			{
				throw new IllegalArgumentException("El estudiante no tiene materias asignadas");
			}
			else {
				System.out.println("las materias del estudiante son: "+Pedro);
			}
		}
		if(codigo == 100201) {
			if(Diana == null)
			{
				throw new IllegalArgumentException("El estudiante no tiene materias asignadas");
			}
			else {
				System.out.println("las materias del estudiante son: "+Diana);
			}
		}
		if(codigo == 100202) {
			if(Carolina == null)
			{
				throw new IllegalArgumentException("El estudiante no tiene materias asignadas");
			}
			else {
				System.out.println("las materias del estudiante son: "+Carolina);
			}
		}
		if(codigo == 100103) {
			if(David == null)
			{
				throw new IllegalArgumentException("El estudiante no tiene materias asignadas");
			}
			else {
				System.out.println("las materias del estudiante son: "+David);
			}
		}	
	}
}

/*dentro del codigo prefiero generar unas excepcines e informar acerca del error,
 *  mientras que si solo retorno null el estudiante  no sabe la razon de dicho valor*/
