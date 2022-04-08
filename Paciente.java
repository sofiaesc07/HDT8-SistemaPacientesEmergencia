public class Paciente implements Comparable<Paciente>{
	String name;
	private String description;
	private String priority;
	
	/**
	 * @param name
	 * @param description
	 * @param priority
	 */
	public Paciente(String name, String description, String priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}
	
	
	/** 
	 * Devuelve la prioridad de un paciente
	 * @return String
	 */
	public String getPriority() {
		return this.priority;
	}

	
	/** 
	 * Comparar y revisar quien va primero con respecto a su letra de prioridad
	 * @param o
	 * @return int
	 */
	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		int compare = this.priority.compareTo(o.priority); //Libreria String.
		if (compare == 0){
            return 0;
        }else if (compare > 0){
            return 1;
        }else{
            return -1;
        }
	}

	
	/** 
	 * imprimir a los pacientes
	 * @return String
	 */
	@Override
	public String toString() {
		return "Paciente: " + name + " | Descripcion: " + description + " | Prioridad: " + priority;
	}
}