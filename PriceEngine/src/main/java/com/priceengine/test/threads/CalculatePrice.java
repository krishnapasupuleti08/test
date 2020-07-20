package com.priceengine.test.threads;

import com.priceengine.test.models.Cycles;
import com.priceengine.test.models.Parts;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class CalculatePrice implements Runnable{

    private final BlockingQueue<List<Parts>> queue;

    public CalculatePrice(BlockingQueue<List<Parts>> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            while(true) {
                List<Parts> parts = queue.take();
                calculateAndDisplayCyclePrice(parts);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

//    private void generatePartPrices(){
//        for()
//    }

    private void calculateAndDisplayCyclePrice(List<Parts> parts) throws InterruptedException {

        Cycles cycles = new Cycles();
        cycles.setParts(parts);
        BigDecimal price = BigDecimal.valueOf(0);
        for(Parts parts1 : parts){
            price = price.add(parts1.getPrice());
        }
        cycles.setPrice(price);
        System.out.println(cycles);
        Thread.sleep(100);
    }

}
