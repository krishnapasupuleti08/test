package com.priceengine.test.application;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.priceengine.test.models.InputData;
import com.priceengine.test.models.PartPrice;
import com.priceengine.test.models.PartPriceStorage;
import com.priceengine.test.models.Parts;
import com.priceengine.test.threads.CalculatePrice;
import com.priceengine.test.threads.GenerateCycle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PricingEngine {

    public static void main(String args[]){

        BlockingQueue<List<Parts>> queue = new ArrayBlockingQueue<>(10);

        PartPriceStorage partPriceStorage = new PartPriceStorage();
        List<InputData> inputDataList = new ArrayList<>();
        try
        {
            byte[] priceData = Files.readAllBytes(Paths.get("database.json")); // price storage
            PartPrice[] partPrices = null;

            ObjectMapper objectMapper = new ObjectMapper();
            partPrices = objectMapper.readValue(priceData, PartPrice[].class);
            List<PartPrice> partPriceList = Arrays.asList(partPrices);
            partPriceStorage.setPartPrices(partPriceList);

            byte[] userInputData = Files.readAllBytes(Paths.get("user-input.json")); // change user input here
            InputData[] inputData = null;
            ObjectMapper objectMapper1 = new ObjectMapper();

            inputData = objectMapper1.readValue(userInputData,InputData[].class);
            inputDataList =  Arrays.asList(inputData);

        }
        catch(JsonMappingException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }


        new Thread(new GenerateCycle(queue,inputDataList,partPriceStorage)).start();
        new Thread(new CalculatePrice(queue)).start();

    }
}
