import csv


cwesDict = { 319 : 'Cleartext Transmission of Sensitive Information',
             321 : 'Use of Hard-coded Cryptographic Key',
             325 : 'Missing Cryptographic Step',
             326 : 'Inadequate Encryption Strength',
             327 : 'Use of a Broken or Risky Cryptographic Algorithm', 
             328 : 'Use of Weak Hash',
             330 : 'Use of Insufficiently Random Values',
             337 : 'Predictable Seed in Pseudo-Random Number Generator',
             338 : 'Use of Cryptographically Weak Pseudo-Random Number Generator ',
             341 : 'Predictable from Observable State',
             798 : 'Use of Hard-coded Credentials',
             916 : 'Use of Password Hash With Insufficient Computational Effort',
             1391: 'Use of Weak Credentials',
             1240: 'Use of a Cryptographic Primitive with a Risky Implementation',
             1204: 'Generation of Weak Initialization Vector (IV)'
        }

cweTotal = {}

def printRow(cwe, values):
    if not (int(cwe) in cwesDict.keys()):
        return

    if cweTotal[cwe] < 10:
        return
    
    res = [0]*4
    
    for i in range(0, 4):
        res[i] = accuracy(values[3*i], values[3*i+1], values[3*i+2])
        
    print(f"{cwe} - {cwesDict[int(cwe)]}     & {res[0]:.2f}     & {res[1]:.2f}          & {res[2]:.2f}          & {res[3]:.2f} \\\\")
    

def accuracy(tp, fp, fn):
    precision = 0
    recall = 0
    
    if (tp + fp) != 0:
        precision = tp /(tp + fp)

    if (tp + fn) != 0:
        recall = tp / (tp + fn)

    if (precision + recall) == 0:
        return 0
    
    return 2 * ((precision * recall)/(precision + recall))
    
    
cweFinal = {}

toolIds = {'RVSec' : 0, 'CryLogger' : 1, 'CogniCrypt' : 2, 'CryptoGuard' : 3}
warningIds = {'TP' : 0, 'FP' : 1, 'FN' : 2}

with open('benchmarks.csv') as csvfile:
    cwes = csv.reader(csvfile, delimiter = ',')
    count = 0
    for row in cwes:
        if count == 0:
            count = count + 1
            continue
        [cwe, cn, tool, warning] = row

        values = cweFinal.get(cwe, [0]*12)

        idx = 3 * toolIds[tool] + warningIds[warning]

        values[idx] = values[idx] + 1

        cweFinal[cwe] = values

        total = cweTotal.get(cwe, 0)
        cweTotal[cwe] = total + 1
        

print("\\begin{tabular}{lcccc}") 
print("CWE     & RVSec    & CryLogger     & CogniCrypt    & CryptoGuard  \\\\ \\midrow ")

for k in cweFinal:
    printRow(k, cweFinal[k])

print("\\ebd{tabular}") 
    
for k in cweTotal:
    print(cweTotal[k])
