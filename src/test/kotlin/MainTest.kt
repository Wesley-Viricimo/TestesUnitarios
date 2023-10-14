import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo") //Declarando o nome do teste
    fun testCountXO() {
        //Assertions.assertTrue(countXO("xxoo")) //Função irá testar método criado e retornará se passou no teste ou não neste caso para passar deverá retornar true
        //Assertions.assertEquals(countXO("xxoo"), true) //Função irá testar se uma expressão é igual a outra

        Assertions.assertAll( //Função executará todos os testes que foram inseridos e retornará a quantidade de falhas quando houver
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoO"))}
        )
    }

    @Test
    @Disabled //Método não será executado caso se estiver com esta anotação
    fun NaoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem este método") //Tem a função de criar um alerta
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxo"))
        Assertions.assertTrue(abc()) //Função será executada apenas se a função acima dela retornar retornar verdadeiro
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() } //Teste que retorna se a função retornará um erro, deve ser passado como parâmetro o erro esperado
    }
}