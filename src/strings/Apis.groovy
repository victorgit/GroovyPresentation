package strings

assert 'hello, ' + 'balloon' - 'lo' == 'hel, balloon'
//'-' subtracts one instance at most of string
assert 'hello, balloon' - 'abc' == 'hello, balloon'
assert 'hello, '.plus('balloon').minus('lo') == 'hel, balloon'
//alternative method syntax
assert 'value is ' + true == 'value is true' &&
        'value is ' + 1.54d == 'value is 1.54' &&
        //first converts double to String (without info loss)
        'value is ' + 7 == 'value is 7' //we can add on various types of values
assert 7 + ' is value' == '7 is value'
assert 'telling true lies' - true == 'telling  lies' &&
        'week has 7 days' - 7 == 'week has  days'
//we can subtract various types of values
assert 'a' * 3 == 'aaa' && 'a'.multiply(3) == 'aaa'

assert 'hello'.reverse() == 'olleh'
assert 'hello'.count('l') == 2


