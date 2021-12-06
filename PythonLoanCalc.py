# This section is the loan calculator portion
L = input("How much will you be borrowing? ")
L = float(L)
print(L)


N = input("How many years will you be paying this loan off? ")
N = float(N) *12
print(N)

I = input("What is the interest in percents that you will be paying? Ex, 10% = 10, 5% = 5, etc. ")
I = float(I)/100
print(I)

M = (L/N) + I*(L/N)

float(M) 
print("Your monthly payment will be: ")
print(M)