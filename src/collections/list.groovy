package collections

def list = [1,2,3,4]

assert 4 == list.size()
assert 4 == list.size
assert java.util.ArrayList == list.getClass()
assert ! []

list << 5
assert 5 == list.size()
assert 5 == list[4]

list + 6
assert 5 == list.size()

def newList = list + 6
assert 6 == newList.size()

newList = newList + [7,8]
assert 8 == newList.size()