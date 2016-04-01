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
    assert i.toInteger() == 201
    assert i.toDouble() == 201.0

    // Remove first found numbers followed by a whitespace character.
    assert ('Line contains 20 characters' - ~/\d+\s+/) == 'Line contains characters'






