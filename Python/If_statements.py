# Teht1 and Teht2
number1 = 4
number2 = 3
number3 = 5

print(number1 == number2 == number3)
print(number1 == number2) or (number2 == number3)
print(number1 > number2) and (number1 > number3)

if number1 > number2:
    print("number1 is greater than number2")
elif number2 > number3:
    print("number2 is greater than number3")
else:
    print("Neither is true")

if number1 == number2:
    print("number1 is equal to number2")
elif number1 == number3:
    print("number1 is equal to number3")
else:
    print("Neither is true")

# Teht3
name1 = "Aleksi"
name2 = "Sami"
name3 = "Alina"

print("")
print("Teht3")
print(name1 == name2)
print(name1 != name2)

if name1 == name2:
    print("name1 is equal to name2")
elif name1 == name3:
    print("name1 is equal to name3")
else:
    print("Names arent same")
