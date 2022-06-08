def load_ground_truth(filename, cwes):
	results = {}
	with open(filename) as gtf:
		gtf.readline()
		for bench in gtf:
			name, category, is_vuln, cwe = bench.split(',')
			if int(cwe) in cwes:
				results[name] = (category, is_vuln, int(cwe))
	return results

