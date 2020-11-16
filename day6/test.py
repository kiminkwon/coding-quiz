import unittest
import Solution
import datetime
from copy import deepcopy

test_case = [
    ([1, 1, 1, 2, 2, 3], 18),
    ([6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200], 4000000)
            ]


class Test(unittest.TestCase):
    def test1(self):
        print("\nSolution #1 Unittest")
        copy = deepcopy(test_case) ## Solution #1 has memory deletion
        for idx, case in enumerate(copy):
            start_time = datetime.datetime.now()
            self.assertEqual(Solution.solution1(case[0]), case[1])
            end_time = datetime.datetime.now()
            print(f"TestCase #{idx} : {end_time - start_time}")

if __name__ == '__main__':
    unittest.main()