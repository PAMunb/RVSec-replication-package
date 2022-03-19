# Bench04

### Bench04

   * Description: 

### Run

```
sh execute.sh
```

Or: 

```
mvn -am

cd spark/
mvn clean test -pl core -am
cd ..
```

### Scripts

   * download.sh: download all projects (should not be used. It only serves to show the commands used)
   * build.sh: initial build of all projects (only used the first time, to install the dependencies)
   * execute.sh: test the projects 
   
   
### Projects

   * **activemq-artemis**: OK!  
   * **deltaspike**: OK!  
   * directory-ldap-api: necessário (apenas) para compilar o "directory-server".
   * **directory-server**: OK!  
   * **manifoldcf**: original não compila (classe deletada: SeleniumTester). Não há testes cobrindo JCA (método de teste adicionado manualmente: DateTest.testHash()), então não gera(va) o relatório no diretório "output".
   * **openwebbeans-meecrowave**: OK!  
   * **spark**: classe deletada: StatsdSinkSuite.scala. Não executa pelo pom, provavelmente por causa de um diretório "work" criado durante os testes na pasta errada (era para ser criada dentro de spark, mas cria na raiz do pom).  
   * **tika**: métodos de teste comentados: TestMetadata.testMultithreadedDates:400 e AnnotationUtilsTest.testParamValueInheritance:181. Não há testes cobrindo JCA (classe de teste criada: CryptoParserTest), então não gera(va) o relatório no diretório "output".   
   * **tomee**: executa os testes no original, mas entra em "deadlock" com o JavaMOPAgent.  
   * **wicket**: teste comentado: ConnectionsTest
