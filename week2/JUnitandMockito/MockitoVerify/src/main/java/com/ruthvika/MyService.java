package com.ruthvika;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData(); // This should be called, and we’ll verify it!
    }
}
