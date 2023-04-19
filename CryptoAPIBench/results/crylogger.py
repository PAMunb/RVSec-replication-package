import re
import sys
import csv

if(len(sys.argv) != 4): 
    print("Invalid number of arguments. Try python3 crylogger.py <application.errors> <ground_truth file> --(NAME | QUALIFIED_NAME | Method)")
    quit()


errorFile = sys.argv[1]
gtFile = sys.argv[2]
nameOption = sys.argv[3]
outfile = "crylogger.csv"

def splitClassAndMethodName(name):
    names = name.split(".")
    total = len(names)

    qualifiedClassName = ".".join(names[slice(0, total-1)])
    className = names[total-2].strip()
    methodName = names[total-1].strip()

    return (qualifiedClassName, className, methodName)

pattern = '(.*) ### \[(.*)\] (.*) :: \[(.*)\]'

rules =  { "rule_R01" : ("MessageDigestSpec", "Don't use insecure hash (e.g., MD2, MD4, SHA-1)")
         , "rule_R02" : ("CipherSpec", "Don't use insecure algorithms (e.g., RC2, RC4, IDEA, ..)")
         , "rule_R03" : ("CipherSpec", "Don't use the operation mode ECB with > 1 block")
         , "rule_R04" : ("CipherSpec", "Don't use the operation mode CBC if AES is used")
         , "rule_R05" : ("CipherSpec", "Don't use a static (constant) key for encryption")
         , "rule_R06" : ("RandomSpec", "Don't use a 'badly-derived' key for encryption")
         , "rule_R07" : ("RandomSpec", "Don't use a static (constant) initialization vector") 
         , "rule_R08" : ("IVSpec", "Don't use a 'badly-derived' iv for encryption")
         , "rule_R09" : ("IVSpec", "-")
         , "rule_R10" : ("PBEKeySpec/PBEParameterSpec", "Don't use a static (constant) salt for key derivation")
         , "rule_R11" : ("PBEKeySpec/PBEParameterSpec", "Don't use a short salt (< 64 bits) for key derivation")
         , "rule_R12" : ("PBEKeySpec/PBEParameterSpec", "Don't use the salt for different purposes")
         , "rule_R13" : ("PBEKeySpec/PBEParameterSpec", "Don't use < 1000 iterations for key derivation")
         , "rule_R14" : ("PBEKeySpec/KeyStore", "Don't use a weak password (score < 3) for PBE") 
         , "rule_R15" : ("PBEKeySpec/KeyStore", "Don't use NIST-black-listed passwords for PBE")
         , "rule_R16" : ("PBEKeySpec", "Don't use a static (constant) password for PBE")
         , "rule_R17" : ("SecureRandomSpec", "Don't use a static (constant) seed for PRNG")     
         , "rule_R18" : ("RandomSpec", "Don't use insecure PRNG (java.util.Random)")
         , "rule_R19" : ("CipherSpec", "Don't use a short key (< 2048 bits) for RSA")
         , "rule_R20" : ("CipherSpec", "Don't use the textbook (raw) algorithm for RSA")  
         , "rule_R21" : ("CipherSpec", "Don't use the padding PKCS1Padding for RSA")
         , "rule_R22" : ("URLSpec", "Don't use the HTTP protocol")
         , "rule_R23" : ("KeyStoreSpec", "Don't use a static (constant) password for KeyStore")
         , "rule_R24" : ("SSLSpec", "Don't verify the hostname for SSL connections")
         , "rule_R25" : ("SSLSpec", "Don't verify certificates for SSL connections")  
         , "rule_R26" : ("SSLSpec/SSLSocketFactorySpec", "Don't verify hostnames for SSL connections")
         }

gt = set()     
warnings = set()

with open(errorFile) as fh:
    txt = fh.read()
    matches = re.findall(pattern, txt)
    for match in matches:
        warnings.add(match)

with open(gtFile) as fh:
    rows = fh.readlines()
    header = 0
    for row in rows:
        if(header):
            values = row.split(",")
            gt.add((values[2], values[5]))
        header = header+1    

with open(outfile, "w") as fh:        
    for warning in warnings:
        (rule, primitive, message, stackTrace) = warning
        methodCalls = stackTrace.split(',')
        falsePositive = True
        classWithError = '-'
        for method in methodCalls:
            (qualifiedClassName, className, methodName) = splitClassAndMethodName(method)
            for error in gt:
                (name, truePositive) = error
                if truePositive == 'TRUE' and className == name:
                    fh.write(f"{rule},{qualifiedClassName},{className},{methodName},{message}\n")
