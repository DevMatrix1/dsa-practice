import json
import sys
from difflib import get_close_matches


data = json.load(open('data.json'))

def printdef(result):
    if type(result) == list:
        for item in result:
            print(item)
    else:
        print(result)

      
while True:
    word = input("\nEnter a word : ").lower()
    print("\n")
    output = "none"

    if word in data:
        output = data[word]
        #print(data[word])
    elif len(get_close_matches(word, data.keys()))>0:
        state = input("\nDid you mean %s instead? Enter Y is yes , or N if no: " % get_close_matches(word, data.keys())[0])
        if state == "Y":
            output = data[get_close_matches(word, data.keys())[0]]
            print(data[get_close_matches(word, data.keys())[0]])
        elif state == "N":
            continue
    elif word == "-1":
        break
    else:
        output = "\nThe word doesn't exsist. Please check\n"
    printdef(output) 

sys.exit()
        
    
