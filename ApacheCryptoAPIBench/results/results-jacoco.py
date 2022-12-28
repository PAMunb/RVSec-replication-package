import os
import csv
import pandas as pd


attributes = ['INSTRUCTION','BRANCH','LINE','METHOD']
prefix = 'jacoco-'
suffix = '.csv'

jacoco_files = [filename for filename in os.listdir('.') if filename.startswith(prefix) and filename.endswith(suffix)]

with open('results-jacoco.csv', 'w', newline='') as file:
    writer = csv.writer(file)
    writer.writerow(['MODULE', *attributes])

    for file in jacoco_files:        
        module = file[len(prefix):-len(suffix)]
        row = [module]
        df = pd.read_csv(file)        
        
        for a in attributes:
            covered = df[a+'_COVERED'].sum()
            missed = df[a+'_MISSED'].sum()
            total = covered + missed
            cobertura = covered * 100 / total
            row.append('{0:.2f}'.format(cobertura))
         
        writer.writerow(row)
