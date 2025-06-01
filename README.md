# Projeto: Calculadora com Invocação Remota (Java RMI)

Este projeto demonstra o uso de Java RMI (Remote Method Invocation) para criar uma aplicação distribuída simples que permite a execução remota de operações matemáticas básicas, como soma, subtração, multiplicação e divisão.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
CalculadoraLocal/
├── src/
│   └── application/
│       ├── Calculadora.java          # Implementação da interface remota
│       ├── ICalculadora.java         # Interface remota (RMI)
│       ├── CalculadoraServer.java    # Código do servidor RMI
│       ├── CalculadoraClient.java    # Cliente que invoca os métodos remotos
│       └── main.java                 # Classe principal (opcional)
│
└── src/test/
    └── CalculadoraTest.java          # Testes da aplicação
```

## Requisitos

- Java 8 ou superior
- Eclipse (opcional, mas o projeto está configurado como workspace)
- Terminal/Shell para compilar e executar via linha de comando, se preferir

## Compilação e Execução

1. **Compile todas as classes**:
   ```bash
   javac -d bin src/application/*.java
   ```

2. **Inicie o Registry RMI** (em outro terminal):
   ```bash
   rmiregistry
   ```

3. **Execute o servidor**:
   ```bash
   java -cp bin application.CalculadoraServer
   ```

4. **Execute o cliente**:
   ```bash
   java -cp bin application.CalculadoraClient
   ```

## Funcionalidades

O cliente pode invocar remotamente métodos implementados no servidor para:

- `soma(double a, double b)`
- `subtrai(double a, double b)`
- `multiplica(double a, double b)`
- `divide(double a, double b)`

## Licença

Este projeto é apenas para fins educacionais. Sem licença específica definida.
