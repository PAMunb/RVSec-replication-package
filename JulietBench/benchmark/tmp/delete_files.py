from pathlib import Path
import os



def read_file(filename):
    cont = 0
    with open(filename) as file:
        while (line := file.readline().rstrip()):
            if (not line.endswith("Main")) and (not "$" in line):            
                clazz = line.replace(".","/")+".java"
                clazz = os.path.abspath(os.path.join(os.pardir,"src", clazz))
                if os.path.exists(clazz):
                    cont = cont + 1
                    print(clazz)                
                    os.remove(clazz)
    print(cont)    


if __name__ == '__main__':    
    file = 'files_to_delete.txt'    

    read_file(file)

    print('FINISHED!!!')
