package com.example.cos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cloud.objectstorage.services.s3.AmazonS3;
import com.ibm.cloud.objectstorage.services.s3.model.Bucket;

@RestController
public class CosController {

    @Autowired
    private AmazonS3 client;

    @RequestMapping("/listbuckets")
    public List<Bucket> isBucketAvailable() {
        return client.listBuckets();
    }
}
