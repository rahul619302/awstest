package com.cg.aws.controller;

import com.cg.aws.s3.S3;

public class Controller {

    public static void main(String[] args) {
        new S3().doS3RelatedJob();
    }
}
