n = 10
fact = 1

for i in range(0,n+1):

    if i == 0:
        print(f"Factorial of 0 is 1")    #factorial of 0 is 1
    else:
        fact *= i
        print(f"Factorial of {i} is {fact}")