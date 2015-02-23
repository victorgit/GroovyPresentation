package d_collections

def list = [1,2,3,4]

assert 10 == list.sum()
assert 110 == list.sum(100)
assert 4 == list.max()
assert 1 == list.min()

assert 'a' == ['x','y','a','z'].min()

assert [1,2,3] == list - 4
assert 4 in list

assert [4,3,2,1] == list.reverse()

assert [1,2,3,4,5] == [1,2,2,2,2,2,3,3,4,5].unique()

assert 5 == [1,2,2,2,2,2,3,3,4,5].count(2)

assert [1,6,12] == [1,2,4,6,8,10,12].intersect([1,3,6,9,12])

assert [1,2,3].disjoint([4,6,9])

assert [1, 2, 3, 5, 6, 7, 9] == [6,3,9,2,7,1,5].sort()

['z','abc','321','Hello','xyzuvw'] ==
        ['abc','z','xyzuvw','Hello','321'].sort {it.size()}








