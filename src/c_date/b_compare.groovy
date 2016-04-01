package c_date

    birthday = Date.parse('dd/MM/yyyy', '26/11/1975')
    assert birthday.toString() == "Wed Nov 26 00:00:00 IST 1975"

    assert birthday[Calendar.YEAR] == 1975
    assert birthday[Calendar.MONTH] == Calendar.NOVEMBER
    assert birthday[Calendar.DATE] == 26
    assert birthday[Calendar.DAY_OF_WEEK] == Calendar.WEDNESDAY


    otherDate = Date.parse('yyyy/MM/dd', '1975/11/30')

    assert otherDate > birthday
    assert (otherDate..<birthday).size() == 4


