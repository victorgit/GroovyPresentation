package a_groovysh

@Grab(group='commons-lang', module='commons-lang', version='2.6')
import org.apache.commons.lang.StringEscapeUtils

url = "/start2?utm_source=facebook&amp;utm_medium=cpc&amp;utm_campaign=ecommerce"
StringEscapeUtils.unescapeHtml(url)

