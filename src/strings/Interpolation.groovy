package strings

tableName = "EVENTS"
columns = "id, name, date, value"
bucketName = "my_bucket"
fileNameOnS3 = "my_file"
accessKey = "key"
accessSecret = "secret"
gzip = true

command = "copy "+tableName+" ("+columns+") from 's3://"+bucketName+"/"+fileNameOnS3+"'" + " CREDENTIALS aws_access_key_id="+accessKey+";aws_secret_access_key="+accessSecret+" gzip "+gzip
println command

command = String.format("copy %s (%s) from 's3://%s/%s' CREDENTIALS aws_access_key_id=%s;aws_secret_access_key=%s gzip %s",
        tableName, columns, bucketName, fileNameOnS3, accessKey, accessSecret, gzip)
println command

command = "copy $tableName ($columns) from 's3://$bucketName/$fileNameOnS3' CREDENTIALS aws_access_key_id=$accessKey;aws_secret_access_key=$accessSecret gzip $gzip"
println command