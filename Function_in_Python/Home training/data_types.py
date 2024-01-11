# String data type
# Literal assignment

first = 'Jack'

last = 'Songu'

print(type(first))
print(type(first) == str)
print(isinstance(first, str))



# concatenation

fullname = first + " " + last
print(fullname)

fullname += "!"
print(fullname)

#casting a number to a string
decade = str(1980)
print(type(decade))
print(decade)

statement = "I love rock music form the " + decade + "s."

print(statement)


# multiple lines
#multiline = ... 
#Hey, how are you? 

#I was just checking in.

#		all good?
#...

#print(multiline)

#escape characters

sentence = 'I\'m back at work\tHey\n\nwhere\'s this at\\located?!'
print(sentence)

print(first)
print(first.lower())
print(first.upper())
print(first)

print(sentence.title())
print(sentence.replace("back", "Good"))
print(sentence)
