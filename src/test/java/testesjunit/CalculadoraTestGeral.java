package testesjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.testesjunit.*;
//teste2
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculadoraTestGeral {
    //@Test

    PrintWriter gravarArq;

    @DisplayName("operações de Testes com Anotações")
    @BeforeAll
    public void criaLog() throws IOException {
        FileWriter arq = new FileWriter("C:\\NetBeansProjects\\LogTestes.txt");
        gravarArq = new PrintWriter(arq);
        gravarArq.printf("Iniciando os Testes");
    }

    @RepeatedTest(3)
    public void testSomar(RepetitionInfo repetitionInfo) {

        /* System.out.println("Testando o método Somar");;;

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 15;*/
        gravarArq.printf("/n Execuntando o Teste ->" + repetitionInfo.getCurrentRepetition());
        Calculadora c = new Calculadora();
        assertEquals(2, c.somar (1, 1));

    }

    @AfterEach
    public void FinalMetodo() {
        gravarArq.printf("\n Executando o método final, após cada execução");
    }

    @AfterAll
    public void Final() {
        gravarArq.printf("\n Executando o método Final, Após todas as execuções");
        gravarArq.close();
        System.out.println("Gravada com sucesso em -> LogTestes.text");

    }

}
