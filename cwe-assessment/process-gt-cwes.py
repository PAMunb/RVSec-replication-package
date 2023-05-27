import csv

def printRow(cwe, values):
    res = [0]*4
    
    for i in range(0, 4):
        res[i] = accuracy(values[3*i], values[3*i+1], values[3*i+2])
        
    print(f"{cwe}     & {res[0]:.2f}     & {res[1]:.2f}          & {res[2]:.2f}          & {res[3]:.2f} \\\\")
    

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

print("\\begin{tabular}{lcccc}") 
print("CWE     & RVSec    & CryLogger     & CogniCrypt    & CryptoGuard  \\\\ \\midrow ")

for k in cweFinal:
    printRow(k, cweFinal[k])

print("\\ebd{tabular}") 
    
