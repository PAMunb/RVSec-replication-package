from json import load


def load_ground_truth(filename, cwes):
    results = {}
    with open(filename) as gtf:
        gtf.readline()
        for bench in gtf:
            name, category, is_vuln, cwe = bench.split(',')
            if int(cwe) in cwes:
                results[name] = (category, is_vuln, int(cwe))
    return results

def load_result_file(filename):
	results = {}
	with open(filename) as res_file:
		class_index = res_file.readline().split(',').index('className')
		for bench in res_file:
			res_line = bench.split(',')
			results[res_line[class_index]] = res_line[0:class_index] + res_line[class_index:-1]
	return results

if __name__ == '__main__':
	ground_truth = load_ground_truth('../ground_truth.csv', (327,328))
	cogni_crypt = load_result_file('../results/CogniCrypt-Report.csv')
	crypto_guard = load_result_file('../results/CryptoGuard-Report.csv')
	java_mop = load_result_file('../results/summary.csv')
	print(ground_truth)
	print(cogni_crypt)
	print(crypto_guard)
	print(java_mop)