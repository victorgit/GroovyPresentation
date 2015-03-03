package d_collections

    def list = [1,2,3,4]

    def doubles = list.collect { it*2 }
    assert doubles == [2,4,6,8]

    assert list.find { it > 1 } == 2
    assert list.findAll { it > 1 } == [2, 3, 4]

    assert list.every { it < 5 }
    assert ! list.every { it < 2 }


    assert list.any { it > 2 }
    assert ! list.any { it > 6 }





