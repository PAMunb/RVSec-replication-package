#!/bin/env python3

from collections import defaultdict
from yaml import safe_load
from flatten_dict import flatten
from flatten_dict.reducers import make_reducer
import os

def load_yaml_as_flat_dict(yaml_file):
    with open(yaml_file) as stream:
        return defaultdict(lambda: "", flatten(safe_load(stream), reducer=make_reducer(delimiter='.')))

def dict_to_csv(a_dict, key_filter):
    return ', '.join('"'+str(a_dict[key])+'"' for key in key_filter)

def iterate_over_files_with_extension(folder, extensions):
    for r, ds, fs in os.walk(folder):
        for fn in fs:
            if fn.endswith(extensions):
                yield os.path.join(r, fn)

def prepend_metadata_and_classname(csv_string, metadata):
    return '"' + metadata.split('/')[-1] + '", "' + csv_string.split(',')[0].split('/')[-1].split('.')[0] + '", ' + csv_string.replace('main/java/','').replace('/', '.').replace('.java', '')


if __name__ == '__main__':
    base_folder = './CamBench_Cap/src/main/java/org/cambench/cap/'
    extension = 'yaml'
    parameters = ['crypto-usage.location.file', 'crypto-usage.location.method', 'security.issue', 'capabilities']
    print('"metadata", "classname", "classpath", "method", "vulnerability", "capabilities"')
    for metadata_file in iterate_over_files_with_extension(base_folder, extension):
        print(prepend_metadata_and_classname(dict_to_csv(load_yaml_as_flat_dict(metadata_file), parameters), metadata_file))
