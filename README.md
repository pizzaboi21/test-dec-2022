# test-dec-2022
This is a simple Spring Boot program which is connected by PostgresQL.
I've also used the Testcontainers library for verifying my tests directly from the database.
Finally, I have written a Terraform script for the deployment of this Spring Boot application on AWS Lambda. Although I was successful in uploading my Lambda function to S3 bucket, I was not able to correctly point the Lambda function to the handler. { "StatusCode": 200, "FunctionError": "Unhandled", "ExecutedVersion": "$LATEST" }

