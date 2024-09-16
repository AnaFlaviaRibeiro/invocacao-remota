package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.rmi.RemoteException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import application.Calculadora;

class CalculadoraTest {
	static Calculadora ca;
	double num1 = 10;
	double num2 = 5;

	@BeforeAll
	static void init() throws RemoteException {
		ca = new Calculadora();
	}

	@Test
	void testCalculadoraDividir() throws RemoteException {
		String resultado = ca.dividir(num1, num2);
		assertEquals(String.valueOf(2.0), resultado);
	}

	@Test
	void testCalculadoraDividirMensagemErro() throws RemoteException {
		num2 = 0;
		String resultado = ca.dividir(num1, num2);
		assertEquals("O segundo número tem que ser maior que 0", resultado);
	}

	@Test
	void testExponenciacao() throws RemoteException {
		double resultado = ca.exponenciacao(num1, num2);
		assertEquals(100000.0, resultado);
	}

	@Test
	void testCalculadoraRadiacaoMensagemErro() throws RemoteException {
		num1 = 27;
		num2 = 0;
		String resultado = ca.radiacao(num1, num2);
		assertEquals("O segundo número tem que ser maior que 0", resultado);
	}

	@Test
	void testRadiacao() throws RemoteException {
		num1 = 27;
		num2 = 3;
		String resultado = ca.radiacao(num1, num2);
		assertEquals(String.valueOf(3.0), resultado);
	}

	@Test
	void testModulo() throws RemoteException {
		num1 = 11;
		String resultado = ca.modulo(num1, num2);
		assertEquals(String.valueOf(1.0), resultado);
	}

	@Test
	void testMaior() throws RemoteException {
		boolean resultado = ca.maior(num1, num2);
		assertTrue(resultado);
	}

	@Test
	void testMenor() throws RemoteException {
		boolean resultado = ca.menor(num1, num2);
		assertFalse(resultado);
	}

	@Test
	void testDiferente() throws RemoteException {
		boolean resultado = ca.maior(num1, num2);
		assertTrue(resultado);
	}

	@Test
	void testIgualdade() throws RemoteException {
		boolean resultado = ca.menor(num1, num2);
		assertFalse(resultado);
	}
	@Test
	void testMinimo() throws RemoteException {
		double resultado = ca.minimo(num1, num2);
		assertEquals(num2, resultado);

	}
	@Test
	void testMaximo() throws RemoteException {
		double resultado = ca.maximo(num1, num2);
		assertEquals(num1, resultado);

	}

}
