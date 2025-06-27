package com.renwei.uz.lambda;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.renwei.uz.Application;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LambdaHandler implements RequestStreamHandler{

    @Generated
    private static final Logger log = LoggerFactory.getLogger(LambdaHandler.class);
    private static final SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        log.info("Handling Auth Lambda request with requestId: " + context.getAwsRequestId());
        handler.proxyStream(inputStream, outputStream, context);
        log.info("Completed handling Auth Lambda request with requestId: " + context.getAwsRequestId());
    }

    static {
        try {
            log.info("Initializing Auth Lambda Handler");
            handler = SpringBootLambdaContainerHandler.getAwsProxyHandler(Application.class, (String[])new String[0]);
            log.info("Auth Lambda Handler initialized successfully");
        }
        catch (ContainerInitializationException e) {
            log.error("Failed to initialize Auth Lambda Handler: " + e.getMessage());
            throw new RuntimeException("Could not initialize Spring Boot application for Auth", e);
        }
    }

}
