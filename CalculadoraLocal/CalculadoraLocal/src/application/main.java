package application;

import java.rmi.RemoteException;

public class main {

	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 5;
		try {
			Calculadora ca = new Calculadora();
			ca.dividir(num1, num2);
			System.out.println(ca.dividir(num1, num2));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
