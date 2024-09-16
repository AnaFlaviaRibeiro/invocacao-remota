package application;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
	// Operações Aritméticas Básicas:
	public double somar(double num1, double num2) throws RemoteException;
	public double subtrair(double num1, double num2) throws RemoteException;
	public double multiplicar(double num1, double num2) throws RemoteException;
	public String dividir(double num1, double num2) throws RemoteException;
	
	// Operações Aritméticas Avançadas
	public double exponenciacao(double num1, double num2) throws RemoteException;
	public String radiacao(double num1, double num2) throws RemoteException;
	public String modulo(double num1, double num2) throws RemoteException;
	
	// Operações Lógicas e Comparativas
	public boolean maior(double num1, double num2) throws RemoteException;
	public boolean menor(double num1, double num2) throws RemoteException;
	public boolean igualdade(double num1, double num2) throws RemoteException;
	public boolean diferenca(double num1, double num2) throws RemoteException;

	// Outras Operações Matemáticas
	public double minimo(double num1, double num2) throws RemoteException;
	public double maximo(double num1, double num2) throws RemoteException;

	// Operações de Cálculo de Juros
	public double jurosSimples(double capital, double taxa, int tempo) throws RemoteException;
	public double jurosCompostos(double capital, double taxa, int tempo) throws RemoteException;
	public double calculotaxaJuros (double capital, double juros, int tempo) throws RemoteException;
	
	// Operações para Amortização e Financiamentos
	public double valorParcela(double capital, double taxa, int tempo) throws RemoteException;
	public double amortizacao(double capital, int tempo) throws RemoteException;

}
