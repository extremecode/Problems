package com.nopopay;

import java.util.List;

public interface TopNInvestors {
    TopNInvestors add(Person person);
    List<String> get(int n);
}
