import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VectorHeapTest {
    @Test
    public void testAdd() {
        VectorHeap<Paciente> pacienteVec = new VectorHeap<>();
		
		pacienteVec.add(new Paciente("N1", "Sintoma", "D"));
		pacienteVec.add(new Paciente("N2", "Sintoma", "A"));
		pacienteVec.add(new Paciente("N3", "Sintoma", "C"));
		
		int sizeP = pacienteVec.size();	
		Paciente RP = pacienteVec.remove();
		
		assertEquals(3, sizeP);
		assertEquals("N2", RP.name);  
		
    }

    @Test
    public void testRemove() {
        VectorHeap<Paciente> pacienteVec = new VectorHeap<>();
		
		pacienteVec.add(new Paciente("N1", "Sintoma", "D"));
		pacienteVec.add(new Paciente("N2", "Sintoma", "A"));
		pacienteVec.add(new Paciente("N3", "Sintoma", "C"));
		
		Paciente RP1 = pacienteVec.remove();
		Paciente RP2 = pacienteVec.remove();
		Paciente RP3 = pacienteVec.remove();

        assertEquals("N2", RP1.name);
		assertEquals("N3", RP2.name);
		assertEquals("N1", RP3.name);
		
    }
}
