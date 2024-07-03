import random
SCORE=0
def start(SCORE):
    num = random.randrange(1,100)
    flag = True
    i=0
    while i<5 and flag==True:
        guess = int(input("Guess the Number"))
        if guess>num:
            print("Too High")
        elif guess<num:
            print("Too Low")
        else:
            SCORE += 1
            print("Congrats you Guessed the Number Right \n Score: ",SCORE)
            flag=False
        i+=1
    if flag:
        print("Oops! You ran out of Chances \n The Correct Number is ",num)
    ans = input("Do You want to play Again(y/n): ")
    if ans == 'y' or ans== 'Y':
        print("\n\n")
        start(SCORE)
    else:
        print("Thanks for Playing.")
print("Guess the Number in 5 Chances \n Note: The number is Between 1 to 100.")
start(SCORE)