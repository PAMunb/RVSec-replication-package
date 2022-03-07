import sys
import json
import re

# name = input('input file (a CC report in CSV): ')

if(len(sys.argv) != 3):
    print("\nThis script converts the json output of CryptoGuard into a CSV file")
    print("Execution: $ python3 <input> <output>")
    print("where input is the path for the json file and output is the path for the converted file.\n")

    print("ooops! Wrong number of arguments. Expecting python3 process-cg-report.py <input> <output>")
    sys.exit(1)


print("Converting the file " + sys.argv[1])

p1 = "(.*) (<?\w+>?)\(.*\)"
p2 = "violating CrySL rule for ((\w+.)+)\.(\w+) "
p3 = "org.cryptoapi.bench"
p4 = "br.unb.cic.mop.bench02"

out = open(sys.argv[2],"w")

out.write("spec,error,class,className,method\n")

with open(sys.argv[1], "r") as read_file:
    data = json.load(read_file)

    issues = data["Issues"]

    for issue in issues:
        fullPath = issue["_FullPath"]
        className = fullPath[fullPath.rfind('/')+1:].replace(".class", "")
        out.write("{},{},{},{},{}\n".format(issue["RuleNumber"], issue["Message"], className, className, "-"))


out.close()

print("done.")
