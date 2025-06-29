package com.ruthvika;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: create mock object
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: inject mock into service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: verify result
        assertEquals("Mock Data", result);
    }
}
