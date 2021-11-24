package com.example;

import com.example.service.Service;
import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {
    
    private Service service = new Service();
    
    @Test
    public void selfNameTest() {
        String name = service.getSelfName();
        Assert.assertEquals("Service", name);
    }
}
