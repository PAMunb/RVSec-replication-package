from json import load
import re


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

def precision(ground_truth, results):
	retrieved_results = ground_truth.keys() & results.keys()
	true_positives = sum(1 for bench in retrieved_results if ground_truth[bench][1] == 'true')
	return true_positives / len(retrieved_results)

def recall(ground_truth, results):
	retrieved_results = ground_truth.keys() & results.keys()
	true_positives = sum(1 for bench in retrieved_results if ground_truth[bench][1] == 'true')
	relevant_items = sum(1 for bench in ground_truth if ground_truth[bench][1] == 'true')
	return true_positives / relevant_items

def print_results(ground_truth_file, result_files):
	ground_truth = load_ground_truth('../ground_truth.csv', (327,328))
	print('Tool,Precision,Recall')
	for tool in result_files:
		results = load_result_file(result_files[tool])
		print(tool, end=',')
		print('%.2f'%precision(ground_truth,results), end=',')
		print('%.2f'%recall(ground_truth,results))

if __name__ == '__main__':
	ground_truth = '../ground_truth.csv'
	test_suites = {
		'cogni_crypt': '../results/CogniCrypt-Report.csv',
		'crypto_guard': '../results/CryptoGuard-Report.csv',
		'java_mop': '../results/summary.csv'}
	print_results(ground_truth, test_suites)