class Student:
    def __init__(self, studentid, sname, m1, m2, m3):
        self.studentid = studentid
        self.sname = sname
        self.m1 = m1
        self.m2 = m2
        self.m3 = m3
        self.gpa = self.calculate_gpa()

    def calculate_gpa(self):
        return (1/3) * self.m1 + (1/2) * self.m2 + (1/4) * self.m3

    def __str__(self):
        return (
            f"\n------------------------\n"
            f"ID:     {self.studentid}\n"
            f"Name:   {self.sname}\n"
            f"Marks:  M1={self.m1}, M2={self.m2}, M3={self.m3}\n"
            f"GPA:    {self.gpa:.2f}"
        )

def display_all(students):
    print("\n--- All Student Records ---")
    if not students: print("No student records found."); return
    for student in students: print(student)

def search_by_id(students):
    print("\n--- Search by Student ID ---")
    if not students: print("No records to search."); return
    id_to_find = int(input("Enter the student ID to find: "))
    found = next((s for s in students if s.studentid == id_to_find), None)
    if found:
        print(f"\n--- Student Found ---\n{found}")
    else:
        print(f"Sorry, no student with ID {id_to_find} was found.")

def search_by_name(students):
    print("\n--- Search by Student Name ---")
    if not students: print("No records to search."); return
    name_to_find = input("Enter the student name to find: ").lower()
    results = [s for s in students if name_to_find in s.sname.lower()]
    if not results:
        print(f"Sorry, no students found with the name '{name_to_find}'.")
    else:
        print(f"\n--- Found {len(results)} student(s) ---")
        for student in results: print(student)

def calculate_gpa_of_student(students):
    print("\n--- Calculate GPA of a Student ---")
    if not students: print("No records available."); return
    id_to_find = int(input("Enter the ID of the student to calculate GPA for: "))
    found = next((s for s in students if s.studentid == id_to_find), None)
    if found:
        print(f"\nThe GPA for {found.sname} (ID: {found.studentid}) is {found.gpa:.2f}")
    else:
        print(f"Sorry, no student with ID {id_to_find} was found.")

def main():
    student_records = [
        Student(101, "Harsh Chandrakar", 80, 70, 90),
        Student(102, "John Doe", 95, 85, 88),
        Student(103, "Peter Parker", 60, 75, 65),
        Student(104, "Miles Morales", 88, 92, 78),
        Student(105, "Bruce Wayne", 88, 92, 78)
    ]
    print("--- Sample student data has been loaded. ---")

    menu = """Student Information Menu

1. Display All Students
2. Search by ID
3. Search by Name
4. Calculate GPA of a Student
5. Exit                 """
    print(menu)
    
    actions = {
        1: display_all, 2: search_by_id, 3: search_by_name, 4: calculate_gpa_of_student
    }

    while True:
        choice = int(input("\nEnter your choice (1-5): "))
        if choice == 5:
            print("Exiting the program."); break
        
        action = actions.get(choice)
        if action:
            action(student_records)
        else:
            print("Invalid choice. Please enter a number between 1 and 5.")

if __name__ == "__main__":
    main()