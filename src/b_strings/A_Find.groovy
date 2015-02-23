package b_strings

assert 'abcde'.find{ it > 'b' } == 'c' //first one found
assert 'abcde'.findAll{ it > 'b' } == ['c', 'd', 'e'] //all found
assert 'abcde'.findIndexOf{ it > 'c' } == 3 //first one found

assert 'abcde'.every{ it < 'g' }
assert ! 'abcde'.every{ it < 'c' }

assert 'abcde'.any{ it > 'c' }
assert ! 'abcde'.any{ it > 'g' }


