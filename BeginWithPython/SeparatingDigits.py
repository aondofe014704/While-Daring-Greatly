"""Separating the Digits in an integer"""

five_digits_number = int(input("Enter five digits number from 1 to 5"))


a = five_digits_number % 10

print(a)


a_rem = five_digits_number  // 10

print(a_rem)

b = a_rem % 10

print(b)

b_rem =  a_rem // 10

print(b_rem)

c = b_rem % 10

print(c)

c_rem = c_rem // 10

print(c_rem)

#d = c_rem % 10
#d_rem = d_rem // 10

#e = d_rem % 10
#e_rem = e_rem // 10

#f = e_rem % 10
#f_rem = f_rem // 10
