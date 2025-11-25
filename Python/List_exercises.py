#Exercise 1

#furnitures = ["chair", "table", "sofa", "shelf"]

#for furniture in furnitures:
    #if furniture == "sofa":
     #print(furniture)

#///////////////////////////////////////////////////


import random
#Exercise 2

thrownDiceNumbers = []

for i in range(5):
    thrownDiceNumbers.append(random.randint(1, 6))
    
    print(thrownDiceNumbers)

    total = sum(thrownDiceNumbers)
    print(total)

    highest = max(thrownDiceNumbers)
    print(highest)