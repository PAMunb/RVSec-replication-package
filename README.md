# Runtime Verification of Crypto APIs: An Empirical Study

## Abstract

Misuse of cryptographic (crypto) APIs is a noteworthy cause 
of security vulnerabilities. For this reason, static analyzers
were recently proposed for detecting crypto API misuses. They differ in strengths and
weaknesses, and they might miss bugs. Motivated by the inherent limitations of static analyzers,
this paper reports on a study of Runtime Verification (RV) as a dynamic-analysis-based
alternative for crypto API misuse detection. RV monitors program runs
against formal specifications; it was shown to
be effective and efficient for amplifying the bug-finding ability
of software tests. We focus on the popular JCA crypto API
and write 22 RV specs based on expert-validated rules in a static
analyzer. We monitor these specs while running
tests in five benchmarks. Lastly, we compare RV accuracy with those of state-of-the-art 
static analyzers---CogniCrypt and CryptoGuard. Results show that RV has higher accuracy in
four benchmarks and is on par with CryptoGuard in the fifth. Overall, RV achieves an average F1 measure
of 95%, compared with 83% and 78% for CogniCrypt and CryptoGuard, respectively. These results 
are encouraging, and show that RV can complement static analysis tools for
detecting crypto API misuses.

### **MASCBench**

   * MASCBench contains 30 small Java programs with crypto API misuses. 
   The programs are from open-source Android apps and Apache Qpid Brokerj [[2]](https://qpid.apache.org/components/broker-j/index.html); they are 
   minimized to only show crypto API misuses. 
   * [Replication Package](https://github.com/PAMunb/RVSec-replication-package/tree/master/MASCBench)
   * Original artifacts: [MascBench](https://github.com/Secure-Platforms-Lab-W-M/MASC-Artifact)

### **SmallCryptoAPIBench**

   * This is a micro-benchmark we build on top of the
   CryptoAPI-Bench and contains 187 test cases for legal and illegal 
   usages of crypto APIs. From the original benchmark (CryptoAPI-Bench), 
   we removed 16 non JCA test cases and fixed several test cases that
   throw exceptions at runtime. The following table summarizes the
   runtime problems that we faced from the original CryptoAPI-Bench. 
   * [Replication Package](https://github.com/PAMunb/RVSec-replication-package/tree/master/CryptoAPIBench)
   * Original artifacts: [CryptoAPI-Bench](https://github.com/CryptoAPI-Bench/CryptoAPI-Bench)

### **OWASPBench**

   * OWASPBench contains 482 test cases related to crypto APIs. The test suite is curated by [OWASP](https://owasp.org). We use the tests that are related to JCA and cover the common crypto API misuses CWE-327 (Use of a Broken or Risky Cryptographic Algorithm) and CWE-328 (Reversible One-Way Hash).
   * [Replication Package](https://github.com/PAMunb/RVSec-replication-package/tree/master/OWASPBenchmark)
   * Original artifacts: [OWASPBench](https://owasp.org/www-project-benchmark/)

### **JulietBench**

   * JulietBench is a subset of Juliet Test Suite for Java [[1]](https://samate.nist.gov/SARD/downloads/documents/Juliet_Test_Suite_v1.2_for_Java_-_User_Guide.pdf) and contains 102 test cases curated by the US National Security Agency (NSA). The breakdown of tests per CWE is: 17 CWE-325 (Missing Cryptographic Step), 34 CWE-327, and 51 CWE-328.
   * [Replication Package](https://github.com/PAMunb/RVSec-replication-package/tree/master/JulietBench)
   * Original artifacts: [JulietBench](https://samate.nist.gov/SARD/test-suites)

### **ApacheCryptoAPIBench**

   * ApacheCryptoAPIBench contains real-world crypto API misuses from Apache projects. The original benchmark involves eight Apache projects with different degrees of test coverage. Those projects include a total of 3169 test cases, but not all of them are JCA-related. 
   * [Replication Package](https://github.com/PAMunb/RVSec-replication-package/tree/master/ApacheCryptoAPIBench)
   * Original artifacts: [ApacheCryptoAPI-Bench](https://github.com/CryptoAPI-Bench/ApacheCryptoAPI-Bench)




### **Tools**:
   
   * **CryptoGuard** (rev 92551eeb) [[GitHub]](https://github.com/CryptoGuardOSS/cryptoguard/tree/Release_04.05.03_2020-11-25-02-42_)
   * **CogniCrypt** (rev 3fc611d0) [[GitHub]](https://github.com/CROSSINGTUD/CryptoAnalysis/tree/2.7.2)     
   * **RVSec** (rev 0d3c1f32) [[GitHub]](https://github.com/PAMunb/rvsec)

