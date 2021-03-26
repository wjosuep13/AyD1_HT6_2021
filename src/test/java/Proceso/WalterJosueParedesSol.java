/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proceso;

import Objetos.Carrera;
import Objetos.RegistroAcademico;
import Objetos.Horario;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;



public class WalterJosueParedesSol {
    @Mock
    AsignarHorario mockAsignarHorario;
    
    @Mock
    Carrera mock_c ;
    @Mock
    RegistroAcademico mock_ra;
      
        
        
       
    


    @Test
    public void TeshorarioTest() throws Exception{
    mockAsignarHorario = new AsignarHorario();
      mock_ra = new RegistroAcademico(2015, "04326");
     mock_c = new Carrera(1, "Carrerita");
    assertNotEquals(210,mockAsignarHorario.generarHorario(mock_c,mock_ra).getCodigoHorario());
    assertEquals(856,mockAsignarHorario.generarHorario(mock_c,mock_ra).getCodigoHorario());
    assertEquals("Vespertino",mockAsignarHorario.generarHorario(mock_c,mock_ra).getDescripcion());

    }
    
    @Mock
    Carrera carreramock;
    
    @Test
    public void procesarCarreraTest() throws Exception {
       carreramock = new Carrera(1, "Carrerita");
        assertEquals(2,carreramock.procesarCarrera());
    }
    
}