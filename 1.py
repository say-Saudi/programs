'''
Situation:
I have a string, with spaces. 

Task:
Need to reverse it while keeping the space index same. 

Action:
I can store space indexes in a list and simultaneously store characters in a temp list.
Then I would run a loop in length of parent string and add space at stored space indexes and popped character from the temp list, at other positions. 
After adding from temp list, I'd pop the last element.

Result:
Done.
'''

test_str = "Sau Di waka r"

# Stores nonspace chars in a list 
chars = [ch for ch in test_str if ch != ' '] 

# Stores space indexes in a list
space_index = [i for i, ch in enumerate(test_str) if ch == ' ']

result = []
for i in range(len(test_str)):
    if i in space_index:
        result.append(" ")
    else:
        result.append(chars.pop())

print("".join(result))