package c_date

def birthday = new Date().parse('dd/MM/yyyy', '26/11/1975')
assert "Wed Nov 26 00:00:00 IST 1975" == birthday.toString()

assert 1975 == birthday[Calendar.YEAR]
assert 10 == birthday[Calendar.MONTH]
assert Calendar.NOVEMBER == birthday[Calendar.MONTH]
assert 26 == birthday[Calendar.DATE]
assert Calendar.WEDNESDAY == birthday[Calendar.DAY_OF_WEEK]


def otherDate = new Date().parse('yyyy/MM/dd', '1975/11/30')

assert otherDate > birthday
assert 4 == (otherDate..<birthday).size()


