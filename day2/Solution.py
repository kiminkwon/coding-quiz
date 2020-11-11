def solution1(start, end):
    answer = 0
    for num in range(start,end+1):
        if not str(num).count('5') > 0:
            answer += 1
    return answer

def solution2(start, end):
    answer_list = [1 for num in range(start,end+1) if not str(num).count('5') > 0]
    return sum(answer_list)

answer = 0
for num in range(-4, 20+1):
    if not str(num).count('5') > 0:
        print(num)
        answer += 1
print(answer)