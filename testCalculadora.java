package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Robot;
import java.util.Objects;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import calcualdora.CalculadoraED;
import calcualdora.CerebroCalculadoraED;
import calcualdora.Operaciones;

class testCalculadora {
	CerebroCalculadoraED CC;
	
	@Test
	public void testSuma() {
		CC = new CerebroCalculadoraED();
		CC.operarSuma(Operaciones.SUMAR);
		double esperado=12;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testResta() {
		CC = new CerebroCalculadoraED();
		CC.operarResta(Operaciones.RESTAR);
		double esperado=0;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testMultiplicacion() {
		CC = new CerebroCalculadoraED();
		CC.operarMultiplica(Operaciones.MULTIPLICAR);
		double esperado=10;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testDivision() {
		CC = new CerebroCalculadoraED();
		CC.operarDivide(Operaciones.DIVIDIR);
		double esperado=10;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testSumaRes() {
		CC = new CerebroCalculadoraED();
		CC.resultado=10;
		CC.operarSumaRes(Operaciones.SUMAR_RES);
		double esperado=15;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testRestaRes() {
		CC = new CerebroCalculadoraED();
		CC.resultado=20;
		CC.operarRestaRes(Operaciones.RESTAR_RES);
		double esperado=15;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testMultiplicaRes() {
		CC = new CerebroCalculadoraED();
		CC.resultado=7;
		CC.operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
		double esperado=14;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testDivideRes() {
		CC = new CerebroCalculadoraED();
		CC.resultado=7;
		CC.operarDivideRes(Operaciones.DIVIDIR_RES);
		double esperado=14;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testMostrarResultado() {
		CC = new CerebroCalculadoraED();
		CC.resultado=14;
		CC.mostrarResultadoActual(Operaciones.RESULTADO);
		double esperado=14;
		Assertions.assertEquals(esperado, CC.resultado);
	}
	
	@Test
	public void testAleatorio() {
		CC = new CerebroCalculadoraED();
		CC.numeroAleatorio(Operaciones.RANDOM);
		boolean esperado=false;
		if(CC.resultado>0 && CC.resultado<100) {
			esperado=true;
		}
		
		assertTrue(esperado);
	}


}

