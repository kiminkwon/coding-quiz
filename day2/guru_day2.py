
def countExceptFive(start,end):
    startToend=[]
    for i in range(start,end+1):
        num_str = str(i)
        isfive = False
        for j in range(len(num_str)) :
            if num_str[j] == '5':
                isfive =True
                continue

        if isfive == False:
            startToend.append(i)
        else :
            isfive=False
            continue
    print("number list = " , startToend )
    return len(startToend)

if __name__ == '__main__':

    print("length of the list : " ,countExceptFive(1,9))
    print("length of the list : ", countExceptFive(4,17))
    print("length of the list : ", countExceptFive(-25, -5))