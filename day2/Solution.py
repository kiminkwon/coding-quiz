def solution1(start, end):
    answer = 0
    for num in range(start,end+1):
        if not str(num).count('5') == 1:
            answer += 1
    return answer

def solution2(start, end):
    answer_list = [1 for num in range(start,end+1) if not str(num).count('5') == 1]
    return sum(answer_list)