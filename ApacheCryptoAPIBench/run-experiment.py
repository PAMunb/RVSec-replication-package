import os
from os import walk

import time


cmd01 = """java -Xss4096m -Xmx12000m -Xms4096m -cp ../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner --rulesDir ../tools/rules/ --appPath ./assets/{} --reportFormat SARIF""" 

cmd02= """java -Xss4096m -Xmx12000m -Xms4096m -jar ../tools/cryptoguard-develop.jar -in jar -s ./assets/{} -o CryptoGuard-Report.json"""

h = open("results.csv", 'w')

def runAnalysis(tool, cmd, idx, program):
  start = round(time.time() * 1000)
  os.system(cmd.format(program))
  # print(cmd.format(program))
  end = round(time.time() * 1000)
  h.write(f'{tool},{idx},{f},{end-start}\n') 
    
for (dirpath, dirnames, filenames) in walk("./assets"):
  for f in filenames:					       
    for idx in range(1,1):					       
      runAnalysis('cc', cmd01, idx, f)
      runAnalysis('cg', cmd02, idx, f)

h.close()      
