import unittest
import Solution
import datetime

test_case = [
        (1,9,8),
        (4,17,12),
        (1,90,72),
        (-4,20,23),
        (-4,37,38),
        (-14,-1,13),
        (-14,-6,9)
            ]

class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0], case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

    def test2(self):
        print("\nSolution #2 Unittest")
        for idx, case in enumerate(test_case):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution2(case[0], case[1]), case[2])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")
