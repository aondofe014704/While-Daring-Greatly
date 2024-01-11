import math

def divide_or_square(number):
    # check if the number is divisible by 5
    if number % 5 == 0:
        # return the square root of the number
        return math.sqrt(number)
    else:
        # return the remainder of the number divided by 5
        return number % 5
