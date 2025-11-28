# Q.5. Write a Python program to compute element-wise sum of given tuples, using “zip()” function
# Original tuples:
t1 = (1, 2, 3, 4)
t2 = (3, 5, 2, 1)
t3 = (2, 2, 3, 1)
# Element-wise sum of the said tuples:

result = tuple(sum(s) for s in zip(t1, t2, t3))
print(f"tuple1:{t1}\ntuple2:{t2}\ntuple3:{t3}\nsum tuple : {result}")