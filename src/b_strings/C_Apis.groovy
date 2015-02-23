package b_strings


assert 'Hello Java' - 'Java' + 'Groovy' == 'Hello Groovy'
assert 'a' * 3 == 'aaa'

assert 'hello'.reverse() == 'olleh'
assert 'hello'.count('l') == 2

assert 'groovy is fun'.capitalize() == 'Groovy is fun'

assert ''.allWhitespace
assert ' \r\n '.allWhitespace
assert !'mrhaki'.allWhitespace

i = '201'
assert i.isInteger() && i.isLong() && i.isBigInteger()







