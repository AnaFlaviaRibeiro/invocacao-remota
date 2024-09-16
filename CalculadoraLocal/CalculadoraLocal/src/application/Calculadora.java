package application;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8613822452781226578L;

	public Calculadora() throws RemoteException {
		super();
	}

	@Override
	public double somar(double num1, double num2) throws RemoteException {
		return num1 + num2;
	}

	@Override
	public double subtrair(double num1, double num2) throws RemoteException {
		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) throws RemoteException {
		return num1 * num2;
	}

	@Override
	public String dividir(double num1, double num2) throws RemoteException {
		if (num2 <= 0)
			return "O segundo número tem que ser maior que 0";
		return String.valueOf(num1 / num2);
	}

	@Override
	public double exponenciacao(double num1, double num2) throws RemoteException {
		return Math.pow(num1, num2);
	}

	@Override
	public String radiacao(double num1, double num2) throws RemoteException {
		if (num2 <= 0)
			return "O segundo número tem que ser maior que 0";
		return String.valueOf(Math.pow(num1, 1.0 / num2));
	}

	@Override
	public String modulo(double num1, double num2) throws RemoteException {
		if (num2 == 0)
			return "O segundo número tem que ser diferente de 0";
		return String.valueOf(num1 % num2);
	}

	@Override
	public boolean maior(double num1, double num2) throws RemoteException {
		return num1 > num2;
	}

	@Override
	public boolean menor(double num1, double num2) throws RemoteException {
		return num1 < num2;
	}

	@Override
	public boolean igualdade(double num1, double num2) throws RemoteException {
		return num1 == num2;
	}

	@Override
	public boolean diferenca(double num1, double num2) throws RemoteException {
		return num1 != num2;
	}

	@Override
	public double minimo(double num1, double num2) throws RemoteException {
		return Math.min(num1, num2);
	}

	@Override
	public double maximo(double num1, double num2) throws RemoteException {
		return Math.max(num1, num2);
	}

	@Override
	public double jurosSimples(double capital, double taxa, int tempo) throws RemoteException {
		return capital * taxa * tempo;
	}

	@Override
	public double jurosCompostos(double capital, double taxa, int tempo) throws RemoteException {
		return capital * Math.pow(1 + taxa, tempo);
	}
	@Override
	public double calculotaxaJuros(double capital, double juros, int tempo) throws RemoteException {
		return juros / (capital * tempo);
	}

	@Override
	public double valorParcela(double capital, double taxa, int tempo) throws RemoteException {
		return (capital * (taxa * Math.pow(1 + taxa, tempo))) / (Math.pow(1 + taxa, tempo) - 1);
	}

	@Override
	public double amortizacao(double capital, int tempo) throws RemoteException {
		return capital/tempo;
	}

}
