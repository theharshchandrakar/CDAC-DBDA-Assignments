import pprint
emp_data = {'Amol': ['C', 'C++', 'Java'],
            'Aditya': ['Angular', 'Java'],
            'Aditi': ['Python', 'PHP', 'Database']}
# 1.Find employees that know 'python'
for name,skills in emp_data.items():
    print ("Employee(s) that know Python:\n",name) if 'Python' in skills else False

# 2. Add a new skill - 'test' in skill set of all employees
for name in emp_data:
    emp_data[name].append('test')
print("\nAfter adding test in skills:")
pprint.pprint(emp_data)

# 3. Sort employees by skills
sorted_employees = sorted(emp_data.items(), key=lambda item: len(item[1]))
print("\nEmployees sorted by Skills:")
pprint.pprint(dict(sorted_employees))