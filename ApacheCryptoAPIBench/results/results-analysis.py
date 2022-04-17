import pandas as pd

output_header = ['project', 'profile', 'min', 'max', 'mean', 'median', 'std', 'overhead']
output = pd.DataFrame(columns=output_header)
df = pd.read_csv("results.csv")

analysed_projects = df.project.unique()

print(f"The following projects are present in the results file {analysed_projects}")
for idx, project in enumerate(analysed_projects):
    print(f'Calculating metrics for project {project}')
    data_without_agent = df.loc[(df['project'] == project) & (df['profile'] == 'original')]
    row = {'project': project, 'profile': 'original', 'min': data_without_agent['time'].min(),
           'max': data_without_agent['time'].max(),
           'mean': data_without_agent['time'].mean(), 'median': data_without_agent['time'].median(),
           'std': data_without_agent['time'].std(), 'overhead': '-'}
    output = output.append(row, ignore_index=True)
    data_with_agent = df.loc[(df['project'] == project) & (df['profile'] == 'mop')]
    overhead = 100 * (data_with_agent['time'].mean() - data_without_agent['time'].mean()) / (data_without_agent['time'].mean())

    row = {'project': project, 'profile': 'mop', 'min': data_with_agent['time'].min(),
           'max': data_with_agent['time'].max(),
           'mean': data_with_agent['time'].mean(), 'median': data_with_agent['time'].median(),
           'std': data_with_agent['time'].std(), 'overhead': overhead}
    output = output.append(row, ignore_index=True)
    output.to_csv('overhead-analysis.csv')

print(output)
