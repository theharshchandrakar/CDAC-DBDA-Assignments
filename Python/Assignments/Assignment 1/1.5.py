# (a + b) > c
# (a + c) > b
# (b + c) > a

#check if a triangle is valid

#inputs
a = int(input("Enter first side of Triangle: "))
b = int(input("Enter second side of Triangle: "))
c = int(input("Enter third side of Triangle: "))

if (a+b >c) and (a + c > b) and (b + c > a) == True:
    print("It is a valid Triangle.")
    if a == b == c:                                         #type of triangle
        print("It is an Equilateral Triangle")
    elif a == b or b == c or b == a:
        print("It is an Isosceles Triangle")
    else:
        print("It is an Scalene Triangle")
else:
    print("Its not a valid Triangle.")


