# RVSec (replication package)

### **ApacheCryptoAPIBench**

   * ApacheCryptoAPIBench contains real-world crypto API misuses from Apache projects. The original benchmark involves eight Apache projects with different degrees of test coverage. Those projects include a total of 3169 test cases, but not all of them are JCA-related. 
   * Original artifacts: [ApacheCryptoAPI-Bench](https://github.com/CryptoAPI-Bench/ApacheCryptoAPI-Bench)


### **SmallCryptoAPIBench**

   * This is a micro-benchmark we build on top of the
   CryptoAPI-Bench and contains 187 test cases for legal and illegal 
   usages of crypto APIs. From the original benchmark (CryptoAPI-Bench), 
   we removed 16 non JCA test cases and fixed several test cases that
   throw exceptions at runtime. The following table summarizes the
   runtime problems that we faced from the original CryptoAPI-Bench. 
   * Original artifacts: [CryptoAPI-Bench](https://github.com/CryptoAPI-Bench/CryptoAPI-Bench)


### **JulietBench**

   * JulietBench is a subset of Juliet Test Suite for Java [[1]](https://samate.nist.gov/SARD/downloads/documents/Juliet_Test_Suite_v1.2_for_Java_-_User_Guide.pdf) and contains 102 test cases curated by the US National Security Agency (NSA). The breakdown of tests per CWE is: 17 CWE-325 (Missing Cryptographic Step), 34 CWE-327, and 51 CWE-328.
   * Original artifacts: [JulietBench](https://samate.nist.gov/SARD/test-suites)


### **MASCBench**

   * MASCBench contains 30 small Java programs with crypto API misuses. 
   The programs are from open-source Android apps and Apache Qpid Brokerj [[2]](https://qpid.apache.org/components/broker-j/index.html); they are 
   minimized to only show crypto API misuses. 
   * Original artifacts: [MascBench](https://github.com/Secure-Platforms-Lab-W-M/MASC-Artifact)

### **OWASPBench**

   * OWASPBench contains 482 test cases related to crypto APIs. The test suite is curated by [OWASP](https://owasp.org). We use the tests that are related to JCA and cover the common crypto API misuses CWE-327 (Use of a Broken or Risky Cryptographic Algorithm) and CWE-328 (Reversible One-Way Hash).
   * Original artifacts: [OWASPBench](https://owasp.org/www-project-benchmark/)


### **Tools**:
   
   * **CryptoGuard** (rev 92551eeb) [[GitHub]](https://github.com/CryptoGuardOSS/cryptoguard/tree/Release_04.05.03_2020-11-25-02-42_)
   * **CogniCrypt** (rev 3fc611d0) [[GitHub]](https://github.com/CROSSINGTUD/CryptoAnalysis/tree/2.7.2)     
   * **RVSec** (rev 0d3c1f32) [[GitHub]](https://github.com/PAMunb/rvsec)

