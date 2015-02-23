package b_strings

def longString = "one two three four"

def tokensList = longString.tokenize()
assert tokensList.class.name == 'java.util.ArrayList'
assert ['one', 'two', 'three', 'four'] == tokensList

def tokensArray = longString.split()
assert tokensArray instanceof String[]
assert ['one', 'two', 'three', 'four'] == tokensArray

def s1 = 'Java:Groovy'
assert ['Java', 'Groovy'] == s1.tokenize(":")

