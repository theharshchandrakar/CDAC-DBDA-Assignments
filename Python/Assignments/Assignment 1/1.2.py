#inputs
start = int(input("Enter start no: "))
end = int(input("Enter end no: "))
print(f"Prime numbers between {start} and {end} :")

for number in range(start, end+1):
    if number>1:
        is_prime = True
        for i in range(2,number):
            if (number % i) == 0:
                is_prime = False
                break
        if is_prime     :
            print(number)
