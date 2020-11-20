import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
        ([1,2,3,4,3,2,1],3),
        ([20,10,-80,10,10,15,35],0),
        ([0],0)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy = deepcopy(test_case) 
        for idx, case in enumerate(copy):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0]),case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

if __name__ == '__main__':
    unittest.main()