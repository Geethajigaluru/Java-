#Q1
def positive_negative(numbers):
    positive=0
    negative=0
    for i in numbers:
        if i>0:
            positive=positive+1
        elif i<0:
            negative=negative+1
        else:
            print("Zero")
    print("Positive: ",positive)
    print("Negative: ",negative)
positive_negative(list(map(int, input().split())))

#Q2
def smallest(numbers):
    small=numbers[0]
    for i in numbers:
        if i<small:
            small=i
    print(small)
smallest(list(map(int, input().split())))

#Q3
def vowels_count(text):
    vowels=('a','e','i','o','u')
    vow=0
    for word in text:
        if word in vowels:
            vow=vow+1
    print(vow)
vowels_count(input())

#Q4
def reverse(sentence):
    l=sentence.split()
    result=""
    for word in l:
        result=result+word[::-1]+" "
    print(result)
reverse("Hello world")

#Q5
def second_largest(numbers):
    largest = numbers[0]
    sec_larg = numbers[0]

    for i in numbers:
        if i > largest:
            sec_larg = largest
            largest = i
        elif i > sec_larg and i != largest:
            sec_larg = i

    print(sec_larg)

second_largest(list(map(int, input().split())))

