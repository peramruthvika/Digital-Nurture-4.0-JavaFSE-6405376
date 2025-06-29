package com.ruthvika;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        System.out.println("🔧 Step 1: Creating mock ExternalApi object...");
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        System.out.println("🔧 Step 2: Injecting mock into MyService...");
        MyService service = new MyService(mockApi);

        System.out.println("🎬 Step 3: Calling service.fetchData()...");
        service.fetchData(); // This internally calls mockApi.getData()

        System.out.println("🔍 Step 4: Verifying if mockApi.getData() was called...");
        verify(mockApi).getData(); // ✅ Verifies interaction

        System.out.println("✅ Test completed successfully!");
    }
}
