# Q. 5. Create a infinite series on fib numbers and print first few
fib = [1,2]
for i in range(0,1000):              #avoiding infinite loop here using range
    fib.append(fib[i] + (fib[i+1]))
print(f"First few Fibonaci numbers:\n{fib[0:7]}")