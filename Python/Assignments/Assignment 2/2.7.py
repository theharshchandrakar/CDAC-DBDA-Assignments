

print("Q.1")
employees = {
    'Amol' : ['C', 'C++', 'Java'],
    'Priya': ['Python', 'Java', 'SQL'],
    'Raj'  : ['JavaScript', 'HTML', 'CSS'],
    'Sunita': ['Java', 'Spring', 'Hibernate']
}
for name, skills in employees.items():
    print(f"Employee: {name} | SkilLs: {','.join(skills)}")

print("\n\nQ.2")
java_employee = []
for name, skills in employees.items():
    if "Java" in skills:
        java_employee.append(name)
print(f"Employees who know java : {java_employee}\n\n")

print("Q.3")
print("Skills before updating: ",employees['Priya'])
employees['Priya'].append("React")
print(f"Updated employee 'Priya'\nSkills: {employees['Priya']}")

print("\n\nQ.4")
print("Adding new Employee: 'Harsh'")
employees['Harsh'] = ['Python, Java, C++, SQL']
print("New employee: Harsh | Skills:",employees['Harsh'])

print("\nRemoving Employee: 'Amol'")
if 'Amol' in employees:
    del employees['Amol']
print("Dictionary after removing Amol:", employees)