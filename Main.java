import java.util.PriorityQueue;
import java.util.Scanner;

/**
* Autor: Majo Gil (20337) y Sofia Escobar (20489) 
* Descripcion: Main del programa encargado de correrlo y concatenar todas las clases
*/

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader read = new Reader();
		try (Scanner sc = new Scanner(System.in)) {
            PriorityQueue<Paciente> pacienteJCF = new PriorityQueue<>();
            VectorHeap<Paciente> pacienteVec = new VectorHeap<Paciente>();
            
            boolean menu = true;
            
            while(menu) {
            	System.out.println("");
            	System.out.println("-------------------------------------------------------");
                System.out.println("Seleccione el tipo de PriorityQueue que desea utilizar:");
            	System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("1. Java Collection Framework");
                System.out.println("2. VectorHeap");
                System.out.println("3. Salir");
                System.out.println("");
                System.out.print("Escriba el numero de su seleccion: ");
                int sel = sc.nextInt();
                sc.nextLine();
                while(sel < 1 || sel > 3) {
                	System.out.print("Seleccion fuera de rango. Intente de nuevo:");
                    sel = sc.nextInt();
                    sc.nextLine();
            	}
                
                if(sel == 1) {
                	read.readPatientList(1);
                	pacienteJCF = read.getPJCF();
                	int t = 1;
                	while(!pacienteJCF.isEmpty()) {
                		System.out.println("Turno "+t+" >>>"+ pacienteJCF.remove());
                		t += 1;
                	}
                }else if(sel == 2) {
                	read.readPatientList(2);
                	pacienteVec = read.getPVect();
                	int t = 1;
                	while(!pacienteVec.isEmpty()) {
                		System.out.println("Turno "+t+" >>>"+ pacienteVec.remove());
                		t += 1;
                	}
                }else {
                	System.out.println("Adios :)");
                	menu = false;
                }
            }
        }	
	}
}