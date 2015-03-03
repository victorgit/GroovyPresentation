package d_collections

    def list = [1,2,3,4]

    assert list.sum() == 10
    assert list.sum(100) == 110

    assert list.reverse() == [4,3,2,1]

    assert [1,2,2,2,2,2,3,3,4,5].unique() == [1,2,3,4,5]

    assert [1,2,2,2,2,2,3,3,4,5].count(2) == 5



    assert [1,6,12] == [1,2,4,6,8,10,12].intersect([1,3,6,9,12])







