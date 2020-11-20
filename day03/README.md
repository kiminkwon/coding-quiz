## Day 3

### How to running Unittest

`python -m unittest test.py --v`

### If you don`t have unittest module

Run this command :  
`pip install unittest --user`  
or  
`python -m pip install unittest --user`

<br/><br/>

### Main Idea in each case : How to product in list
#### Solution #1

Using `list.pop()` and `while` loop

#### Solution #2

Using `numpy.prod` and `map()` function  
Warning : numpy.prod can be happened overflow of datatype (case of returning big-int)  
Solved : Specify dtype (like numpy.int64, numpy.float64 ...)

#### Solution #3

Using `functools.reduce` and `lambda` function in `map()`

#### Solution #4

Using `eval()` and `str.join()`

#### Solution #3 & #4 showed a little bit better speed.