class Student:
    def __init__(self, rollno=0, studentName="", course="", marks=None):
        self.rollno = rollno
        self.studentName = studentName
        self.course = course
        self.marks = {} if marks is None else marks

    def __str__(self):
        marks_string = "\n".join([f"    - {subject}: {mark}" for subject, mark in self.marks.items()])
        return (
            f"\n----------------------------------\n"
            f"Roll No:      {self.rollno}\n"
            f"Student Name: {self.studentName}\n"
            f"Course:       {self.course}\n"
            f"Marks:\n{marks_string}")

    def has_failed(self, passing_mark=40):
        return any(mark < passing_mark for mark in self.marks.values())

def accept_student_data(student_list):
    print("\n--- Add a New Student ---")
    new_student = Student()
    new_student.rollno = int(input("Enter Roll Number: "))
    new_student.studentName = input("Enter Student Name: ")
    new_student.course = input("Enter Course: ")
    print("--- Enter marks for 5 subjects ---")
    for i in range(5):
        subject = input(f"Enter name for Subject {i+1}: ")
        mark = int(input(f"Enter marks for {subject}: "))
        new_student.marks[subject] = mark
    student_list.append(new_student)
    print("\nSuccessfully added the new student.")

def display_all(student_list):
    if not student_list:
        print("No student records found.")
        return
    for student in student_list:
        print(student)

def search_by_id(student_list):
    print("\n--- Search for a Student by Roll Number ---")
    if not student_list:
        print("No student records found.")
        return
    id_to_find = int(input("Enter the Roll Number to find: "))
    found = next((s for s in student_list if s.rollno == id_to_find), None)
    if found:
        print("\n--- Student Found ---")
        print(found)
    else:
        print(f"Sorry, no student with Roll Number {id_to_find} was found.")

def display_failed(student_list):
    print("\n--- Displaying Students Who Have Failed ---")
    if not student_list:
        print("No student records found.")
        return
    passing_mark = 40
    failed_list = [s for s in student_list if s.has_failed(passing_mark)]

    if not failed_list:
        print(f"No students have failed.")
    else:
        print(f"The following students have a mark below {passing_mark}:")
        for student in failed_list:
            print(student)

if __name__ == "__main__":
    student_records = [
        Student(101, "Alice", "Computer Science", {"Math": 85, "Physics": 92, "Data Structures": 78, "History": 88, "English": 95}),
        Student(102, "Bob", "Mechanical Engg", {"Thermo": 65, "Mechanics": 50, "Drawing": 75, "Math": 35, "Workshop": 80}),
        Student(103, "Charlie", "Civil Engg", {"Structures": 90, "Surveying": 81, "Geotech": 95, "Math": 88, "Fluids": 82})
    ]
    print("\nStudent Management System Menu")
    print("1. Accept New Student Data")
    print("2. Display All Students")
    print("3. Search by Roll No")
    print("4. Display Failed Students")
    print("5. Exit")
    
    while True:
        choice = int(input("\nEnter your choice (1-5): "))
        match choice:
            case 1:
                accept_student_data(student_records)
            case 2:
                display_all(student_records)
            case 3:
                search_by_id(student_records)
            case 4:
                display_failed(student_records)
            case 5:
                print("Exiting the program..")
                break
            case _:
                print("Invalid choice. Please enter a number between 1 and 5.")