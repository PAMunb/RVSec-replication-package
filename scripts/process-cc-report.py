import sys
import json
import re

# name = input('input file (a CC report in CSV): ')

if(len(sys.argv) != 3):
    print("\nThis script converts the json output of CogniCrypt into a CSV file")
    print("Execution: $ python3 <input> <output>")
    print("where input is the path for the json file and output is the path for the converted file.\n")

    print("ooops! Wrong number of arguments. Expecting python3 process-cg-report.py <input> <output>")
    sys.exit(1)


print("Converting the file " + sys.argv[1])

p1 = "((\w+.)+)\.(\w+)\."
p2 = "(.*) violating CrySL rule for ((\w+.)+)\.(\w+)\."

out = open(sys.argv[2],"w")

out.write("spec,error,class,className,method\n")

with open(sys.argv[1], "r") as read_file:
    data = json.load(read_file)

    issues = data["runs"][0]["results"]

    idx = 0
    
    for issue in issues:
        location = issue["locations"][0]
        name = location["fullyQualifiedLogicalName"].replace("::", ".")
        fullyQualifiedName = name[0:name.rfind(".")]
        className = fullyQualifiedName[fullyQualifiedName.rfind(".")+1:]
        methodName = name[name.rfind(".")+1:]

        msg = issue["message"]
        error = "\"" + msg["text"].replace("\"", "'") + " " + msg["richText"] + "\""

        rule = re.match(p2, error).group(4)
        
        idx = idx + 1

        out.write("{},{},{},{},{}\n".format(rule + "Spec", error, fullyQualifiedName, className, methodName))

out.close()

print("done.")
