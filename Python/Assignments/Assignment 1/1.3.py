#swap 3 digit number
number = str(input("Enter a 3 digit number:"))

new_number = ""

for char in number:
    new_number = char + new_number
print(new_number)
