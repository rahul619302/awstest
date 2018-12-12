package com.cg.aws.sns;

import com.amazonaws.services.sqs.AmazonSQSClient;
import com.cg.aws.util.Util;

public class SQS {

    private static AmazonSQSClient amazonSQSClient;

    static{
        amazonSQSClient=new AmazonSQSClient(Util.getAwsCredentials());
    }
}
