#!/usr/bin/env python3
from os import listdir
from os.path import isfile, join, realpath
import sys

if __name__ == "__main__":
	if len(sys.argv) < 2:
		print("Usage: %s [PATH]", sys.argv[0])
	mypath = sys.argv[1]
	for f in listdir(mypath):
		fullpath = join(mypath, f)
		if isfile(fullpath):
			print(realpath(fullpath))
