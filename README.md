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
of software tests.
We focus on the popular JCA crypto API
and write 22 RV specs based on expert-validated rules in a static
analyzer. We monitor these specs while running
tests in five benchmarks. Lastly, we compare RV accuracy with those of state-of-the-art 
static analyzers---CogniCrypt and CryptoGuard. Results show that RV has higher accuracy in
four benchmarks and is on par with CryptoGuard in the fifth. Overall, RV achieves an average F1 measure
of 95%, compared with 83% and 78% for CogniCrypt and CryptoGuard, respectively. These results are encouraging, and show that RV can complement static analysis tools for
detecting crypto API misuses.

## Replication Package

Detailed description of our benchmarks, tools, and datasets are available in what follows.

   * BenchMark 01: [MASCBench](https://github.com/PAMunb/RVSec-replication-package/tree/master/MASCBench)
   * BenchMark 02: [CryptoAPIBench](https://github.com/PAMunb/RVSec-replication-package/tree/master/OWASPBenchmark)
   * BenchMark 03: [OwaspBench](https://github.com/PAMunb/RVSec-replication-package/tree/master/OWASPBenchmark)
   * BenchMark 04: [NISTBench](https://github.com/PAMunb/RVSec-replication-package/tree/master/Juliet_Test_Suite)
   * BenchMark 05: [ApacheCryptoAPIBench](https://github.com/PAMunb/RVSec-replication-package/tree/master/ApacheCryptoAPIBench)
   


