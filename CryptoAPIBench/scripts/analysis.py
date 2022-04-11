import pandas as pd
from pandasql import sqldf
pysqldf = lambda q: sqldf(q, globals())


cc = pd.read_csv('../results/CogniCrypt-report.csv')
cg = pd.read_csv('../results/CryptoGuard-Report.csv')


print("Distinct classes with errors in CogniCrypt")

print(pysqldf("SELECT count(distinct className) as Total from cc"))


print("Distinct classes with errors in CryptoGuard")
print(pysqldf("SELECT count(distinct className) as Total from cg"))

