import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;

/**
* Autor: Majo Gil (20337) y Sofia Escobar (20489) 
*/

public class Reader {
	
	PriorityQueue<Paciente> pacientesJCF = new PriorityQueue<>();
	VectorHeap<Paciente> pacientesVec = new VectorHeap<Paciente>();
	
	public Reader() {
	}
	
	
	/** 
	 * @param typeQueue
	 */
	public void readPatientList(int typeQueue) {
		// TODO Auto-generated method stub

		String texto = new String();

		try {
			FileReader fr = new FileReader("pacientes.txt");
			BufferedReader entrada = new BufferedReader(fr); 
			String s;

			while((s = entrada.readLine()) != null) {
				String[] temp = s.split(", ");
				Paciente pac = new Paciente(temp[0], temp[1], temp[2]);
				if(typeQueue == 1) {
					pacientesJCF.add(pac);
				}else {
					pacientesVec.add(pac);
				}
			}
		}
		catch(java.io.FileNotFoundException fnfex) {
			System.out.println("Archivo no encontrado: " + fnfex);}
		catch(java.io.IOException ioex) {}
	}
	
	
	/** 
	 * @return PriorityQueue<Paciente>
	 */
	public PriorityQueue<Paciente> getPJCF(){
		return pacientesJCF;
	}
	
	
	/** 
	 * @return VectorHeap<Paciente>
	 */
	public VectorHeap<Paciente> getPVect(){
		return pacientesVec;
	}
}